package ast.expressions;

import ast.ASTNodeImpl;
import ast.expressions.Expression;
import ast.tipos.Type;

public class Variable extends ASTNodeImpl implements Expression {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Variable(int line, int column, String nombre) {
        super(line, column);
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Variable{" +
                "nombre='" + nombre + '\'' +
                ", line=" + line +
                ", column=" + column +
                '}';
    }

    @Override
    public Type getType() {
        return null;
    }
}
