parser grammar ParseRules;

tokens {
  TILDE, LB, RB, LP, RP, STROP, OP, BOOL, PRINT, INPUT, REV, LIT, IF, THEN, ELSE, LOOP, TBOOL, TSTR, BID, SID
}

prog
  : stmt prog  #RegularProg
  | LB prog RB #ContextProg
  | EOF        #EmptyProg
  |            #EmptyStmtList
  ;

stmt
  : PRINT boolExpr                #BoolPrint
  | PRINT strExpr                 #StringPrint
  | BID TILDE boolExpr             #BoolAssignStmt 
  | SID TILDE strExpr              #StringAssignStmt
  | IF LP boolExpr RP LB prog RB (ELSE LB prog RB)?        #IfElseStmt
  | LOOP LP boolExpr RP THEN LB prog RB           #WhileStmt
  ;

strExpr
  : strExpr STROP strExpr #StringBinOpExpr
  | LIT                   #StringLitExpr
  | SID                    #StringVar
  | INPUT                 #InputExpr
  | REV strExpr  #RevStrExpr
  | LP strExpr RP         #ReorderStrExpr           
  ;

boolExpr
  : BOOL                     #BoolLitExpr
  | BID                       #BoolVar
  | boolExpr OP boolExpr     #BoolBinOpExpr
  | strExpr OP strExpr       #StringCompareExpr
  | REV boolExpr #BoolNotExpr
  | LP boolExpr RP           #ReorderBoolExpr 
  ;