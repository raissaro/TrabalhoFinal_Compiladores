grammar MinhaGramatica;

TIPO: 'int' | 'float' | 'str' | 'bool';
ATRIB: '->';
AP: '(';
FP: ')';
LER: 'READ';
ESC: 'WRITE';
QP: '::';

fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
IGNORA: [ \r\t\n]* ->skip; 
ErrorChar: . ;