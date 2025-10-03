grammar Art;

code
: (statement ';')+
;
statement: decl | assign | addition | print;

//statement: decl | assign | forloop| addition | print;

decl: 'var' ID | 'var' assign;
assign: ID '=' expr | ID '=' addition;
addition: expr '+' expr;
//addition_result: ID '=' addition;
//forloop: 'for' ID 'in collection(' expr ',' addition '):'
//     expr '+=' expr;
//forloop:
//    'for' ID 'in' 'collection' '(' start=expr ',' end=expr ')' ':'
//      body=statement;
print: 'print' expr;

expr: ID | INT ;

ID: ('a'..'z')+ ;
INT: ('0'..'9')+ ;
WS: [ \n\t\r]+ -> skip;