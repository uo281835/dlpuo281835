package ast;

import ast.expressions.Expression;
import ast.statements.Statement;
import ast.tipos.Type;
import java.util.List;

public class CallFunction extends ASTNodeImpl implements Statement, Expression

{
    private List<Expression> expressionList;
    private String name;


    public CallFunction(int line, int column, List<Expression> expressionList, String name) {
        super(line, column);
        this.expressionList = expressionList;
        this.name = name;
    }

    public CallFunction(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "CallFunction{" +
                "expressionList=" + expressionList +
                ", name='" + name + '\'' +
                ", line=" + line +
                ", column=" + column +
                '}';
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
