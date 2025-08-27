import java.io.Reader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class MySol {


  public static void main(String[] args) throws IOException
  {
    if(args.length < 1) {
      System.err.println("Need a filepath as an argument");
      System.exit(1);
    }

    String test = "newline \n in a qoute";

    String filepath = args[0];
    File file = new File(filepath); 
    Reader fileReader = new FileReader(file);
    List<String> stringLiterals = new ArrayList<>();

    boolean openQoute = false;
    String literal = new String();
    char c;
    while( (c = (char)fileReader.read()) != (char)(-1))
    {
      if(c == '\n')
      {
        literal = new String();
        openQoute = false;
      }

      if(c == '"')
      {
        if(openQoute)
        {
          stringLiterals.add( literal );
          literal = new String();
          openQoute = false;
        }
        else
        {
          openQoute = true;
        }
      }
      else if (openQoute)
      {
        literal += c;
      }
    }

    System.out.println("Literals found:");
    for(String s : stringLiterals)
    {
      System.out.println(s);
    }
  }
}
