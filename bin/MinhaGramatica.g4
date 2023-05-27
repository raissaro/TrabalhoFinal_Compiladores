grammar MinhaGramatica;

programa: expressao;

expressao: expressao OP_ARIT expressao
         | expressao OP_LOG expressao
         | ABRE_P expressao FECHA_P
         | READ QUAT_PT expressao
         | WRITE QUAT_PT ASP expressao ASP
         | ID ATRIB expressao 
         | FUNCTION ID ABRE_P expressao FECHA_P ID DOIS_PT expressao END;
         
TIPO:'int'|'float'|'str'|'bool'|'void';

ATRIB:'->';
QUAT_PT:'::';
DOIS_PT:':';
END:'END';
PTV:';';
ABRE_P: '(';
FECHA_P: ')';
READ: 'READ';
WRITE: 'WRITE';
FUNCTION: 'FUNCTION';
IF: 'IF';
ELSE: 'ELSE';
ELSEIF: 'ELSEIF';
FOR: 'FOR';
WHILE: 'WHILE';
RETURN: 'RETURN';
ASP: '"';
DEFINE: 'DEFINE';
VIRGULA: ',';
FALSE: 'FALSE';
TRUE: 'TRUE';
HASHTAG: '#';

OP_ARIT: '+'|'-'|'*'|'/'|'^'|'%';
OP_LOG: '>'|'<'|'>='|'<='|'=='|'!=';

ID: LETRA(DIGITO|LETRA)*;
NUM: DIGITO+('.'|DIGITO+)?;

fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];


WS: [ \r\t\n]+ ->skip;
COMMENT: '--' .*? '--' ->skip;

Error: . ;
