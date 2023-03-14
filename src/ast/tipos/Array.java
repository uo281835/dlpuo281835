package ast.tipos;

import ast.ASTNodeImpl;
import ast.statements.Statement;

import java.util.List;

public class Array extends ASTNodeImpl implements Type{
    private Type tipo;

    public Array(int line, int column, Type tipo, Integer dimension) {
        this(line, column);
        this.tipo = tipo;
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Array\n");
        string.append("\tLínea: '" + line+"\n");
        string.append("\tColumna: '" + column+"\n");
        string.append("\tTipo: '" + tipo+"\n");
        string.append("\tDimensión: '" + dimension+"\n");

        return string.toString();
    }

    private Integer dimension;
    public Array(int line, int column) {
        super(line, column);
    }

    public Type getTipo() {
        return tipo;
    }

    public void setTipo(Type tipo) {
        this.tipo = tipo;
    }

    public Integer getDimension() {
        return dimension;
    }

    public void setDimension(Integer dimension) {
        this.dimension = dimension;
    }
}
