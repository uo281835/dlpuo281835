package ast;

public abstract class ASTNodeImpl implements ASTNode{

    public int line;
    public int column;

    public ASTNodeImpl(int line, int column){
        this.line = line;
        this.column = column;
    }
    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }
}
