package ast.definiciones;

import ast.ASTNodeImpl;
import ast.expressions.Variable;
import ast.tipos.Type;

public class DefVariable extends ASTNodeImpl implements Definition {

    private String name;
    private Type tipo;


    public DefVariable(String nombre, Type tipo, int line, int column) {
        super(line, column);
        this.name = nombre;
        this.tipo = tipo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getTipo() {
        return tipo;
    }

    public void setTipo(Type tipo) {
        this.tipo = tipo;
    }

    @Override
    public Type getType() {
        return tipo;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "DefVariable{" +
                "name='" + name + '\'' +
                ", tipo=" + tipo +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
