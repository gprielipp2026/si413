/**
 * George Prielipp (265112)
 *
 * Compiler for "streamLine"
 *
 * v0.1.0
 *
 * minor version correlated to what step in Task I have reached
 */

import java.util.*;
import java.io.*;


public class Compiler {
  private char curChar;
  private FileReader fileReader;
  private boolean eof;
  private boolean doAdvance;
  private Scanner inputScanner;
  private PrintWriter outputFile;
  private List<String> literals;

  /** 
   * Create the fileReader and set up tracking vars
   */
  public Compiler(String filename, String outputFN)
  {
    File file = new File(filename);
    File output = new File(outputFN);
    try {
      fileReader = new FileReader(file);
      eof = false;
      doAdvance = true;

      // initialize the outputWriter
      outputFile = new PrintWriter(output);
    } catch(FileNotFoundException e) {
      System.err.println("[ERROR] File not found: '" + filename + "'");
      System.exit(7);
    }

    literals = new ArrayList<>();

    inputScanner = new Scanner(System.in);  
    inputScanner.useDelimiter("\n");
  }

  // read in the next character and store it in curChar
  // set eof if the end of the file has been reached
  private void advance()
  {
    if (!doAdvance) { doAdvance = true; return; }
    // cannot read past the end of the file
    try {
      int val = fileReader.read();

      // check if the end of the file has been reached
      if(val == -1) {
        eof = true; 
        return;
      }

      curChar = (char)val;
      //System.err.println("[DEBUG] curChar = " + curChar);
    } catch (IOException e) {
      System.err.println("[ERROR] " + e.getMessage());
      System.exit(1);
    }
  }


  /**
   * Print statement reached
   */
  private void interpretPrint()
  {
    // d*(STRING)*b

    Stack<Character> toMatch = new Stack<>();
    // add the chars to match
    for (Character c : (new String("b*)(*d")).toCharArray())
      toMatch.push(c);

    String printString = "";
    while(!eof && !toMatch.empty())
    {
      // make sure the correct form is matched
      if(curChar == toMatch.peek()) 
        toMatch.pop();
      else if(curChar == '[')
      {
        printString = interpretString(); 
      }
      else if (curChar == ']')
      {
        printString = interpretReverseString();
      }
      else if(curChar == ' ' || curChar == '\t')
      {
        // do nothing - let it advance  
      }
      else if(curChar == '~')
      {
        // handle string concatenation
        String nextString = interpretConcat();
        printString = printString + nextString;
      }
      else
      {
        // it is not following the format
        System.err.println("[ERROR] print statement is using the wrong form");
        System.exit(7);
      }

      advance();
    }

    // successfully interpretted a print statement
    // System.out.println(printString);
    // need to output a puts command that will execute
    literals.add(printString);
    outputFile.println(String.format("call i32 @puts(ptr @lit%d)", literals.size()-1 ));
  }

  /**
   * Interpret a string literal
   */
  private String interpretString()
  {
    // read until a ']' or '\n' is found
    // a '\n' before a ']' will throw an error for no close bracket found
    String string = new String();

    while(!eof)
    { 
      // grab the next char
      advance();

      // catch any weird cases (exit cases)
      if(curChar == '\n')
      {
        System.err.println("[ERROR] close bracked not found for string literal");
        System.exit(7);
      }
      // do not handle special characters yet
      else if(curChar == ']')
      {
        break; // found the end of the string        
      }
      // see if an input is in the string
      else if(curChar == '_')
      {
        string += interpretInput();
      }
      else if(curChar == '$')
      {
        string += interpretSpecialPhrase();
      }
      else{
        // add the character to the string
        string += curChar;
      } 
    }

    return string;
  }

  /**
   * Grab user input and return it as a string
   */
  private String interpretInput()
  {
    int count = 0;
    // read in the full input type
    while(!eof && curChar == '_')
    {
      count++;
      advance();
    } 

    // make sure the format was right
    // TODO; refactor this - not sure this is right
    if (count != 3)
    {
      System.err.println("[ERROR] input string is not correct");
      System.exit(7);
    }

    // it was good - need to read the curChar again wherever this was called from
    doAdvance = false;

    // get the user's input
    return inputScanner.next();
  }

