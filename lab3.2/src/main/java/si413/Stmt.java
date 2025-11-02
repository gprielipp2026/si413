package si413;

import java.util.List;

/** AST nodes for statements.
 * Statements can be executed but do not return a value.
 */
public interface Stmt {
    /** Executes this AST node in an interpreter. */
    void exec(Interpreter interp);

    /** Compiles this AST node.
     * The Compiler instance comp is used to store shared state
     * of the running compiler, such as the destination output stream.
     */
    void compile(Compiler comp);

    // ******** AST Node types for statements ******** //

    record Block(List<Stmt> children) implements Stmt {
        @Override
        public void exec(Interpreter interp) {
            for (Stmt child : children) {
                child.exec(interp);
            }
        }

        @Override
        public void compile(Compiler comp) {
            for (Stmt child: children) {
                child.compile(comp);
            }
        }
    }

    record ExprStmt(Expr<?> child) implements Stmt {
        @Override
        public void exec(Interpreter interp) {
            child.eval(interp);
        }

        @Override
        public void compile(Compiler comp) {
            child.compile(comp);
        }
    }

    record AssignString(String name, Expr<String> child) implements Stmt {
        @Override
        public void exec(Interpreter interp) {
            String val = child.eval(interp);
            interp.getStringVars().put(name, val);
        }

        @Override
        public void compile(Compiler comp) {
            String val = comp.maybeDup(child.compile(comp));

            // if(comp.containsStrVar(name)) {
            // String var = comp.getVar(name, true);
            // comp.dest().format(" call void @free(ptr %s)\n", var);
            // // comp.reassign(name);
            // }

            // String size = comp.nextRegister();
            // comp.dest().format(" %s = call i32 @strlen(ptr %s)\n", size, val);
            // String plus1 = comp.nextRegister();
            // comp.dest().format(" %s = add i32 %s, 1\n", plus1, size);

            // String var = comp.getVar(name, true);
            // comp.dest().format(" %s = call ptr @malloc(i32 %s)\n", var, plus1);

            // comp.dest().format(" call i32 @strcpy(ptr %s, ptr %s)\n", var, val);
            // // add null terminator
            // String end = comp.nextRegister();
            // String off = comp.nextRegister();
            // comp.dest().format(" %s = sext i32 %s to i64", off, size);
            // comp.dest().format(" %s = getelementptr i8, ptr %s, i64 %s", end, var, off);
            // comp.dest().format(" store i8 0, ptr %s", end);

            if(comp.containsStrVar(name)) {
                String var = comp.getVar(name, true);
                comp.dest().format("  call void @reassign(ptr %s, ptr %s)\n", var, val);
            } else {
                String var = comp.getVar(name, true);
                comp.dest().format("  %s = call ptr @assign(ptr %s)\n", var, val);
            }

            comp.free(List.of(val));
        }
    }

    record AssignBool(String name, Expr<Boolean> child) implements Stmt {
        @Override
        public void exec(Interpreter interp) {
            boolean val = child.eval(interp);
            interp.getBoolVars().put(name, val);
        }

        @Override
        public void compile(Compiler comp) {
            String valReg = child.compile(comp);

            if(comp.containsBoolVar(name)) {
                String var = comp.getVar(name, false);

                comp.dest().format("  store i1 %s, ptr %s\n", valReg, var);
            } else {
                String reg = comp.getVar(name, false);
                comp.dest().format("  %s = alloca i1\n", reg);
                comp.dest().format("  store i1 %s, ptr %s\n", valReg, reg);
            }
        }
    }

    record PrintString(Expr<String> child) implements Stmt {
        @Override
        public void exec(Interpreter interp) {
            System.out.println(child.eval(interp));
        }

        @Override
        public void compile(Compiler comp) {
            String chreg = comp.maybeDup(child.compile(comp));

            comp.dest().format("  call i32 @puts(ptr %s)\n", chreg);

            comp.free(List.of(chreg));
        }
    }

    record PrintBool(Expr<Boolean> child) implements Stmt {
        @Override
        public void exec(Interpreter interp) {
            if (child.eval(interp)) System.out.println("True");
            else System.out.println("False");
        }

        @Override
        public void compile(Compiler comp) {
            String chreg = child.compile(comp);
            comp.dest().format("  call void @print_bool(i1 %s)\n", chreg);
        }
    }

    record IfElse(Expr<Boolean> condition, Stmt ifBody, Stmt elseBody) implements Stmt {
        @Override
        public void exec(Interpreter interp) {
            if (condition.eval(interp)) {
                ifBody.exec(interp);
            }
            else {
                elseBody.exec(interp);
            }
        }

        @Override
        public void compile(Compiler comp) {
            /**
             *   code ...
             * if_x:
             *   code ...
             * else_x:
             *   code ...
             * done_x:
             *   code ...
             */
            int x = comp.newBlock();

            String cond = condition.compile(comp);
            comp.dest().format("  br i1 %s, label %%if_%d, label %%else_%d\n", cond, x, x);

            // if code block
            comp.dest().format("\nif_%d:\n", x);
            ifBody.compile(comp);
            comp.dest().format("  br label %%done_%d\n", x);

            // else code block
            comp.dest().format("\nelse_%d:\n", x);
            elseBody.compile(comp);
            comp.dest().format("  br label %%done_%d\n", x);

            // done label
            comp.dest().format("\ndone_%d:\n", x);
        }
    }

    record While(Expr<Boolean> condition, Stmt body) implements Stmt {
        @Override
        public void exec(Interpreter interp) {
            while (condition.eval(interp)) {
                body.exec(interp);
            }
        }

        @Override
        public void compile(Compiler comp) {
            /**
             *   code ...
             * cond_x:
             *   code ...
             * loop_x:
             *   code ...
             * done_x:
             *   code ...
             */

            int x = comp.newBlock();
            // terminate the previous block
            comp.dest().format("  br label %%cond_%d\n", x);

            // cond block
            comp.dest().format("\ncond_%d:\n", x);
            String cond = condition.compile(comp);
            comp.dest().format("  br i1 %s, label %%loop_%d, label %%done_%d\n", cond, x, x);

            // loop block
            comp.dest().format("\nloop_%d:\n", x);
            body.compile(comp);
            comp.dest().format("  br label %%cond_%d\n", x);

            // done block
            comp.dest().format("\ndone_%d:\n", x);
        }
    }
}
