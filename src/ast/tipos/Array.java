package ast.tipos;

import ast.ASTNodeImpl;

import java.util.List;

public class Array extends ASTNodeImpl implements Type{
    private Type tipo;

    public Array(int line, int column, Type tipo, List<Integer> dimension) {
        this(line, column);
        this.tipo = tipo;
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Array{" +
                "tipo=" + tipo +
                ", dimension=" + dimension +
                ", line=" + line +
                ", column=" + column +
                '}';
    }

    private List<Integer> dimension;
    public Array(int line, int column) {
        super(line, column);
    }

    public Type getTipo() {
        return tipo;
    }

    public void setTipo(Type tipo) {
        this.tipo = tipo;
    }

    public List<Integer> getDimension() {
        return dimension;
    }

    public void setDimension(List<Integer> dimension) {
        this.dimension = dimension;
    }
}
