grammar axis;

func : decl | def;

decl : funcHeader ';'                   
     | type ID ';'                     
     ;

def : funcHeader block                  
    | type ID ('=' expr)? ';'           
    ;

block : '[' stat* ']' ;

stat : 'while' '(' expr ')' stat
     | ID '=' expr ';'
     | 'return' expr 
     | expr ';'
     | block
     ;
    
expr : '(' expr ')'
    | ID '(' expr (','expr)* ')'
    | ID
    | INT
    | CHAR
    ; 

type : 'int' | 'char' | 'void' ;

funcHeader: type ID '(' args? ')';  

args :arg ( ',' arg ) * ;

arg : type ID;

COMMENT: '&*' .*? '*&' -> channel(HIDDEN);
WS: [\t\n\r]+ -> skip ;
ID: [a-z]+ [a-zA-Z0-9_]* ;
INT: [0-9]+;
CHAR: '\' '~'\''+ '\'' ;
