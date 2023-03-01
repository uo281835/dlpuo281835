grammar Pmm;

@header{
/*Todo se pone en pmmParser*/
import ast.definiciones.*;
import ast.expressions.*;
import ast.statements.*;
import ast.tipos.*;
import ast.*;
}

program returns [Program ast]:
        listaDef main/*{$listaDef.add($main.ast);}*/  EOF /*{$ast = new Program($listaDef.get(0).getLine(),$listaDef.get(0).getColumn(),$listaDef.get(0));}*/
       ;
main returns [DefFuncion ast]:
    def='def' 'main' '(' ')'':'  '{'cuerpoFun'}'
   /* {$ast = new defFuncion($def.getLine(), $def.getCharPositionInLine()+1,
            new Void($def.getLine(), $def.getCharPositionInLine()+1),
            "main",$cuerpoFun.);}*/
    ;
listaDef:
        |definition listaDef
        ;
definition:
        defVar
        |defFunc

        ;
defVar:
        identificadores ':' type ';'
        ;
identificadores:
            ID
           |ID ',' identificadores
           ;
defFunc:
        'def' ID '(' defParams? ')'':' (sympleType)?'{' cuerpoFun '}'
        ;
defParams:
    defParam
    |defParam ','defParams
;
defParam:
    ID ':' type
;
cuerpoFun:
    listaDefVar statements
;
listaDefVar:
        |defVar listaDefVar
        ;
statements:
        |statement  statements

;
type:
    sympleType
    |ID
    |'struct' '{' listaDefVar '}'
    | listaDimensiones type
    ;
sympleType:
 'char'
    |'double'
    |'int'
;
listaDimensiones:
    '['INT_CONSTANT']'
    |'['INT_CONSTANT']' listaDimensiones
;
statement:
    'print' listaExpComas';'
    |'input' listaExpComas';'
    |expression '=' expression';'
    |'if' expression ':'(('{' cuerpo '}')|(statement)) ('else'':'(('{' cuerpo'}')|(statement)))?
    |'while'  expression ':' (('{' cuerpo '}')|(statement))
    |'return' expression';'
    |ID '(' listaExpComas?')' ';'
    ;
cuerpo:
    listaDefVar statementsNoOpt
;
statementsNoOpt:statement
        |statement  statements
;
listaExpComas:
    expression
    |expression ',' listaExpComas
;
expression returns[Expression ast]:
            INT_CONSTANT {$ast = new LitInteger ($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt($INT_CONSTANT.text));}
            | CHAR_CONSTANT {$ast = new LitCaracter ($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text));}
            | REAL_CONSTANT {$ast = new LitReal ($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal($REAL_CONSTANT.text));}
            | ID { $ast = new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text);}
            | ID '(' listaExpComas?')'
            | '(' expression ')'
            | expression '[' expression ']'
            | expression '.' ID
            | '(' type ')' expression
            | '-' expression
            | '!' expression
            | expression OP=('*'|'/'|'%') expression
            | expression OP=('+'|'-') expression
            | expression OP=('>'|'>='|'<'|'<='|'!='|'==') expression
            | expression OP=('&&'|'||') expression
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
INT_CONSTANT: '0'|[1-9][0-9]*;
fragment
ASCII_CHAR_CONSTANT:'\'\\'NUMERO+'\'';


