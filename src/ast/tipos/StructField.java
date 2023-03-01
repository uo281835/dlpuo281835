package ast.tipos;

import ast.ASTNodeImpl;

public class StructField extends ASTNodeImpl implements Type{
    public String nombre;
    public Type tipo;
    public StructField(int line, int column, String nombre, Type tipo) {
        this(line, column);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public StructField(int line, int column) {
        super(line, column);
    }
}
