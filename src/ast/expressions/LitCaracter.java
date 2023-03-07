package ast.expressions;

import ast.tipos.CharType;
import ast.tipos.Type;

public class LitCaracter extends ExpressionImpl{
    public char value;

    public LitCaracter(int line, int column, char value) {
        this(line, column, new CharType(line, column));
        this.value = value;
    }

    @Override
    public String toString() {
        return "LitCaracter{" +
                "value=" + value +
                ", tipo=" + tipo +
                ", line=" + line +
                ", column=" + column +
                '}';
    }

    public LitCaracter(int line, int column, Type tipo) {
        super(line, column, tipo);
    }
}
