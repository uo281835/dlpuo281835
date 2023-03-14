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
        StringBuilder string = new StringBuilder();
        string.append("Print\n");
        string.append("\tLínea: '" + line+"\n");
        string.append("\tColumna: '" + column+"\n");
        string.append("\tExpresiones a imprimir: '\n");
        for(Expression s: expression) {
            string.append("\t\t" + s + "\n");
        }
        return string.toString();
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
