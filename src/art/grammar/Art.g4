grammar Art;

code
: (statement ';')+
;

statement: decl | assign | forloop| addition | print;

decl: 'var' ID;
assign: ID '=' expr;
addition: expr '+' expr;
forloop: 'for' expr 'in collection(' expr ',' addition '):'
     expr '+=' expr;
print: 'print' expr;

expr: ID | INT;

ID: ('a'..'z')+ ;
INT: ('0'..'9')+ ;
WS: [ \n\t\r]+ -> skip;