package ast;

import ast.expressions.Expression;
import ast.statements.Statement;

public class CallFunction extends ASTNodeImpl implements Statement, Expression

{

    public CallFunction(int line, int column) {
        super(line, column);
    }
}
