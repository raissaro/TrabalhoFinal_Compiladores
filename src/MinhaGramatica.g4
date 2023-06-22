grammar MinhaGramatica;

inicio: (atribuicao)? (function)+;
expressao: NUM (OP_ARIT NUM)+
         | expressao_logica
         | ABRE_P expressao FECHA_P
         | chamada_funcao;
chamada_funcao: FUNCTION ID ABRE_P TIPO ID (VIRGULA TIPO ID)* FECHA_P PTV;
expressao_logica: ID (OP_LOG ID)+
                | NUM (OP_LOG NUM)+
                | ID (OP_LOG NUM)+
                | NUM (OP_LOG ID)+
                | NUM (OP_ARIT NUM)+
                | ID (OP_ARIT ID)+
                | ID ((OP_ARIT|OP_LOG) NUM)+
                | NUM (OP_ARIT ID)+; 
declaracao: TIPO ID PTV;
define: DEFINE ID ATRIB NUM PTV;
function: FUNCTION ID ABRE_P (TIPO ID (VIRGULA TIPO ID)*)? FECHA_P TIPO DOIS_PT (bloco)* END
          |FUNCTION MAIN ABRE_P (TIPO ID (VIRGULA TIPO ID)*)? FECHA_P TIPO DOIS_PT (bloco)* END; 
atribuicao: ID ATRIB (expressao)+ PTV
          | ID ATRIB ID PTV
          | ID ATRIB NUM PTV
          | ID ATRIB TEXTO PTV;
write: WRITE QUAT_PT TEXTO PTV;
read: READ QUAT_PT ID PTV;
t_if: IF ABRE_P expressao_logica FECHA_P DOIS_PT (bloco)+ END;
t_else: ELSE DOIS_PT (bloco)+ END;
t_elseif: ELSEIF ABRE_P expressao_logica FECHA_P DOIS_PT (bloco)+ END;
t_for: FOR ABRE_P TIPO ID ATRIB NUM PTV ID OP_LOG NUM PTV ID OP_ARIT OP_ARIT FECHA_P DOIS_PT (bloco)+ END
     |FOR ABRE_P TIPO ID ATRIB NUM PTV ID OP_LOG ID PTV ID OP_ARIT OP_ARIT FECHA_P DOIS_PT (bloco)+ END;
t_while: WHILE ABRE_P expressao_logica FECHA_P DOIS_PT (bloco)+ END;
t_return: RETURN (expressao)* PTV
          |RETURN NUM PTV
          |RETURN TEXTO PTV
          |RETURN ID PTV
          |RETURN TRUE PTV
          |RETURN FALSE PTV
          |RETURN PTV;

bloco: write 
     |read 
     |t_if
     |t_else
     |t_elseif
     |declaracao
     |atribuicao
     |t_for
     |t_while
     |t_return
     |chamada_funcao;
         
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
DEFINE: 'DEFINE';
VIRGULA: ',';
FALSE: 'FALSE';
TRUE: 'TRUE';
HASHTAG: '#';
MAIN: 'MAIN';

OP_ARIT: '+'|'-'|'*'|'/'|'^'|'%';
OP_LOG: '>'|'<'|'>='|'<='|'=='|'!=';

ID: LETRA(DIGITO|LETRA)*;
NUM: DIGITO+('.'DIGITO+)?;
TEXTO: '"' .*? '"';
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
fragment OUTRO: [\u0021-\u0026\u0028-\u005B\u005D-\uFFFF];


WS: [ \r\t\n]+ ->skip;
COMMENT: '--' .*? '--' ->skip;

Error: . ;