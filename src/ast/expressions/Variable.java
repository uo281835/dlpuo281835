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
        StringBuilder string = new StringBuilder();
        string.append("Variable \n");
        string.append("\tLínea: '" + line+"\n");
        string.append("\tColumna: '" + column+"\n");
        string.append("\tNombre: '" + nombre+"\n");
        return string.toString();
    }

    @Override
    public Type getType() {
        return null;
    }
}
