package si413;

import java.util.List;
import java.util.ArrayList;

/** AST nodes for expressions.
 * Expressions can be evaluated and return a value.
 */
public interface Expr {
    /** Evaluates this AST node and returns the result. */
    Value eval(Interpreter interp);

    record StringLit(String value) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            return new Value.Str(value);
        }
    }

    record Var(String name) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            return interp.getEnv().lookup(name);
        }
    }

    record Concat(Expr lhs, Expr rhs) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            String lval = lhs.eval(interp).str();
            String rval = rhs.eval(interp).str();
            return new Value.Str(lval + rval);
        }
    }

    record Reverse(Expr child) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            String childVal = child.eval(interp).str();
            return new Value.Str(new StringBuilder(childVal).reverse().toString());
        }
    }

    record Input() implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            return new Value.Str(interp.readInputLine());
        }
    }

    record BInput(String trueString) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            return new Value.Bool(interp.readInputLine().equals(trueString));
        }
    }

    // ******* AST node types for expressions that return a Boolean ******** //

    record BoolLit(Boolean value) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            return new Value.Bool(value);
        }
    }

    record StrLess(Expr lhs, Expr rhs) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            String lval = lhs.eval(interp).str();
            String rval = rhs.eval(interp).str();
            return new Value.Bool(lval.compareTo(rval) < 0);
        }
    }

    record Contains(Expr lhs, Expr rhs) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            String lval = lhs.eval(interp).str();
            String rval = rhs.eval(interp).str();
            return new Value.Bool(lval.contains(rval));
        }
    }

    record And(Expr lhs, Expr rhs) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            Value left = lhs.eval(interp);
            if (left.bool()) return rhs.eval(interp);
            else return left;
        }
    }

    record Or(Expr lhs, Expr rhs) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            Value left = lhs.eval(interp);
            if (left.bool()) return left;
            else return rhs.eval(interp);
        }
    }

    record Not(Expr child) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            return new Value.Bool(!child.eval(interp).bool());
        }
    }

    /*** AST node types for functions  ***/
    record FuncCall(Expr id, List<Expr> args) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            Value.Closure closure = id.eval(interp).closure();
            interp.callFunction( closure );

            // have function def + frame now
            List<String> params = closure.getParams();

            // TODO: make sure param size + arg size match

            Frame env = interp.getEnv();

            for(int i = 0; i < args.size(); i++) {
                String param = params.get(i);
                Expr arg = args.get(i);

                env.assign( param, arg.eval(interp) );
            }

            closure.func().body().exec(interp);
            
            Value result = closure.func().returnVal().eval(interp); // * important * <-- this str can never be a valid match for VARNAME
            
            // System.out.println("Result value: " + result);

            interp.returned();

            return result;
        }
    }

    record Lambda(List<String> params, Stmt body, Expr returnVal) implements Expr {
        @Override 
        public Value eval(Interpreter interp) {
            Value.Closure closure = new Value.Closure(new Stmt.FuncDef("lambda", params, body, returnVal), interp.getEnv());
            return closure;
        }
    }

    record Number (Expr valueExpr) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            return new Value.Number( valueExpr.eval(interp).number() );
        }
    }

    record NumberLit (String value) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            String strNum = value.substring(2, value.length()-1);

            Value.Number num;
            if(strNum.contains(".")) {
                num = new Value.Number(Double.valueOf(strNum));
            } else {
                num = new Value.Number(Integer.valueOf(strNum));
            }
            return num;
        }
    }

    record MathBinOp(String op, Expr lhs, Expr rhs) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            Value left = lhs.eval(interp);
            Value right = rhs.eval(interp);
            if(op.equals("add")) {
                return Value.Number.add(left, right);
            } else if (op.equals("minus")) {
                return Value.Number.minus(left, right);
            } else if (op.equals("mul")) {
                return Value.Number.mul(left, right);
            } else if (op.equals("div")) {
                return Value.Number.div(left, right);
            } else if (op.equals("lt")) {
                return Value.Number.lt(left, right);
            } else if (op.equals("gt")) {
                return Value.Number.gt(left, right);
            } else if (op.equals("lte")) {
                return Value.Number.lte(left, right);
            } else if (op.equals("gte")) {
                return Value.Number.gte(left, right);
            } else if (op.equals("eq")) {
                return Value.Number.eq(left, right);
            }
            else {
                return Errors.error(String.format("Unsupported math operation '%s'", op));
            }
        }
    }

    record Negate (Expr expr) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            return Value.Number.neg( expr.eval(interp) );
        }
    }
}
