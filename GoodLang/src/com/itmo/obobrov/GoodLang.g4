grammar GoodLang;

program : NL* (entities (NL+ | EOF))* EOF ;

entities : function ;

function : AT NAME (LPAR argument (COMMA argument)* RPAR)? LSCOPE body? RSCOPE ;

argument : NAME ;

body : ((loop | assigment | ret | call | read | write | when | ) NL)* ;

when : WHEN LSCOPE whenBody RSCOPE ;

whenBody : whenCond* elseBranch? NL* ;

elseBranch : (OTHERWISE DO ((LSCOPE body? RSCOPE) | body)) | NL ;

whenCond : (orCondition DO ((LSCOPE body? RSCOPE) | body)) | NL ;

read : NAME READ ;

write : expression WRITE ;

ret : RET expression;

assigment :NAME (COMMA NAME)* ASSIGN expression (COMMA expression)* ;

loop : WHILE orCondition LSCOPE body? RSCOPE ;

orCondition : andCondition (OR andCondition)* ;

andCondition : condition (AND condition)* ;

condition : NOT condition | LPAR orCondition RPAR | expression cmp expression | TRUE | FALSE ;

cmp : EQ | LT | GT | LE | GE | NE ;

expression : multiplier (MUL multiplier | DIV multiplier)* ;

multiplier : element (ADD element | SUB element)* ;

element : (SUB element) | (ADD element) | CONST | NAME | call | LPAR expression RPAR ;

call : NAME LPAR expression? (COMMA expression)* RPAR ;

OTHERWISE : 'otherwise' ;
WHEN : 'when' ;
DO : 'do' ;
READ : '<-' ;
WRITE : '->' ;
RET : 'ret' ;
ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;
ASSIGN : '=' ;
WHILE : 'while' ;
CONST : [1-9][0-9]* | '0' ;
TRUE : 'True' ;
FALSE : 'False' ;
EQ : '==' ;
LT : '<' ;
GT : '>' ;
LE : '<=' ;
GE : '>=' ;
NE : '!=' ;
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
NL : [\n\r] ;
BLANK : [\t ] -> skip ;