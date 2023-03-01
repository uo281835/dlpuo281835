package ast.tipos;

import ast.ASTNodeImpl;

public class Array extends ASTNodeImpl implements Type{
    public Type tipo;

    public Array(int line, int column, Type tipo, int[] dimension) {
        this(line, column);
        this.tipo = tipo;
        this.dimension = dimension;
    }

    public int[] dimension;
    public Array(int line, int column) {
        super(line, column);
    }
}
