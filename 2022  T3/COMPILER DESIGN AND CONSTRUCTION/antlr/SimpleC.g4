grammar SimpleC;

prog : decl;

decl : funcHeader ';'
     | type ID ';'        
     ;
