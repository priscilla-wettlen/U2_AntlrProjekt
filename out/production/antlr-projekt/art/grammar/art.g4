grammar Art;

code
    : (statement ';')+ ;

statement
    : decl
    | assign
    | range
    | add
    | sub
    | lt
    | mt
    | forLoop
    | print
    ;

decl
    : 'artwork' assign
    ;

assign
    : ID '=' expr
    ;

range
    : 'from' expr 'to' expr
    ;

add
    : expr PLUSEQUAL expr
    | expr PLUSPLUS
    | expr PLUS expr
    ;

sub
    : expr MINUS expr
    ;

lt
    : expr LT expr
    ;

mt
    : expr MT expr
    ;

forLoop
    : 'for' ID 'in' 'collection' range ':' suite
    ;

suite
    : (statement';')+
    ;

print
    : 'paint' expr
    ;

expr
    : ID
    | INT
    ;

ID : [a-z]+ ;
INT: [0-9]+ ;
PLUSEQUAL: '+=' ;
PLUSPLUS : '++' ;
PLUS     : '+' ;
MINUS    : '-' ;
LT       : '<' ;
MT       : '>' ;
WS: [ \t\r\n]+ -> skip ;