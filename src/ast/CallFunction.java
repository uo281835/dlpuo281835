package ast;

import ast.definiciones.DefVariable;
import ast.expressions.Expression;
import ast.expressions.Variable;
import ast.statements.Statement;
import ast.tipos.StructField;
import ast.tipos.Type;
import java.util.List;

public class CallFunction extends ASTNodeImpl implements Statement, Expression

{
    private List<Expression> expressionList;
    private Variable variable;


    public CallFunction(int line, int column, List<Expression> expressionList, Variable variable) {
        super(line, column);
        this.expressionList = expressionList;
        this.variable = variable;
    }

    public CallFunction(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("CallFunction\n");
        string.append("\tLínea: '" + line+"\n");
        string.append("\tColumna: '" + column+"\n");
        string.append("\tVariable: '" + variable+"\n");
        string.append("\tArgumentos: \n");
        for(Expression def: expressionList){
            string.append("\t\t"+def+"\n");
        }

        return string.toString();
    }

    @Override
    public Type getType() {
        return null;
    }

    public List<Expression> getExpressionList() {
        return expressionList;
    }

    public void setExpressionList(List<Expression> expressionList) {
        this.expressionList = expressionList;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }
}
