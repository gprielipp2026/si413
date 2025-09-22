package si413;

public class BoolValue implements Value {
    private Boolean value;

    public BoolValue() { value = false; }
    public BoolValue(Boolean b) { value = b; }

    public Value.Type getType() { return Value.Type.bool; }
    public Boolean getValue() { return value; }
    public Boolean negate() { return !value; }
}
