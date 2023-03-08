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
        return "LlamadaArray{" +
                "array=" + array +
                ", posicion=" + posicion +
                ", line=" + line +
                ", column=" + column +
                '}';
    }

    @Override
    public Type getType() {
        return null;
    }
}
