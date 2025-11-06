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
  STRREV,
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
  ;

stmt
  : BOOLT ID ASSIGN boolexpr END # BoolVarAssign
  | STRT ID ASSIGN strexpr END # StrVarAssign
  | FUNC ID ASSIGN funcexpr END # FuncVarAssign
  | ID ASSIGN boolexpr END # BoolReassign
  | ID ASSIGN strexpr END # StrReassign
  | LSB strexpr RSB END # PrintStr
  | LSB boolexpr RSB END # PrintBool
  | WHILE LP boolexpr RP LB prog RB # WhileLoop
  | IF LP boolexpr RB LB prog RB (ELSE LB prog RB)? # IfElse
  | RETURN boolexpr END # ReturnBool
  | RETURN strexpr END # ReturnStr
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
  : ID LP exprlist RB # FirstOrderCall
  | LP paramlist RP RETURN BOOLT LB prog RB # BoolFuncDef
  | LP paramlist RP RETURN STRT LB prog RB # StrFuncDef
  | LP paramlist RP RETURN VOID LB prog RB # VoidFuncDef
  | LP paramlist RP RETURN FUNCTION LB prog RB # FirstOrderFunc
  ;

boolexpr
  : boolexpr BOOLOP boolexpr # BoolBinOp
  | strexpr STRCMP strexpr # StrCmp
  | LP boolexpr RB # BoolReorder
  | ID LP exprlist RP # BoolFuncCall
  | BOOLLIT # BoolLit
  | ID # GetBoolVar
  ;

strexpr
  : strexpr STROP strexpr # StrBinOp
  | STRREV strexpr # RevStr
  | LP strexpr RP # StrReorder
  | INPUT # Input
  | ID LP exprlist RP # StrFuncCall
  | STRLIT # StrLit
  | ID # GetStrVar
  ;
