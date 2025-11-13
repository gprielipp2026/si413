// FILL IN THE GRAMMAR FOR YOUR LANGAUGE HERE
parser grammar ParseRules;

tokens { 
  LP,
  RP,
  LB,
  RB,
  LSB,
  RSB,
  END,
  SEP,
  RETURN,
  ASSIGN,
  BOOLOP,
  STRCMP,
  NOT,
  STROP,
  INPUT,
  IF,
  ELSE,
  WHILE,
  FUNCTION,
  BOOLLIT,
  STRLIT,
  BOOLT,
  STRT,
  VOID,
  ID
}

prog
  : stmtList EOF # FullProg
  ;

stmtList
  : stmt END stmtList # NormalProg
  | # EmptyProg
  ;

stmt
  : BOOLT ID ASSIGN boolexpr # BoolVarAssign
  | STRT ID ASSIGN strexpr # StrVarAssign
  | FUNCTION ID ASSIGN funcexpr # FuncVarAssign
  | ID ASSIGN boolexpr # BoolReassign
  | ID ASSIGN strexpr # StrReassign
  | LSB strexpr RSB # PrintStr
  | LSB boolexpr RSB # PrintBool
  | WHILE LP boolexpr RP LB stmtList RB # WhileLoop
  | IF LP boolexpr RP LB stmtList RB (ELSE LB stmtList RB)? # IfElse
  | ID LP exprlist RP # FunctionCallStmt
  ;

paramlist
  : arglist # FuncParams
  | # EmptyParamList
  ;

arglist
  : arg SEP arglist # ArgList
  | arg # LastArg
  ;

arg
  : BOOLT ID # BoolParam
  | STRT ID # StrParam
  ;

exprlist
  : exprliststuff # ExprList
  | # EmptyExprList
  ;

exprliststuff
  : boolexpr SEP exprliststuff # BoolArgMoreList
  | strexpr SEP exprliststuff # StrArgMoreList
  | boolexpr # LastBoolArg
  | strexpr # LastStrArg
  ;

funcexpr
  : ID LP exprlist RP # FirstOrderCall
  | LP paramlist RP RETURN BOOLT LB stmtList BOOLT RETURN boolexpr END RB # BoolFuncDef
  | LP paramlist RP RETURN STRT LB stmtList STRT RETURN strexpr END RB # StrFuncDef
  | LP paramlist RP RETURN VOID LB stmtList RB # VoidFuncDef
  | LP paramlist RP RETURN FUNCTION LB stmtList FUNCTION RETURN funcexpr END RB # FirstOrderFunc
  | ID # FunctionVarName
  ;

boolexpr
  : boolexpr BOOLOP boolexpr # BoolBinOp
  | strexpr STRCMP strexpr # StrCmp
  | LP boolexpr RP # BoolReorder
  | ID LP exprlist RP # BoolFuncCall
  | NOT boolexpr #NotBoolExpr
  | BOOLLIT # BoolLit
  | ID # GetBoolVar
  ;

strexpr
  : strexpr STROP strexpr # StrBinOp
  | NOT strexpr # RevStr
  | LP strexpr RP # StrReorder
  | INPUT # Input
  | ID LP exprlist RP # StrFuncCall
  | STRLIT # StrLit
  | ID # GetStrVar
  ;
