package si413;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

/** AST nodes for statements.
 * Statements can be executed but do not return a value.
 */
public interface Stmt {
    /** Executes this AST node in an interpreter. */
    void exec(Interpreter interp);

    // ******** AST Node types for statements ******** //

    record Block(List<Stmt> children) implements Stmt {
        @Override
        public void exec(Interpreter interp) {
            for (Stmt child : children) {
                child.exec(interp);
            }
        }
    }

    record ExprStmt(Expr child) implements Stmt {
        @Override
        public void exec(Interpreter interp) {
            Value result = child.eval(interp);

            // this seems to be only used in return statements
            interp.getEnv().assign("__$return__", result);
        }
    }


    record Assign(String name, Expr child) implements Stmt {
        @Override
        public void exec(Interpreter interp) {
            Value val = child.eval(interp);
            interp.getEnv().assign(name, val);
        }
    }

    record Print(Expr child) implements Stmt {
        @Override
        public void exec(Interpreter interp) {
            System.out.println(child.eval(interp));
        }
    }

    record IfElse(Expr condition, Stmt ifBody, Stmt elseBody) implements Stmt {
        @Override
        public void exec(Interpreter interp) {
            if (condition.eval(interp).bool()) {
                ifBody.exec(interp);
            }
            else {
                elseBody.exec(interp);
            }
        }
    }

    record While(Expr condition, Stmt body) implements Stmt {
        @Override
        public void exec(Interpreter interp) {
            while (condition.eval(interp).bool()) {
                body.exec(interp);
            }
        }
    }

    record FuncDef(String name, List<String> params, Stmt body, Expr returnVal) implements Stmt {
        @Override
        public void exec(Interpreter interp) {
            Value.Closure closure = new Value.Closure(this, interp.getEnv());

            interp.declareFunction(name, closure);
        }
    }

    record Read() implements Stmt {
        @Override
        public void exec(Interpreter interp) {
            Frame env = interp.getEnv();

            String filename = env.lookup("filename").str();

            try {
                Scanner scanner = new Scanner(new File(filename)).useDelimiter("\\Z");
                String data = scanner.next();
                Value result = new Value.Str(data);
                env.assign("return", result);
                scanner.close();
            } catch (FileNotFoundException e) {
                // TODO: handle exception
                Errors.error(String.format("File '%s' could not be opened", filename));
            }
        }
    }

    record Plus() implements Stmt {
        @Override
        public void exec(Interpreter interp) {
            Frame env = interp.getEnv();

            Integer a = Integer.parseInt(env.lookup("a").str());
            Integer b = Integer.parseInt(env.lookup("b").str());

            Value result = new Value.Str( String.valueOf(a + b) );

            env.assign("return", result);
        }
    }
} 
