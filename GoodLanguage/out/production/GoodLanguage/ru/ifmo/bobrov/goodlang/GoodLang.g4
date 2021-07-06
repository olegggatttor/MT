grammar GoodLang;

program : entities+ ;

entities : function ;

function : AT NAME (LPAR argument (COMMA argument)* RPAR)? BLANK* LSCOPE body? RSCOPE ;

argument : WS* NAME WS* ;

body : BLANK* statement BLANK* ;

statement : loop | 'body' ;

loop : 'while' BLANK* orCondition BLANK* LSCOPE body? RSCOPE ;

orCondition : andCondition (OR andCondition)* ;

andCondition : condition (AND condition)* ;

condition : NOT condition | LPAR orCondition RPAR | expression CMP expression | TRUE | FALSE ;

expression : BLANK* (CONST | call | arithmetics) BLANK* ;

call : NAME LPAR
CONST : [1-9][0-9]* ;
TRUE : 'True' ;
FALSE : 'False' ;
CMP : '==' | '<' | '>' | '<=' | '>=' ;
NOT : '!' ;
AND : 'and' ;
OR : 'or' ;
LSCOPE : '{' ;
RSCOPE : '}' ;
LPAR : '(' ;
RPAR : ')' ;
DOTS : ':' ;
COMMA : ',' ;
AT : '@' ;
NAME : [a-zA-Z][a-zA-Z0-9]* ;
TAB : [\t] ;
WS : [ ] -> skip ;
BLANK : [\n\t\r ] -> skip ;