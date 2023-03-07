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
        listaDefOpt main{$listaDefOpt.ast.add($main.ast);}  EOF
        {$ast = new Program($listaDefOpt.ast.get(0).getLine(),$listaDefOpt.ast.get(0).getColumn(),$listaDefOpt.ast);}
       ;
main returns [DefFuncion ast]:
    def='def' 'main' '(' ')'':'  '{'listaDefVar statements'}'
    {$ast = new DefFuncion($def.getLine(), $def.getCharPositionInLine()+1,
     new VoidType($def.getLine(), $def.getCharPositionInLine()+1),
            "main",$listaDefVar.ast, $statements.ast, new ArrayList<DefVariable>());}
    ;
listaDefOpt returns [List<Definition> ast = new ArrayList<Definition>()]:
        |
        listaDef
        {$ast = $listaDef.ast;}
;
listaDef returns [List<Definition> ast = new ArrayList<Definition>()]:
        definition
        {$ast.addAll($definition.ast);}
        |definition l=listaDef
        {
        $l.ast.addAll($definition.ast);
        $ast = $l.ast;}
        ;
definition returns[List<Definition> ast = new ArrayList<Definition>()]:
        defVar
        {for(DefVariable def: $defVar.ast){
            $ast.add(def);
        }}
        |defFunc
        {$ast.add($defFunc.ast);}
        ;
defVar returns [List<DefVariable> ast = new ArrayList<DefVariable>()]:
        ids=identificadores d=':' type ';'
        {for(String id : $ids.ast){
            $ast.add(new DefVariable(id, $type.ast,$d.getLine(), $d.getCharPositionInLine()+1 ));
        }}
        ;

identificadores returns [List<String> ast = new ArrayList<String>()]:
            ID {$ast.add($ID.text);}
           |ID ',' id = identificadores{ $id.ast.add($ID.text); $ast=$id.ast;}
           ;
defFunc returns [DefFuncion ast]:
        d='def' name=ID '(' defParamsOpt ')'':' (t=sympleType)'{' listaDefVar statements '}'
        {$ast = new DefFuncion($d.getLine(), $d.getCharPositionInLine()+1,$t.ast,$name.getText(),
                 $defParamsOpt.ast, $statements.ast,$listaDefVar.ast );}
        |d='def' name=ID '(' defParamsOpt ')'':' '{' listaDefVar statements '}'
                 {$ast = new DefFuncion($d.getLine(), $d.getCharPositionInLine()+1, new VoidType($d.getLine(), $d.getCharPositionInLine()+1),$name.getText()
                       ,$defParamsOpt.ast  , $statements.ast,$listaDefVar.ast );}
        ;
defParamsOpt returns [List<DefVariable> ast = new ArrayList<DefVariable>()]:

    |defParams
    {$ast = $defParams.ast;};
defParams returns [List<DefVariable> ast = new ArrayList<DefVariable>()]:
    defParam
    {$ast.add($defParam.ast);}
    |defParam ','def = defParams
    {$def.ast.add($defParam.ast);
    $ast = $def.ast;}
;
defParam returns [DefVariable ast]:
    id=ID ':' type
    {$ast = new DefVariable($id.getText(),$type.ast,$id.getLine(), $id.getCharPositionInLine()+1);}
;
listaDefVar returns[List<DefVariable> ast = new ArrayList<DefVariable>()]:
        |defVar lista=listaDefVar
        {$lista.ast.addAll($defVar.ast);
        $ast = $lista.ast;}
        ;
statements returns[List<Statement> ast = new ArrayList<Statement>()]:
        |statement list= statements
        {$list.ast.add($statement.ast);
        $ast=$list.ast;}

;
type returns [Type ast]:
    sympleType {$ast = $sympleType.ast;}
    //|ID
    |s='struct' '{' listaCampos '}'
    {$ast = new Struct($s.getLine(), $s.getCharPositionInLine()+1, $listaCampos.ast);}
    | listaDimensiones type
    {$ast = new Array($type.ast.getLine(),
    $type.ast.getColumn(),
    $type.ast,$listaDimensiones.ast);}
    ;

listaCampos returns [List<StructField> ast = new ArrayList<StructField>()]:
     |structField l=listaCampos {$l.ast.add($structField.ast);
     $ast=$l.ast;}

;
structField returns [StructField ast]:
    ID ':' type ';'{$ast = new StructField($ID.getLine(), $ID.getCharPositionInLine()+1,$ID.text, $type.ast);}
;
sympleType returns [Type ast]:
    t='char'{$ast = new CharType($t.getLine(), $t.getCharPositionInLine()+1);}
    |t='double'{$ast = new DoubleType($t.getLine(), $t.getCharPositionInLine()+1);}
    |t='int'{$ast = new IntegerType($t.getLine(), $t.getCharPositionInLine()+1);}
;
listaDimensiones returns [List<Integer> ast = new ArrayList<Integer>()]:
    '['INT_CONSTANT']' {$ast.add(LexerHelper.lexemeToInt($INT_CONSTANT.text));}
    |'['INT_CONSTANT']' l=listaDimensiones{$l.ast.add(LexerHelper.lexemeToInt($INT_CONSTANT.text));
    $ast=$l.ast;}
