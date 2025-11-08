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
  : stmt prog # NormalProg
  | LB stmt prog RB # ContextProg
  | EOF #EmptyProg
  | #EmptyList
  ;

stmt
  : BOOLT ID ASSIGN boolexpr END # BoolVarAssign
  | STRT ID ASSIGN strexpr END # StrVarAssign
  | FUNCTION ID ASSIGN funcexpr END # FuncVarAssign
  | ID ASSIGN boolexpr END # BoolReassign
  | ID ASSIGN strexpr END # StrReassign
  | LSB strexpr RSB END # PrintStr
  | LSB boolexpr RSB END # PrintBool
  | WHILE LP boolexpr RP LB prog RB # WhileLoop
  | IF LP boolexpr RP LB prog RB (ELSE LB prog RB)? # IfElse
  | RETURN boolexpr END # ReturnBool
  | RETURN strexpr END # ReturnStr
  | ID LP exprlist RP END # FunctionCallStmt
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
  | LP paramlist RP RETURN BOOLT LB prog RB # BoolFuncDef
  | LP paramlist RP RETURN STRT LB prog RB # StrFuncDef
  | LP paramlist RP RETURN VOID LB prog RB # VoidFuncDef
  | LP paramlist RP RETURN FUNCTION LB prog RB # FirstOrderFunc
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
