parser grammar ParseRules;
// grammar for truffle culator language

tokens {TILDE, OP, BOOL, PRINT, INPUT, REV, LBRACK, RBRACK, LIT, ID }

prog
  : stat prog #RegularProg
  | EOF #EmptyProg
  ;

stat
  : PRINT expr #PrintStmt
  | ID TILDE expr #AssignStmt
  ;

expr
  : LIT #LitExpr
  | BOOL #BoolExpr
  | expr OP expr #BinaryOpExpr
  | INPUT #InputExpr
  | REV TILDE expr TILDE #RevExpr
  | ID #VarExpr
  ;
