package si413;

public class StrValue implements Value {
    private String value;

    StrValue() { value = ""; }
    StrValue(String s) { value = s; }

    public Value.Type getType() { return Value.Type.string; }
    public String getValue() { return value; }
    public String toString() { return value; }
}