;
statement returns [Statement ast]:
    p='print' listaExpComas';'
    {$ast = new Print($p.getLine(), $p.getCharPositionInLine()+1, $listaExpComas.ast);}
    |p='input' listaExpComas';'
    {$ast = new Read($p.getLine(), $p.getCharPositionInLine()+1, $listaExpComas.ast);}
    |l=expression '=' r=expression';'
    {$ast = new Asign($l.ast.getLine(), $l.ast.getColumn(), $l.ast, $r.ast);}
    |i='if' e=expression ':'((ifs=statement)) ('else'':'((elses=statement)))
    {List<Statement> listIf = new ArrayList<Statement>();
    listIf.add($ifs.ast);
    List<Statement> listElse = new ArrayList<Statement>();
    listElse.add($elses.ast);
    $ast = new If($i.getLine(), $i.getCharPositionInLine()+1,$e.ast , listIf, listElse);}
    |i='if' e=expression ':'((ifs=statement))
     {List<Statement> listIf = new ArrayList<Statement>();
        listIf.add($ifs.ast);
        $ast = new If($i.getLine(), $i.getCharPositionInLine()+1,$e.ast, listIf,new ArrayList<Statement>());}
    |i='if' e=expression ':'(('{' ifC=cuerpoIf '}')) ('else'':'(('{' elseC=cuerpoIf'}')))
     {$ast = new If($i.getLine(), $i.getCharPositionInLine()+1,$e.ast , $ifC.ast, $elseC.ast);}
    |i='if' e=expression ':'(('{' ifC=cuerpoIf '}'))
    {$ast = new If($i.getLine(), $i.getCharPositionInLine()+1,$e.ast , $ifC.ast, new ArrayList<Statement>());}
    |w='while'  e=expression ':' ((s=statement))
    {List<Statement> cuerpo = new ArrayList<Statement>();
         cuerpo.add($s.ast);
    $ast = new While($w.getLine(), $w.getCharPositionInLine()+1,$e.ast , cuerpo);}
    |w='while'  e=expression ':' (('{' c=cuerpoIf '}'))
    {$ast = new While($w.getLine(), $w.getCharPositionInLine()+1,$e.ast ,$c.ast);}
    |ret='return' expression';'
    {$ast = new Return($ret.getLine(), $ret.getCharPositionInLine()+1, $expression.ast);}
    |id=ID '(' exp=listaExpComas')' ';'
    {$ast = new CallFunction($id.getLine(), $id.getCharPositionInLine()+1, $exp.ast, $id.getText());}
    |id=ID '(' ')' ';'
    {$ast = new CallFunction($id.getLine(), $id.getCharPositionInLine()+1, new ArrayList<Expression>(), $id.getText());}
    ;

cuerpoIf returns [List<Statement> ast]:
    statementsNoOpt
    {$ast=$statementsNoOpt.ast;}
;
statementsNoOpt returns [List<Statement> ast = new ArrayList<Statement>()]:
        statement
        {$ast.add($statement.ast);}
        |statement s= statements
        {$s.ast.add($statement.ast);
        $ast = $s.ast;}

;

listaExpComas returns[List<Expression> ast = new ArrayList<Expression>()]:
    expression
    {$ast.add($expression.ast);}
    |expression ',' l=listaExpComas
    {$l.ast.add($expression.ast);
    $ast = $l.ast;}
;
listaExpComasNoOpcion returns [List<Expression> ast = new ArrayList<Expression>()]:

    |lista=listaExpComas
    {$ast=$lista.ast;}
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
            | id=ID '(' listaExpComasNoOpcion')'
             {$ast = new CallFunction($id.getLine(), $id.getCharPositionInLine()+1, $listaExpComasNoOpcion.ast, $id.getText());}
            | '(' exp = expression ')' {$ast = $exp.ast;}
            | array = expression '[' acceso = expression ']'
            {$ast = new LlamadaArray($array.ast.getLine(), $array.ast.getColumn(),$array.ast,$acceso.ast);}
            | struct = expression '.' ID
             {$ast = new LlamadaCampo($struct.ast.getLine(), $struct.ast.getColumn(),$struct.ast,$ID.text);}
            | par='(' type ')' expression
            {$ast = new Cast($par.getLine(),$par.getCharPositionInLine()+1, $type.ast, $expression.ast);}
            | '-' expression
            {$ast = new UnaryMinus($expression.ast.getLine(), $expression.ast.getColumn(), $expression.ast);}
            | '!' expression
            {$ast = new Not($expression.ast.getLine(), $expression.ast.getColumn(), $expression.ast);}
            | left = expression OP=('*'|'/'|'%') right = expression
            {$ast = new Arithmetic($left.ast.getLine(), $left.ast.getColumn(), $left.ast, $right.ast, $OP.getText());}
            | left = expression OP=('+'|'-') right = expression
            {$ast = new Arithmetic($left.ast.getLine(), $left.ast.getColumn(), $left.ast, $right.ast, $OP.getText());}
            | left = expression OP=('>'|'>='|'<'|'<='|'!='|'==') right = expression
            {$ast = new Operador($left.ast.getLine(), $left.ast.getColumn(), $left.ast, $right.ast, $OP.getText());}
            | left = expression OP=('&&'|'||') right = expression
            {$ast = new Operador($left.ast.getLine(), $left.ast.getColumn(), $left.ast, $right.ast, $OP.getText());}
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


