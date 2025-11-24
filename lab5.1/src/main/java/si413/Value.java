package si413;

import java.util.List;

/** Holds a generic Value that can be either a string or a boolean.
 * To make a string, create an instance of Value.Str("like this").
 * To make a bool, create an instance of Value.Bool(true||false)
 * To convert a Value object to an actual String or bool, call str() or bool().
 */
public interface Value {
    default String str() {
        return Errors.error(String.format("Value type error: Expected string, got %s", toString()));
    }

    default boolean bool() {
        return Errors.error(String.format("Value type error: Expected boolean, got %s", toString()));
    }

    default Closure closure() { 
        return Errors.error(String.format("Value type error: Expected Closure, got %s", toString()));
    }

    default java.lang.Number number() {
        return Errors.error(String.format("Value type error: Expected Number, got %s", toString()));
    }

    record Str(String value) implements Value {
        @Override
        public String str() { return value; }

        @Override
        public String toString() { return value; }

        @Override
        public java.lang.Number number() {
            try {
                if(value.contains(".")) {
                    return Double.valueOf(value);
                } else {
                    return Integer.valueOf(value);
                }
            } catch (Exception e) {
                // TODO: handle exception
                return Errors.error(String.format("Value type error: Expected Number, got %s", toString()));
            }
        }
    }

    record Bool(Boolean value) implements Value {
        @Override
        public boolean bool() { return value; }

        @Override
        public String toString() {
            return value ? "True" : "False";
        }

        @Override
        public java.lang.Number number() {
            return Integer.valueOf(value ? 1:0);
        }
    }

    record Closure(Stmt.FuncDef func, Frame parentFrame) implements Value {
        @Override
        public Closure closure() {
            return this;
        }

        @Override
        public String toString() {
            return "closure for " + func.name() + "()";
        }

        public Frame getEnv() { return parentFrame; }
        public List<String> getParams() { return func.params(); }
    }

    record Number(java.lang.Number value) implements Value {
        @Override
        public java.lang.Number number() { return value; }

        @Override
        public String str() { return value.toString(); }

        @Override
        public boolean bool() { return value.doubleValue() > 0; }

        public static Value add(Value lhs, Value rhs) {
            return new Number( lhs.number().doubleValue() + rhs.number().doubleValue() );
        }

        public static Value minus(Value lhs, Value rhs) {
            return new Number( lhs.number().doubleValue() - rhs.number().doubleValue() );
        }

        public static Value div(Value lhs, Value rhs) {
            return new Number( lhs.number().doubleValue() / rhs.number().doubleValue() );
        }

        public static Value mul(Value lhs, Value rhs) {
            return new Number( lhs.number().doubleValue() * rhs.number().doubleValue() );
        }

        public static Value lt(Value lhs, Value rhs) {
            return new Bool( lhs.number().doubleValue() < rhs.number().doubleValue() );
        }

        public static Value gt(Value lhs, Value rhs) {
            return new Bool( lhs.number().doubleValue() > rhs.number().doubleValue() );
        }

        public static Value lte(Value lhs, Value rhs) {
            return new Bool( lhs.number().doubleValue() <= rhs.number().doubleValue() );
        }

        public static Value gte(Value lhs, Value rhs) {
            return new Bool( lhs.number().doubleValue() >= rhs.number().doubleValue() );
        }

        public static Value eq(Value lhs, Value rhs) {
            return new Bool( lhs.number().doubleValue() == rhs.number().doubleValue() );
        }

        public static Value neg(Value lhs) {
            return new Number( -lhs.number().doubleValue() );
        }

    }
}
