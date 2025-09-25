grammar art;

code
: (statement ';')+
;

statement
: decl
| assign
| addition
| print
;

decl: 'var' ID;
assign: ID '=' expr;
addition: expr '+' expr;
print: 'print' addition;

expr
: ID
| INT
;

ID: ('a'..'z')+ ;
INT: ('0'..'9')+ ;
WS: [ \n\t\r]+ -> skip;