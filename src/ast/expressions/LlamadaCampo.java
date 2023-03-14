package ast.expressions;

import ast.ASTNodeImpl;
import ast.tipos.Array;
import ast.tipos.Struct;
import ast.tipos.Type;

public class LlamadaCampo  extends ASTNodeImpl implements Expression {
    public Expression struct;
    public String campo;
    public LlamadaCampo(int line, int column) {
        super(line, column);
    }

    public LlamadaCampo(int line, int column, Expression struct, String campo) {
        this(line, column);
        this.struct = struct;
        this.campo = campo;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("LlamadaArray\n");
        string.append("\tLínea: '" + line+"\n");
        string.append("\tColumna: '" + column+"\n");
        string.append("\tStruct: '" + struct+"\n");
        string.append("\tCampo: '" + campo+"\n");
        return string.toString();
    }

    @Override
    public Type getType() {
        return null;
    }
}
