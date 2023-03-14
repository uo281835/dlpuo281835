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
        StringBuilder string = new StringBuilder();
        string.append("Read\n");
        string.append("\tLínea: '" + line+"\n");
        string.append("\tColumna: '" + column+"\n");
        string.append("\tExpresiones a leer: '\n");
        for(Expression s: expressions) {
            string.append("\t\t" + s + "\n");
        }
        return string.toString();
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
