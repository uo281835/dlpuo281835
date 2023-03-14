package ast.expressions;

import ast.ASTNodeImpl;
import ast.tipos.Type;

public class Operador  extends ASTNodeImpl implements Expression {
    private Expression exp1;
    private Expression exp2;

    public Expression getExp1() {
        return exp1;
    }

    public void setExp1(Expression exp1) {
        this.exp1 = exp1;
    }

    public Expression getExp2() {
        return exp2;
    }

    public void setExp2(Expression exp2) {
        this.exp2 = exp2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Operador(int line, int column, Expression exp1, Expression exp2, String operator) {
        super(line, column);
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.operator = operator;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Operador\n");
        string.append("\tLínea: '" + line+"\n");
        string.append("\tColumna: '" + column+"\n");
        string.append("\tExpresion1: '" + exp1+"\n");
        string.append("\tOperador: '" + operator+"\n");
        string.append("\tExpresion2: '" + exp2+"\n");
        return string.toString();
    }

    public String operator;

    public Operador(int line, int column) {
        super(line, column);
    }

    @Override
    public Type getType() {
        return exp1.getType();
    }
}
