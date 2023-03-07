package ast.statements;

import ast.ASTNodeImpl;
import ast.expressions.Expression;

import java.util.List;

public class Print extends ASTNodeImpl implements Statement {
    public List<Expression> expression;

    public Print(int line, int column, List<Expression> expression) {
        this(line, column);
        this.expression = expression;
    }

    public Print(int line, int column) {
        super(line, column);
    }
}
