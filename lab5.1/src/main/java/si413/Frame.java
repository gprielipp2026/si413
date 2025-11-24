package si413;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

/** This represents a single frame, but it is INCOMPLETE.
 * It doesn't have any parent frame or the logic to look up / reassign
 * bindings in the parent frames, which is needed for proper lexical scoping.
 * YOU WILL HAVE TO MODIFY THIS to get things to work!
 */
public class Frame {
    private static int frameCount = 0;
    private int frameID;
    private Map<String, Value> bindings = new HashMap<>();
    private Frame parent = null;

    public Frame() {
        frameID = frameCount++;
    }

    public Frame(Frame parent) { this.parent = parent; frameID = frameCount++;}

    public Value lookup(String name) {
        if (bindings.containsKey(name)) return bindings.get(name);
        else if (parent != null) return parent.lookup(name);
        else return Errors.error(String.format("No binding found for %s in current environemnt", name));
    }

    public boolean exists(String name) {
        if(parent == null) return bindings.containsKey(name);
        return bindings.containsKey(name) || parent.exists(name);
    }

    public void assign(String name, Value val) {
        if (!this.bubble_assign(name, val)) {
            bindings.put(name, val);
        }
    }

    private boolean bubble_assign(String name, Value val) {
        if(parent == null) return false;
        else if( bindings.containsKey(name) ) {
            bindings.put(name, val);
            return true;
        } else 
            return parent.bubble_assign(name, val);
    }

    public String toString() {
        return String.format("Frame#%d", frameID);
    }

    public Frame getParent() { return parent; }
}
