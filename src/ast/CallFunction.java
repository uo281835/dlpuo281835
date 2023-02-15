package ast;

import ast.expressions.Expression;
import ast.statements.Statement;
import ast.tipos.Type;

public class CallFunction extends ASTNodeImpl implements Statement, Expression

{

    public CallFunction(int line, int column) {
        super(line, column);
    }

    @Override
    public Type getType() {
        return null;
    }
}
