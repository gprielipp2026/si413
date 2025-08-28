/**
 * George Prielipp (265112)
 *
 * Interpretter for "streamLine"
 *
 * v0.2.0
 *
 * minor version correlated to what step in Task 3 I have reached
 */

import java.util.*;
import java.io.*;


public class Interp {
  private char curChar;
  private FileReader fileReader;
  private boolean eof;
  private boolean doAdvance;
  /** 
   * Create the fileReader and set up tracking vars
   */
  public Interp(String filename)
  {
    File file = new File(filename);

    try {
      fileReader = new FileReader(file);
      eof = false;
      doAdvance = true;
    } catch(FileNotFoundException e) {
      System.err.println("[ERROR] File not found: '" + filename + "'");
      System.exit(7);
    }
  
  }

  // read in the next character and store it in curChar
  // set eof if the end of the file has been reached
  private void advance()
  {
    // cannot read past the end of the file
    try {
      int val = fileReader.read();

      // check if the end of the file has been reached
      if(val == -1) {
        eof = true; 
        return;
      }

      curChar = (char)val;
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
    // d*(STRING_LITERAL)*b

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
      else if(curChar == ' ' || curChar == '\t')
      {
        continue;
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
    System.out.println(printString);
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
    
      // add the character to the string
      string += curChar;
    }

    return string;
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
    else
    {
      System.err.println("[ERROR] expected a string after a '~' (concat operator)");
      System.exit(7);
    }
    // should never hit here
    return "";
  }

  /**
   * Step through the file and interpret information
   */
  public void run() {
    while(!eof)
    {
      if (doAdvance)
        advance();
      else
        doAdvance = true; // make sure it will go on the next one
      
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
        case '~':
          prevString = prevString + interpretConcat();
        // comments have to be on a newline
        case '-':
          interpretComment();
          break;
      }
    }
  }

  public static void main(String[] args) {	
    if(args.length < 1) {
      System.err.println("usage: java Interp <input file>");
      System.exit(0);
    }

    Interp interpretter = new Interp(args[0]);
    interpretter.run();
  }

}
