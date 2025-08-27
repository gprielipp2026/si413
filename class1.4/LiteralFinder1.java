import java.io.Reader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class LiteralFinder1 {
    static List<String> getLiterals(String fname) throws IOException {
        Reader source = new FileReader(fname);
        List<String> literals = new ArrayList<>();

        // note, -1 is returned at EOF
        for (int gotRaw = source.read(); gotRaw != -1; gotRaw = source.read()) {
            char got = (char)gotRaw;
            if (got == '"') {
                // found one
                StringBuilder sb = new StringBuilder();
                // read inner characters until the matching "
                while (true) {
                    //char inner = (char)source.read();
                    int innerRaw = source.read();
                    assert (innerRaw != -1);
                    char inner = (char)innerRaw;
                    if (inner == '"') break;
                    sb.append(inner);
                }
                literals.add(sb.toString());
            }
        }

        return literals;
    }


    public static void main(String[] args) throws IOException {
        String fname = args[0];
        System.out.format("literals in %s:\n", fname);
        for (String literal : getLiterals(fname)) {
            System.out.format("  |%s|\n", literal);
        }
    }
}