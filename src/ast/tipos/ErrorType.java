package ast.tipos;

import ast.ASTNodeImpl;
import errorhandler.ErrorHandler;

import java.util.Objects;

public class ErrorType extends ASTNodeImpl implements  Type {
    private String message;

    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message = message;

        ErrorHandler.getInstance().addError(this);
    }

    @Override
    public String toString() {
        return
                 message + '\'' +
                ", line=" + line +
                ", column=" + column
                ;
    }

    public ErrorType(int line, int column) {
        super(line, column);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErrorType errorType = (ErrorType) o;
        return Objects.equals(message, errorType.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }
}
