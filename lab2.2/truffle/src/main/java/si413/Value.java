package si413;

public interface Value {
    static enum Type { string, bool };
    
    Type getType();
    Object getValue();
} 
