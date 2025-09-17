parser grammar ParseRules;
// grammar for basic calculator language

tokens {PRINT, SAVE, VAR, LP, RP, EXP, SEP, ADDOP, MULOP, INT}

prog
  : stmt prog #RegularProg
  | EOF #EmptyProg
  ;

stmt
  : PRINT expr #PrintStmt
  | SAVE VAR SEP expr # SaveStmt
  | SAVE LP VAR SEP expr RP #SaveStmt
  ;

expr
  : INT #LiteralExpr
  | VAR #VarExpr
  | expr EXP expr #ExpExpr
  | LP expr RP #Grouping
  | ADDOP expr #SignExpr
  | expr MULOP expr #MulExpr
  | expr ADDOP expr #AddExpr
  ;
