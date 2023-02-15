package ast.expressions;

import ast.ASTNodeImpl;

public class LitIdentificador extends ExpressionImpl {
    public String value;

    public LitIdentificador(int line, int column, String value) {
        this(line, column);
        this.value = value;
    }
    public LitIdentificador(int line, int column) {
        super(line, column, null);
    }
}
