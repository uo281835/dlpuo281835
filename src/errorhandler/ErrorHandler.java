package errorhandler;

import ast.tipos.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {
    private List<ErrorType> errors = new ArrayList<ErrorType>();
    private static ErrorHandler instance;

    private ErrorHandler(){

    }
    public static ErrorHandler getInstance(){
        if(instance==null){
            instance=new ErrorHandler();
        }
        return instance;
    }

    public boolean anyError(){
        return errors.size()>0;
    }
    public void showErrors(PrintStream printStream){
        for(ErrorType error: errors){
            printStream.println(error);
        }
    }
    public void addError(ErrorType error){
        if(!errors.contains(error))
            errors.add(error);
    }


}