  /**
   * Check to make sure this is truly a comment
   * - if it is: handle it (aka ignore it to the newline char)
   * - if it is not: keep the curChar
   */
  private void interpretComment()
  {
    // I know curChar is '-', let's see if the next is '>'
    advance();

    if (curChar != '>')
    {
      // not a comment
      doAdvance = false;
      return;
    }

    // read to the end of the line otherwise
    while(!eof && curChar != '\n')
      advance();

  }

  /**
   * Look for the next string literal and return it
   */
  private String interpretConcat()
  {
    // move past the '~'
    if(curChar == '~')
      advance();

    // ignore whitespace
    while (!eof && (curChar == ' ' || curChar == '\t'))
      advance();

    // found the string
    if (curChar == '[')
    {
      return interpretString();
    }
    else if(curChar == ']')
    {
      return interpretReverseString();
    }
    else if(curChar == '$')
    {
      return interpretSpecialPhrase();
    }
    else
    {
      System.err.println("[ERROR] expected a string after a '~' (concat operator)");
      System.exit(7);
    }
    // should never hit here
    return "";
  }

  /**
   * Look for the end of the special phrase
   *
   * looking for regex of ($+)___ or ($+)]
   */
  private String interpretSpecialPhrase() {
    String phrase = new String();
    
    int numUnderscores = 0;
    while(!eof)
    {
      advance();
      
      if (curChar == '$' || curChar == '_')
      {
        // do all underscores need to be special phrases or just ___ (3_)?
        phrase += curChar;
        if(curChar == '_')
          numUnderscores ++;
      }
      else if(curChar == ']')
      {
        phrase += curChar;
        break;
      }
      else
      {
        // I'm not sure what would error
        doAdvance = false;
        break;
      }
    }
  
    // could have an error if too many or not enough _
    if(numUnderscores > 0 && numUnderscores != 3)
    {
      System.err.println("Special phrase has a mismatch of underscores");
      System.exit(7);
    }
      
    if(phrase.length() == 0) phrase = "$"; // did not actually read in stuff

    return phrase;
  }

  /**
   * Handle reversing a string
   */
  private String interpretReverseString()
  {
    String string = new String();

    // loop through the input in search of the closing bracket
    boolean readStringLit = false;
    while(!eof)
    {
      advance();
      
      if(curChar == '[')
      {
        // found the end;
        if(readStringLit)
          break;
        else
        {
          readStringLit = true;
          String literal = interpretString();
          for(char c : literal.toCharArray())
          {
            string = c + string;
          }
        }
      }
      else if(curChar == '_')
      {
        String toReverse = interpretInput();
        for(char c : toReverse.toCharArray())
        {
          string = c + string;
        }
      }
      else if (curChar == '$') {
        String specialPhrase = interpretSpecialPhrase();
        for(char c : specialPhrase.toCharArray())
        {
          string = c + string;
        }
      }
      else if (curChar == '\n')
      {
        // expected to find the end of the string
        System.err.println("[ERROR] expected a '[' to go with the reversed string");
        System.exit(7);
      }
      else
      {
        // reverse the string
        string = curChar + string;
      }
    }

    return string;
  }

  /**
   * Put the preamble into the output file
   * target_triple
   * function declarations
   * main function
   */
  private void emitPreamble() {
    // define the target machine
    outputFile.println("target triple = \"x86_64-pc-linux-gnu\"");
    outputFile.println();

    // define custom functions here
    outputFile.println("declare i32 @puts(ptr noundef)");
    outputFile.println("declare i64 @strlen(ptr noundef)");
    outputFile.println("declare noalias noundef ptr @malloc(i64 noundef) local_unnamed_addr");
    outputFile.println("declare ptr @strcpy(ptr noalias noundef returned writeonly, ptr noalias nocapture noundef readonly) local_unnamed_addr");
    emitFunctionDeclarations();
    outputFile.println();

    // main function start
    outputFile.println("define i32 @main() {");
  }

