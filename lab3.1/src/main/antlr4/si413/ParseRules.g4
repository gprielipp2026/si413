// grammar for small subset of Python
parser grammar ParseRules;

tokens {
  TILDE, LB, RB, LP, RP, STROP, OP, BOOL, PRINT, INPUT, REV, LIT, IF, THEN, ELSE, LOOP, TYPE, ID
}

prog
  : stmt prog  #RegularProg
  | LB prog RB #ContextProg
  | EOF        #EmptyProg
  ;

stmt
  : PRINT boolExpr                #BoolPrint
  | PRINT strExpr                 #StringPrint
  | ID TILDE boolExpr             #BoolAssignStmt 
  | ID TILDE strExpr              #StringAssignStmt
  | boolExpr IF prog                  #IfStmt
  | boolExpr IF prog ELSE prog        #IfElseStmt
  | LOOP boolExpr THEN prog           #WhileStmt
  ;

strExpr
  : strExpr STROP strExpr #StringBinOpExpr
  | LIT                   #StringLitExpr
  | ID                    #StringVar
  | INPUT                 #InputExpr
  | REV TILDE strExpr TILDE  #RevStrExpr
  | LP strExpr RP         #ReorderStrExpr           
  ;

boolExpr
  : BOOL                     #BoolLitExpr
  | ID                       #BoolVar
  | boolExpr OP boolExpr     #BoolBinOpExpr
  | strExpr OP strExpr       #StringCompareExpr
  | REV TILDE boolExpr TILDE #BoolNotExpr
  | LP boolExpr RP           #ReorderBoolExpr 
  ;