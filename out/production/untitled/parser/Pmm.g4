grammar Pmm;

program:
       ;
fragment
LETRA: [a-zA-Z];
fragment
EXPONENTIAL: [eE]([-+])?NUMERO;
fragment
DECIMAL_EXPONENTIAL: NUMERO?EXPONENTIAL;
fragment
NUMERO: [0-9]+;
BLANK: [\n\r\t ]->skip;
fragment
NEW_LINE: '\'\\n\'';
fragment
TABULATOR: '\'\\t\'';

COMMENT: '#'.*?('\n'|'\r'|EOF) ->skip;
MULTILINE_COMMENT: '"""'.*?'"""'->skip;

ID: [a-zA-Z_][a-zA-Z_0-9]*;
CHAR_CONSTANT: '\''.'\''|NEW_LINE|TABULATOR|ASCII_CHAR_CONSTANT;
REAL_CONSTANT: DOUBLE_CONSTANT_ENTERO_EXPONENCIAL|DOUBLE_CONSTANT_DOS_INTS|DOUBLE_CONSTANT_ENTERO|DOUBLE_CONSTANT_FRACCION;
SUMA: '+';
RESTA: '-';
MULTIPLICACION: '*';
DIVISION: '/';
MODULO: '%';
ENDOFLINE: ';';
ASIGNA: '=';
IGUAL:'==';
AND: '&&';
OR: '||';
MENOR: '<';
MENORIGUAL: '<=';
MAYOR: '>';
MAYORIGUAL: '>=';
ABREPAR: '(';
CIERRAPAR:')';
NEGADOR: '!';
PUNTO: '.';
IF: 'if';
ELSE: 'else';
ABRELLAVE: '{';
CIERRALLAVE:'}';
ABRECOR: '[';
CIERRACOR:']';
DEF: 'def';
PRINT: 'print';
INPUT: 'input';
STRUCT: 'struct';
WHILE: 'while';
CAST: 'CAST';
RETURN: 'return';
INT: 'int';
DOUBLE: 'double';
CHAR: 'char';
DOS_PUNTOS: ':';
fragment
DOUBLE_CONSTANT_ENTERO_EXPONENCIAL: NUMERO'.'?[Ee]NUMERO;
fragment
DOUBLE_CONSTANT_DOS_INTS:  NUMERO'.'NUMERO;
fragment
DOUBLE_CONSTANT_ENTERO: NUMERO'.';
fragment
DOUBLE_CONSTANT_FRACCION:
                 INT_CONSTANT?'.'DECIMAL_EXPONENTIAL|
                 '.'NUMERO;
INT_CONSTANT: '0'|[1-9][0-9]+;
fragment
ASCII_CHAR_CONSTANT:'\'\\'NUMERO+'\'';


