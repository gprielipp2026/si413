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
  // private Scanner inputScanner;
  private PrintWriter outputFile;
  private List<String> literals;
  private List<String> variables;

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
    variables = new ArrayList<>();

    // inputScanner = new Scanner(System.in);  
    // inputScanner.useDelimiter("\n");
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
   * return a new literal name
   */
  private String freshLit() {
    return "@" + String.format("lit%d", literals.size());
  }

  /**
   * return a new variable name
   */
  private String freshVar() {
    return "%" + String.format("var%d", variables.size() );
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

    String printVar = "";
    while(!eof && !toMatch.empty())
    {
      // make sure the correct form is matched
      if(curChar == toMatch.peek()) 
        toMatch.pop();
      else if(curChar == '[')
      {
        printVar = interpretString(); 
      }
      else if (curChar == ']')
      {
        printVar = interpretReverseString();
      }
      else if(curChar == ' ' || curChar == '\t')
      {
        // do nothing - let it advance  
      }
      else if(curChar == '~')
      {
        // handle string concatenation
        String concatVar = interpretConcat();
        printVar = emitConcat(printVar, concatVar);
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
    if(printVar.length() == 0) // keeps empty strings from being a problem
    {
      printVar = freshLit();
      literals.add("");
    }
    outputFile.println(String.format("call i32 @puts(ptr %s)", printVar ));
  }

  /**
   * Emits the code needed to concatenate two strings
   */
  private String emitConcat(String varA, String varB) {
    String newVar = freshVar();
    variables.add(newVar);

    outputFile.println( String.format("%s = call ptr @concat(ptr %s, ptr %s)", newVar, varA, varB) );

    return newVar;
  }

  /**
   * Emits the code needed to reverse a string (from a given variable)
   */
  private String emitReverseString(String varA) {
    String outVar = freshVar();
    outputFile.println( String.format("%s = call void @reverseString(%s)", outVar, varA) );

    return outVar;
  }

  /**
   * Interpret a string literal
   */
  private String interpretString()
  {
    // read until a ']' or '\n' is found
    // a '\n' before a ']' will throw an error for no close bracket found
    String finalVar = new String();
    String string = new String();
    boolean readLiteral = true;
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
        // string += interpretInput();
        // now I'm getting the variable for the input result
        readLiteral = false;
        // special case where input is inside a string: so I need to concat it to what came before and what comes after
        if(string.length() > 0) {
          String litVar = freshLit();
          literals.add(string);
          string = new String(); // need to reset it to capture what happens after
          String inputVar = interpretInput();

          finalVar = emitConcat(litVar, inputVar);
        } else {
          finalVar = interpretInput();
        }
        
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

    if(readLiteral)
    {
      finalVar = freshLit();
      literals.add(string);
    }
    else if(string.length() > 0)
    {
      // read in an input and need to do the concat stuff again
      String litVar = freshLit();
      literals.add(string);
      string = new String(); // need to reset it to capture what happens after

      finalVar = emitConcat(litVar, finalVar);
    }

    return finalVar;
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
    // return inputScanner.next();

    String varUsed = freshVar();
    variables.add(varUsed);

    // emit the compiled code
    outputFile.println(String.format("%s = call ptr @getUserInput()", varUsed));

    return varUsed;

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
    String finalVar = new String();
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
          String lit = interpretString();
          finalVar = freshVar();
          variables.add(finalVar);
          outputFile.println( String.format("%s = call ptr @reverseString(ptr %s)", finalVar, lit) );
        }
      }
      else if(curChar == '_')
      {
        readStringLit = false;
        if(string.length() > 0){
          String inputVar = interpretInput();
          String litVar = freshLit();
          literals.add(string);
          string = "";
          finalVar = emitReverseString(inputVar);
          finalVar = emitConcat(finalVar, litVar);
        } else {
          finalVar = emitReverseString( interpretInput() );
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
        // this code block should not be hit
        // reverse the string
        // string = curChar + string;
        System.err.println("[ERROR] unexcpected character in reverse string");
        System.exit(7);
      }
    }

    if(!readStringLit)
    {
      // must have done an input
      // need to take what currently exists and concat it again
      String litVar = freshLit();
      literals.add(string);
      finalVar = emitConcat(litVar, finalVar);
    }

    return finalVar;
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
    outputFile.println("declare noundef i32 @__isoc99_scanf(ptr nocapture noundef readonly, ...)");
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
   * Code that should be generated to get user input
   */
  private void emitGetUserInputDeclaration() {
    outputFile.println();
    outputFile.println("@inputFormat = constant [7 x i8] c\"%[^\\0A]\\0A\\00\"");
    outputFile.println("define dso_local ptr @getUserInput() local_unnamed_addr {");

    String[] lines = {
      "%userIn = tail call noalias dereferenceable_or_null(1024) ptr @malloc(i64 noundef 1024)",
      "call i32 (ptr, ...) @__isoc99_scanf(ptr noundef getelementptr inbounds ([7 x i8], [7 x i8]* @inputFormat, i64 0, i64 0), ptr noundef %userIn)",
      "ret ptr %userIn"
    };

    for(String line : lines)
    {
      outputFile.println("\t" + line);
    }

    outputFile.println("}");
  }

  /**
   * Function declaration for reverseString
   */
  private void emitReverseStringDeclaration() {
    outputFile.println();
    outputFile.println("define dso_local ptr @reverseString(ptr nocapture noundef %0) {");

    String[] lines = {
        "%2 = tail call i64 @strlen(ptr noundef nonnull dereferenceable(1) %0) #6",
  "%3 = trunc i64 %2 to i32",
  "%4 = shl i64 %2, 32",
  "%5 = add i64 %4, 4294967296",
  "%6 = ashr exact i64 %5, 32",
  "%7 = tail call noalias ptr @malloc(i64 noundef %6) #7",
  "%8 = icmp sgt i32 %3, 0",
  "br i1 %8, label %9, label %90",
"",
"9:                                                ; preds = %1",
  "%10 = and i64 %2, 4294967295",
  "%11 = icmp ult i64 %10, 8",
  "br i1 %11, label %72, label %12",
"",
"12:                                               ; preds = %9",
  "%13 = add nsw i64 %10, -1",
  "%14 = add i32 %3, -1",
  "%15 = trunc i64 %13 to i32",
  "%16 = sub i32 %14, %15",
  "%17 = icmp sgt i32 %16, %14",
  "%18 = icmp ugt i64 %13, 4294967295",
  "%19 = or i1 %17, %18",
  "br i1 %19, label %72, label %20",
"",
"20:                                               ; preds = %12",
  "%21 = icmp ult i64 %10, 32",
  "br i1 %21, label %51, label %22",
"",
"22:                                               ; preds = %20",
  "%23 = and i64 %2, 31",
  "%24 = sub nsw i64 %10, %23",
  "br label %25",
"",
"25:                                               ; preds = %25, %22",
  "%26 = phi i64 [ 0, %22 ], [ %45, %25 ]",
  "%27 = xor i64 %26, -1",
  "%28 = add i64 %2, %27",
  "%29 = shl i64 %28, 32",
  "%30 = ashr exact i64 %29, 32",
  "%31 = getelementptr inbounds i8, ptr %0, i64 %30",
  "%32 = getelementptr inbounds i8, ptr %31, i64 -15",
  "%33 = bitcast ptr %32 to <16 x i8>*",
  "%34 = load <16 x i8>, <16 x i8>* %33, align 1, !tbaa !5",
  "%35 = shufflevector <16 x i8> %34, <16 x i8> poison, <16 x i32> <i32 15, i32 14, i32 13, i32 12, i32 11, i32 10, i32 9, i32 8, i32 7, i32 6, i32 5, i32 4, i32 3, i32 2, i32 1, i32 0>",
  "%36 = getelementptr inbounds i8, ptr %31, i64 -16",
  "%37 = getelementptr inbounds i8, ptr %36, i64 -15",
  "%38 = bitcast ptr %37 to <16 x i8>*",
  "%39 = load <16 x i8>, <16 x i8>* %38, align 1, !tbaa !5",
  "%40 = shufflevector <16 x i8> %39, <16 x i8> poison, <16 x i32> <i32 15, i32 14, i32 13, i32 12, i32 11, i32 10, i32 9, i32 8, i32 7, i32 6, i32 5, i32 4, i32 3, i32 2, i32 1, i32 0>",
  "%41 = getelementptr inbounds i8, ptr %7, i64 %26",
  "%42 = bitcast ptr %41 to <16 x i8>*",
  "store <16 x i8> %35, <16 x i8>* %42, align 1, !tbaa !5",
  "%43 = getelementptr inbounds i8, ptr %41, i64 16",
  "%44 = bitcast ptr %43 to <16 x i8>*",
  "store <16 x i8> %40, <16 x i8>* %44, align 1, !tbaa !5",
  "%45 = add nuw i64 %26, 32",
  "%46 = icmp eq i64 %45, %24",
  "br i1 %46, label %47, label %25, !llvm.loop !8",
"",
"47:                                               ; preds = %25",
  "%48 = icmp eq i64 %23, 0",
  "br i1 %48, label %90, label %49",
"",
"49:                                               ; preds = %47",
  "%50 = icmp ult i64 %23, 8",
  "br i1 %50, label %72, label %51",
"",
"51:                                               ; preds = %20, %49",
  "%52 = phi i64 [ %24, %49 ], [ 0, %20 ]",
  "%53 = and i64 %2, 7",
  "%54 = sub nsw i64 %10, %53",
  "%55 = getelementptr inbounds i8, ptr %0, i64 -7",
  "br label %56",
"",
"56:                                               ; preds = %56, %51",
  "%57 = phi i64 [ %52, %51 ], [ %68, %56 ]",
  "%58 = xor i64 %57, -1",
  "%59 = add i64 %2, %58",
  "%60 = shl i64 %59, 32",
  "%61 = ashr exact i64 %60, 32",
  "%62 = getelementptr inbounds i8, ptr %55, i64 %61",
  "%63 = bitcast ptr %62 to <8 x i8>*",
  "%64 = load <8 x i8>, <8 x i8>* %63, align 1, !tbaa !5",
  "%65 = shufflevector <8 x i8> %64, <8 x i8> poison, <8 x i32> <i32 7, i32 6, i32 5, i32 4, i32 3, i32 2, i32 1, i32 0>",
  "%66 = getelementptr inbounds i8, ptr %7, i64 %57",
  "%67 = bitcast ptr %66 to <8 x i8>*",
  "store <8 x i8> %65, <8 x i8>* %67, align 1, !tbaa !5",
  "%68 = add nuw i64 %57, 8",
  "%69 = icmp eq i64 %68, %54",
  "br i1 %69, label %70, label %56, !llvm.loop !11",
"",
"70:                                               ; preds = %56",
  "%71 = icmp eq i64 %53, 0",
  "br i1 %71, label %90, label %72",
"",
"72:                                               ; preds = %12, %9, %49, %70",
  "%73 = phi i64 [ 0, %9 ], [ 0, %12 ], [ %24, %49 ], [ %54, %70 ]",
  "%74 = sub i64 %2, %73",
  "%75 = add nsw i64 %73, 1",
  "%76 = and i64 %74, 1",
  "%77 = icmp eq i64 %76, 0",
  "br i1 %77, label %87, label %78",
"",
"78:                                               ; preds = %72",
  "%79 = xor i64 %73, -1",
  "%80 = add i64 %2, %79",
  "%81 = shl i64 %80, 32",
  "%82 = ashr exact i64 %81, 32",
  "%83 = getelementptr inbounds i8, ptr %0, i64 %82",
  "%84 = load i8, ptr %83, align 1, !tbaa !5",
  "%85 = getelementptr inbounds i8, ptr %7, i64 %73",
  "store i8 %84, ptr %85, align 1, !tbaa !5",
  "%86 = add nuw nsw i64 %73, 1",
  "br label %87",
"",
"87:                                               ; preds = %78, %72",
  "%88 = phi i64 [ %73, %72 ], [ %86, %78 ]",
  "%89 = icmp eq i64 %10, %75",
  "br i1 %89, label %90, label %93",
"",
"90:                                               ; preds = %87, %93, %47, %70, %1",
  "%91 = ashr exact i64 %4, 32",
  "%92 = getelementptr inbounds i8, ptr %7, i64 %91",
  "store i8 0, ptr %92, align 1, !tbaa !5",
  "ret ptr %7",
"",
"93:                                               ; preds = %87, %93",
  "%94 = phi i64 [ %110, %93 ], [ %88, %87 ]",
  "%95 = xor i64 %94, -1",
  "%96 = add i64 %2, %95",
  "%97 = shl i64 %96, 32",
  "%98 = ashr exact i64 %97, 32",
  "%99 = getelementptr inbounds i8, ptr %0, i64 %98",
  "%100 = load i8, ptr %99, align 1, !tbaa !5",
  "%101 = getelementptr inbounds i8, ptr %7, i64 %94",
  "store i8 %100, ptr %101, align 1, !tbaa !5",
  "%102 = add nuw nsw i64 %94, 1",
  "%103 = sub i64 4294967294, %94",
  "%104 = add i64 %2, %103",
  "%105 = shl i64 %104, 32",
  "%106 = ashr exact i64 %105, 32",
  "%107 = getelementptr inbounds i8, ptr %0, i64 %106",
  "%108 = load i8, ptr %107, align 1, !tbaa !5",
  "%109 = getelementptr inbounds i8, ptr %7, i64 %102",
  "store i8 %108, ptr %109, align 1, !tbaa !5",
  "%110 = add nuw nsw i64 %94, 2",
  "%111 = icmp eq i64 %110, %10",
  "br i1 %111, label %90, label %93, !llvm.loop !13"
    };

    for(String line : lines)
    {
      outputFile.println(line);
    }

    outputFile.println("}");
  }

  /**
   * Output precompiled functions
   */
  private void emitFunctionDeclarations() {
    emitConcatDeclaration();
    emitGetUserInputDeclaration();
    emitReverseStringDeclaration();
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
    // these come straight from compiled and optimized llvm ir for helper functions - I have no clue what they do (I got tired of figuring it out)
    String[] lines = {
      "!0 = !{i32 1, !\"wchar_size\", i32 4}",
      "!1 = !{i32 7, !\"PIC Level\", i32 2}",
      "!2 = !{i32 7, !\"PIE Level\", i32 2}",
      "!3 = !{i32 7, !\"uwtable\", i32 1}",
      "!4 = !{!\"Ubuntu clang version 14.0.0-1ubuntu1.1\"}",
      "!5 = !{!6, !6, i64 0}",
      "!6 = !{!\"omnipotent char\", !7, i64 0}",
      "!7 = !{!\"Simple C/C++ TBAA\"}",
      "!8 = distinct !{!8, !9}",
      "!9 = !{!\"llvm.loop.mustprogress\"}",
      "!10 = !{!\"llvm.loop.isvectorized\", i32 1}",
      "!11 = distinct !{!11, !9, !10, !12}",
      "!12 = !{!\"llvm.loop.unroll.runtime.disable\"}",
      "!13 = distinct !{!13, !9, !10}",
    };
    for(String line : lines)
    {
      outputFile.println(line);
    }
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
