package ast.expressions;

import ast.ASTNodeImpl;
import ast.tipos.Array;
import ast.tipos.Type;

public class LlamadaArray  extends ASTNodeImpl implements Expression {

    private Expression array;
    private Expression posicion;

    public Expression getArray() {
        return array;
    }

    public void setArray(Expression array) {
        this.array = array;
    }

    public Expression getPosicion() {
        return posicion;
    }

    public void setPosicion(Expression posicion) {
        this.posicion = posicion;
    }

    public LlamadaArray(int line, int column) {
        super(line, column);
    }

    public LlamadaArray(int line, int column, Expression array, Expression posicion) {
        this(line, column);
        this.array = array;
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("LlamadaArray\n");
        string.append("\tLínea: '" + line+"\n");
        string.append("\tColumna: '" + column+"\n");
        string.append("\tArray: '" + array+"\n");
        string.append("\tPosición: '" + posicion+"\n");
        return string.toString();
    }

    @Override
    public Type getType() {
        return null;
    }
}
