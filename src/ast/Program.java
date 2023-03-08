package ast;

import ast.definiciones.Definition;
import ast.tipos.ErrorType;

import java.util.List;

public class Program extends ASTNodeImpl{
    private List<Definition> definitionList;

    public Program(int line, int column, List<Definition> definitionList) {
        this(line, column);
        this.definitionList = definitionList;
        checkDefinitions();
    }

    private void checkDefinitions() {
        for(Definition def : definitionList){
            for(Definition def2 : definitionList){
                if(!def.equals(def2) && (def.getName().equals(def2.getName())&&
                        (def.getClass().equals(def2.getClass()))))
                {
                    ErrorType error = new ErrorType(def2.getLine(),def2.getColumn(), "Error: Definición duplicada del nombre "+def2.getName());
                }
            }
        }
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
