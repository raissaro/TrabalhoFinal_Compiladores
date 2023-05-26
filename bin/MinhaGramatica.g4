grammar MinhaGramatica;

TIPO:'int'|'float'|'str'|'bool';

ATRIB:'->';
QUAT_PT:'::';
DOIS_PT:':';
END:'END';
PTV:';';
ABRE_P: '(';
FECHA_P: ')';
COMENT: '--';

READ: 'READ';
WRITE: 'WRITE';
FUNCTION: 'FUNCTION';
IF: 'IF';
ELSE: 'ELSE';
ELSEIF: 'ELSEIF';
FOR: 'FOR';
WHILE: 'WHILE';
RETURN: 'RETURN';

OP_ARIT: '+'|'-'|'*'|'/'|'^';
OP_LOG: '>'|'<'|'>='|'<='|'=='|'!=';

ID: LETRA(DIGITO|LETRA)*;
NUM: DIGITO+('.'DIGITO+)?;

fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

IGNORA: [ \r\t\n]* ->skip;

