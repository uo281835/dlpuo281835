package ast.expressions;

import ast.ASTNodeImpl;
import ast.expressions.Expression;
import ast.tipos.Type;

public class Variable extends ASTNodeImpl implements Expression {

    public String nombre;
    public Type tipo;
    public Variable(String nombre,Type tipo,int line, int column) {
        super(line, column);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override
    public Type getType() {
        return tipo;
    }
}
