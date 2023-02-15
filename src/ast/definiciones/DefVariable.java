package ast.definiciones;

import ast.ASTNodeImpl;
import ast.expressions.Variable;
import ast.tipos.Type;

public class DefVariable extends ASTNodeImpl implements Definition {

    private String name;
    private Type tipo;

    public Variable variable;

    public DefVariable(String nombre, Type tipo, int line, int column) {
        super(line, column);
        this.name = nombre;
        this.tipo = tipo;
        this.variable = new Variable(nombre,tipo,line,column);
    }

    @Override
    public Type getType() {
        return tipo;
    }

    @Override
    public String getName() {
        return name;
    }

}
