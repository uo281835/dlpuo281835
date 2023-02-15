package ast.statements;

import ast.ASTNodeImpl;
import ast.expressions.Expression;

import java.util.List;

public class Read extends ASTNodeImpl implements Statement {
    public List<Expression> expressions;

    public Read(int line, int column, List<Expression> expressions) {
        this(line, column);
        this.expressions = expressions;
    }

    public Read(int line, int column) {
        super(line, column);
    }
}
