package ast.expressions;

import ast.ASTNodeImpl;
import ast.tipos.Char;
import ast.tipos.Type;

public class LitCaracter extends ExpressionImpl{
    public char value;

    public LitCaracter(int line, int column, char value) {
        this(line, column, new Char(line, column));
        this.value = value;
    }
    public LitCaracter(int line, int column, Type tipo) {
        super(line, column, tipo);
    }
}
