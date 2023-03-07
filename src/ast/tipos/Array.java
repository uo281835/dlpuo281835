package ast.tipos;

import ast.ASTNodeImpl;

import java.util.List;

public class Array extends ASTNodeImpl implements Type{
    public Type tipo;

    public Array(int line, int column, Type tipo, List<Integer> dimension) {
        this(line, column);
        this.tipo = tipo;
        this.dimension = dimension;
    }

    public List<Integer> dimension;
    public Array(int line, int column) {
        super(line, column);
    }
}