  /**
   * LLVM IR concat function
   */
  private void emitConcatDeclaration() {
    outputFile.println();
    outputFile.println("define noundef ptr @concat(ptr noundef readonly %a, ptr noundef readonly %b) {");

    String[] func = {
      "%alen = tail call i64 @strlen(ptr noundef nonnull dereferenceable(1) %a)",
      "%alen32 = trunc i64 %alen to i32",
      "%blen = tail call i64 @strlen(ptr noundef nonnull dereferenceable(1) %b)",
      "%blen32 = trunc i64 %blen to i32",
      "%ablen = add nsw i32 %blen32, %alen32",
      "%clen = add nsw i32 %ablen, 1",
      "%clen64 = sext i32 %clen to i64",
      "%c = tail call noalias ptr @malloc(i64 noundef %clen64)",
      "%ca = tail call ptr @strcpy(ptr noundef nonnull dereferenceable(1) %c, ptr noundef nonnull dereferenceable(1) %a)",
      "%c_offset_a = shl i64 %alen, 32",
      "%c_offset = ashr exact i64 %c_offset_a, 32",
      "%ca_ptr = getelementptr inbounds i8, ptr %c, i64 %c_offset",
      "%cab = tail call ptr @strcpy(ptr noundef nonnull dereferenceable(1) %ca_ptr, ptr noundef nonnull dereferenceable(1) %b)",
      "%c_addr = sext i32 %clen to i64",
      "%c_ptr = getelementptr inbounds i8, ptr %c, i64 %c_addr",
      "store i8 0, ptr %c_ptr, align 1, !tbaa !5",
      "ret ptr %c"
    };

    for(String line : func)
    {
      outputFile.println("\t" + line);
    }

    outputFile.println("}");
  }

  /**
   * Output precompiled functions
   */
  private void emitFunctionDeclarations() {
    emitConcatDeclaration();
  }

  /**
   * emit all string literals as a null terminated c string:
   * @lit# = constant [len(lit) x i8] = c"lit val\00"
   */
  private void emitLiterals() {
    for(int i = 0; i < literals.size(); i++)
    {
      String literal = literals.get(i);
      String outputTemplate = "@lit%d = constant [%d x i8] c\"%s\\00\"";
      outputFile.println( String.format(outputTemplate, i, literal.length()+1, literal) );
    }
  }

  /**
   * Make sure nonoe of the metadata collides and output it
   */
  private void emitMetadata() {
    // used in Concat
    outputFile.println("!5 = !{!6, !6, i64 0}");
    outputFile.println("!6 = !{!\"omnipotent char\", !7, i64 0}");
    outputFile.println("!7 = !{!\"Simple C/C++ TBAA\"}");
  }

  /**
   * Step through the file and interpret information
   */
  public void run() {
    // output the preamble
    emitPreamble();

    while(!eof)
    {
      advance();

      // This is for the first char of a line (other stuff can happen inside
      // these functions)
      String prevString = ""; // this is essentially to allow junk strings on a
                              // line get concatenated
      switch(curChar)
      {
        // ignore some whitespace
        case '\r':
        case '\t':
        case ' ':
          break;
        case 'd':
          interpretPrint();
          break;
        case '[':
          prevString = interpretString();
          break;
        case ']':
          prevString = interpretReverseString();
          break;
        case '~':
          prevString = prevString + interpretConcat();
          // comments have to be on a newline
        case '-':
          interpretComment();
          break;
      }
    }

    // output the end of the file
    outputFile.println("ret i32 0");
    outputFile.println("}");
    outputFile.println();

    // emit any literals
    emitLiterals();
    emitMetadata(); // comes from the precompiled stuff

    outputFile.flush();
  }

  public static void main(String[] args) {	
    if(args.length < 2) {
      System.err.println("usage: java Compiler <input file> <output file>");
      System.exit(0);
    }

    Compiler compiler = new Compiler(args[0], args[1]);
    compiler.run();
  }

}
