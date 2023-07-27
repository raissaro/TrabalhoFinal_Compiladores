grammar MinhaGramatica;

@header{
     package src;
}

inicio: (atribuicao)? (function)+;     EOF #NInicio

expressao: (NUM|ID) (OP_ARIT (NUM|ID))+
         | expressao_logica
         | ABRE_P expressao FECHA_P
         | chamada_funcao;    EOF #NExpressao

chamada_funcao: FUNCTION ID ABRE_P TIPO ID (VIRGULA TIPO ID)* FECHA_P;     EOF #NChamadaFuncao

expressao_logica: ID (OP_LOG ID)+
                | NUM (OP_LOG NUM)+
                | ID (OP_LOG NUM)+
                | NUM (OP_LOG ID)+
                | NUM (OP_ARIT NUM)+
                | ID (OP_ARIT ID)+
                | ID ((OP_ARIT|OP_LOG) NUM)+
                | NUM (OP_ARIT ID)+;    EOF #NExpressaoLogica

declaracao: TIPO ID PTV;     EOF #NDeclaracao

define: DEFINE ID ATRIB NUM PTV;       EOF #NDefine

function: FUNCTION ID ABRE_P (TIPO ID (VIRGULA TIPO ID)*)? FECHA_P TIPO DOIS_PT (bloco)* END
          |FUNCTION MAIN ABRE_P (TIPO ID (VIRGULA TIPO ID)*)? FECHA_P TIPO DOIS_PT (bloco)* END;    EOF #BlocoFuncao

atribuicao: ID ATRIB (expressao)+ PTV
          | ID ATRIB ID PTV
          | ID ATRIB NUM PTV
          | ID ATRIB TEXTO PTV;    EOF #NAtribuicao

write: WRITE QUAT_PT (TEXTO|NUM|ID)+ PTV;    EOF #NWrite

read: READ QUAT_PT ID PTV;    EOF #NRead

t_if: IF ABRE_P expressao_logica FECHA_P DOIS_PT (bloco)+ END;   EOF #BlocoIf

t_else: ELSE DOIS_PT (bloco)+ END;      EOF #BlocoElse

t_elseif: ELSEIF ABRE_P expressao_logica FECHA_P DOIS_PT (bloco)+ END;     EOF #BlocoElseIf

t_for: FOR ABRE_P TIPO ID ATRIB NUM PTV ID OP_LOG NUM PTV ID OP_ARIT OP_ARIT FECHA_P DOIS_PT (bloco)+ END
     |FOR ABRE_P TIPO ID ATRIB NUM PTV ID OP_LOG ID PTV ID OP_ARIT OP_ARIT FECHA_P DOIS_PT (bloco)+ END;     EOF #BlocoFor

t_while: WHILE ABRE_P expressao_logica FECHA_P DOIS_PT (bloco)+ END;      EOF #BlocoWhile

t_return: RETURN expressao PTV
          |RETURN NUM PTV
          |RETURN TEXTO PTV
          |RETURN ID PTV
          |RETURN TRUE PTV
          |RETURN FALSE PTV
          |RETURN PTV;      EOF #NReturn

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
     |chamada_funcao PTV;     EOF #Bloco
         
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

