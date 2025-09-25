grammar Xpres;

code
: statement ';' code
| EOF       // Implicitly defined terminal
;

statement
: decl
| assign
| print
;

decl: 'var' ID;

assign: ID '=' expr;

print: 'print' expr;

expr
: ID
| INT
;

ID: ('a'..'z')+ ;
INT: ('0'..'9')+ ;
WS: [ \n\t\r]+ -> skip;