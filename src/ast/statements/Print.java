package ast.statements;

import ast.ASTNodeImpl;
import ast.expressions.Expression;

import java.util.List;

public class Print extends ASTNodeImpl implements Statement {
    private List<Expression> expression;

    public Print(int line, int column, List<Expression> expression) {
        this(line, column);
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "Print{" +
                "expression=" + expression +
                ", line=" + line +
                ", column=" + column +
                '}';
    }

    public Print(int line, int column) {
        super(line, column);
    }

    public List<Expression> getExpression() {
        return expression;
    }

    public void setExpression(List<Expression> expression) {
        this.expression = expression;
    }
}
