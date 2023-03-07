package ast.expressions;

import ast.ASTNodeImpl;
import ast.tipos.Array;
import ast.tipos.Type;

public class LlamadaArray  extends ASTNodeImpl implements Expression {

    public Expression array;
    public Expression posicion;
    public LlamadaArray(int line, int column) {
        super(line, column);
    }

    public LlamadaArray(int line, int column, Expression array, Expression posicion) {
        this(line, column);
        this.array = array;
        this.posicion = posicion;
    }

    @Override
    public Type getType() {
        return null;
    }
}
