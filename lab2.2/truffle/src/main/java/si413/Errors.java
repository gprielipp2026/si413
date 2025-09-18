package si413;

import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;

/** Contains static methods for error handling. */
public class Errors {
    /** Prints the error message and aborts with exit code 7. */
    public static void abort(String message) {
        System.err.format("ERROR: %s\n", message);
        System.err.println("Aborting the interpreter");
        System.exit(7);
    }

    /** Prints an error message for a syntax error. */
    public static void syntax(String parent, String source, int line, int col, String msg) {
        abort(String.format("SYNTAX ERROR in %s from line %d column %d of %s: %s",
                            parent, line, col, source, msg));
    }

    /** Static method to make an ANTLR lexer or parser abort on failure.
     * By default ANTLR will continue trying to parse even after a syntax
     * error is found, but we want it to crash immediately.
     */
    public static void register(Recognizer<?,?> parser) {
        parser.removeErrorListeners();
        parser.addErrorListener(new Listener());
    }

    public static class Listener extends BaseErrorListener {
        @Override
        public void syntaxError(
                Recognizer<?,?> recognizer,
                Object offendingSymbol,
                int line,
                int charPositionInLine,
                String msg,
                RecognitionException e)
        {
            Errors.syntax(
                recognizer.getClass().getSimpleName(),
                recognizer.getInputStream().getSourceName(),
                line,
                charPositionInLine,
                msg);
        }
    }
}
