package ast.tipos;

import ast.ASTNodeImpl;

public class StructField extends ASTNodeImpl implements Type{
    private String nombre;
    private Type tipo;
    public StructField(int line, int column, String nombre, Type tipo) {
        this(line, column);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "StructField{" +
                "nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", line=" + line +
                ", column=" + column +
                '}';
    }

    public StructField(int line, int column) {
        super(line, column);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Type getTipo() {
        return tipo;
    }

    public void setTipo(Type tipo) {
        this.tipo = tipo;
    }
}
