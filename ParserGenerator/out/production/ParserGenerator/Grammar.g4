grammar Grammar;

gram : start synth? rules ;

synth : OPENTRIANG fields CLOSETRIANG ;

start : CLOSETRIANG NONTERM ;

rules : rulee+ ;

rulee : terminal | nonTerminal | skip;

skip : REGEXP ARROW TRASH END ;

terminal : TERM (OPEN_ATTR fields CLOSE_ATTR)? ASSIGN terminalValue code? END ;

nonTerminal : NONTERM (OPEN_ATTR fields CLOSE_ATTR)? ARROW grammarRule+ (OR grammarRule+)* END ;

grammarRule : NONTERM (OPEN_ATTR arg (COMMA arg)* CLOSE_ATTR)?
            | TERM (OPEN_ATTR arg (COMMA arg)* CLOSE_ATTR)? | code ;

arg : ARGCODE ;

code : CODE ;

terminalValue : REGEXP ;

fields : field (COMMA field)* ;

field : NONTERM DOTS TERM NULLABLE;





NULLABLE : '?' ;
TRASH : 'skip' ;
NONTERM : [a-z][a-zA-Z0-9]* ;
TERM : [A-Z][a-zA-Z]* ;
OR : '|' ;
DOT : '.' ;
OPENTRIANG : '<' ;
CLOSETRIANG : '>' ;
ARROW : '=>' ;
REGEXP : '"' (.)*? '"' ;
OPEN_ATTR : '{{' ;
CLOSE_ATTR : '}}' ;
ASSIGN : ':=' ;
COMMA : ',' ;
DOTS : ':' ;
CODE : '{' (~[{}]+ CODE? )* '}' ;
ARGCODE : OPENBR .+? CLOSEBR ;
OPENBR : '(' ;
CLOSEBR : ')' ;
OPENPAR : '{' ;
CLOSEPAR : '}' ;
WS : [ \n\t\r]+ -> skip;
END : ';' ;
