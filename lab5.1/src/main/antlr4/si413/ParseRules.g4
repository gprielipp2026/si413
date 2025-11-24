parser grammar ParseRules;
// grammar for EasyAs

tokens {
    DISPLAY, ASK, STORE, IF, ELSE, WHILE, FUNC, LAMBDAARROW,
    BOOLLIT, STRLIT, TYPES, TYPEB,
    REVERSE, NOT, LESSTHAN, GREATERTHAN, CONTAINS, CONCAT, AND, OR,
    ASSIGN, CALL, LPAREN, RPAREN, LCURLY, RCURLY, COMMA, VARNAME, COMMENT,
    TYPEN, MUL_DIV, ADD_MINUS, NUMBER, NEG, NUMBOOLOPS
}

prog : stmtList EOF #Program ;

stmt
  : DISPLAY expr                            #Display
  | STORE VARNAME ASSIGN expr               #Store
  | IF expr LCURLY stmtList RCURLY          #IfOnly
  | IF expr LCURLY stmtList RCURLY
    ELSE LCURLY stmtList RCURLY             #IfElse
  | WHILE expr LCURLY stmtList RCURLY       #While
  | FUNC VARNAME LPAREN paramList RPAREN
    LCURLY stmtList expr RCURLY             #FuncDecl
  | expr                                    #ExprStmt
  ;

stmtList
  : stmt stmtList   #MultiStmts
  |                 #NoStmts
  ;

paramList
  : VARNAME COMMA paramList  #ManyParams
  | VARNAME                  #OneParam
  |                          #NoParams
  ;

expr
  : LPAREN expr RPAREN                      #ParenExpr
  | expr AND expr                           #And
  | expr OR expr                            #Or
  | expr LESSTHAN expr                      #Less
  | expr GREATERTHAN expr                   #Greater
  | expr CONTAINS expr                      #Contains
  | expr CONCAT expr                        #Concat
  | expr REVERSE                            #Reverse
  | TYPEB NOT expr                          #Not
  | CALL expr LPAREN argList RPAREN         #FuncCall
  | LPAREN paramList RPAREN LAMBDAARROW
    LCURLY stmtList expr RCURLY             #Lambda
  | VARNAME                                 #Var
  | STRLIT                                  #StrLit
  | BOOLLIT                                 #BoolLit
  | ASK TYPES                               #AskString
  | ASK TYPEB                               #AskBool
  | ASK TYPEN                               #AskNumber
  | expr MUL_DIV expr                       #MulDivNumber
  | expr ADD_MINUS expr                     #AddMinusNumber
  | expr NUMBOOLOPS expr                    #NumberBoolOp
  | NUMBER                                  #NumberLit
  | NEG expr                                #NegateNumber
  ;

argList
  : expr COMMA argList  #ManyArgs
  | expr                #OneArg
  |                     #NoArgs
  ;
