package ast;

import ast.expressions.Expression;
import ast.statements.Statement;
import ast.tipos.Type;
import java.util.List;

public class CallFunction extends ASTNodeImpl implements Statement, Expression

{
    public List<Expression> expressionList;
    public String name;


    public CallFunction(int line, int column, List<Expression> expressionList, String name) {
        super(line, column);
        this.expressionList = expressionList;
        this.name = name;
    }

    public CallFunction(int line, int column) {
        super(line, column);
    }

    @Override
    public Type getType() {
        return null;
    }
}
