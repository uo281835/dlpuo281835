package ast;

import ast.definiciones.Definition;

import java.util.List;

public class Program extends ASTNodeImpl{
    private List<Definition> definitionList;

    public Program(int line, int column, List<Definition> definitionList) {
        this(line, column);
        this.definitionList = definitionList;
    }

    public Program(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "Program{" +
                "definitionList=" + definitionList +
                ", line=" + line +
                ", column=" + column +
                '}';
    }

    public List<Definition> getDefinitionList() {
        return definitionList;
    }

    public void setDefinitionList(List<Definition> definitionList) {
        this.definitionList = definitionList;
    }
}
