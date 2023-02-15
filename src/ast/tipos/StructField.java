package ast.tipos;

import ast.ASTNodeImpl;

public class StructField extends ASTNodeImpl implements Type{
    public String nombre;

    public StructField(int line, int column, String nombre) {
        this(line, column);
        this.nombre = nombre;
    }

    public StructField(int line, int column) {
        super(line, column);
    }
}
