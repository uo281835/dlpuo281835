package ast.statements;

import ast.ASTNodeImpl;
import ast.expressions.Expression;

import java.util.List;

public class Read extends ASTNodeImpl implements Statement {
    private List<Expression> expressions;

    public Read(int line, int column, List<Expression> expressions) {
        this(line, column);
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        return "Read{" +
                "expressions=" + expressions +
                ", line=" + line +
                ", column=" + column +
                '}';
    }

    public Read(int line, int column) {
        super(line, column);
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }
}
