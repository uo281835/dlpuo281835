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
identificadores returns [List<String> ast = new ArrayList<String>()]:
            ID {$ast.ast.add($ID.text);}
           |ID ',' id = identificadores{ $id.ast.add($ID.text);}
           ;
defFunc returns [DefFuncion ast]:
        d='def' ID '(' defParams? ')'':' (sympleType)?'{' cuerpoFun '}'
        {$ast = new DefFuncion($d.getLine(), $d.getCharPositionInLine()+1,);}
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
type returns [Type ast]:
    sympleType {$ast = $sympleType.ast;}
    //|ID
    |s='struct' '{' listaCampos '}'
    {$ast = new Struct($s.getLine(), $s.getCharPositionInLine()+1, $listaCampos.ast);}
    | listaDimensiones type
    {$ast = new Array($listaDimensiones.ast.get(0).getLine(),
    $listaDimensiones.ast.get(0).getCharPositionInLine()+1,
    $listaDimensiones.ast, $type.ast);}
    ;

listaCampos returns [List<StructField> ast = new ArrayList<StructField>()]:
     |structField listaCampos {$ast.add($structField.ast);}

;
structField returns [StructField ast]:
    ID ':' type ';'{$ast = new StructField($ID.getLine(), $ID.getCharPositionInLine()+1,$ID.text, $type.ast);}
;
sympleType returns [Type ast]:
    t='char'{$ast = new Character($t.getLine(), $t.getCharPositionInLine()+1);}
    |t='double'{$ast = new Double($t.getLine(), $t.getCharPositionInLine()+1);}
    |t='int'{$ast = new Integer($t.getLine(), $t.getCharPositionInLine()+1);}
;
listaDimensiones returns [List<Integer> ast = new ArrayList<Integer>()]:
    '['INT_CONSTANT']' {$ast.add(LexerHelper.lexemeToInt($INT_CONSTANT.text));}
    |'['INT_CONSTANT']' l=listaDimensiones{$l.ast.add(LexerHelper.lexemeToInt($INT_CONSTANT.text));}
;
statement returns [Statement ast]:
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
listaExpComasNoOpcion:

    |listaExpComas
   ;
expression returns[Expression ast]:
            INT_CONSTANT
            {$ast = new LitInteger ($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt($INT_CONSTANT.text));}
            | CHAR_CONSTANT
            {$ast = new LitCaracter ($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text));}
            | REAL_CONSTANT
            {$ast = new LitReal ($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal($REAL_CONSTANT.text));}
            | ID
            { $ast = new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text);}
            | ID '(' listaExpComasNoOpcion')'
             {$ast = new CallFunction($ID.getLine(), $ID.getCharPositionInLine()+1, $listaExpComas.list);}
            | '(' exp = expression ')' {$ast = $exp.ast;}
            | array = expression '[' acceso = expression ']'
            {$ast = new LlamadaArray($array.getLine(), $array.getColumn(),$array.ast,$acceso.ast)}
            | struct = expression '.' ID
             {$ast = new LlamadaCampo($struct.getLine(), $struct.getColumn(),$struct.ast,$ID.text)}
            | par='(' type ')' expression
            {$ast = new Cast($par.getLine(),$par.getCharPositionInLine()+1, $type.ast, $expression.ast);}
            | '-' expression
            {$ast = new UnaryMinus($expression.getLine(), $expression.getColumn(), $expression.ast);}
            | '!' expression
            {$ast = new Not($expression.getLine(), $expression.getColumn(), $expression.ast);}
            | left = expression OP=('*'|'/'|'%') right = expression
            {$ast = new Arithmetic($left.getLine(), $left.getColumn(), $left.ast, $right.ast, $OP.getText);}
            | left = expression OP=('+'|'-') right = expression
            {$ast = new Arithmetic($left.getLine(), $left.getColumn(), $left.ast, $right.ast, $OP.getText);}
            | left = expression OP=('>'|'>='|'<'|'<='|'!='|'==') right = expression
            {$ast = new Operator($left.getLine(), $left.getColumn(), $left.ast, $right.ast, $OP.getText);}
            | left = expression OP=('&&'|'||') right = expression
            {$ast = new Operator($left.getLine(), $left.getColumn(), $left.ast, $right.ast, $OP.getText);}
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


