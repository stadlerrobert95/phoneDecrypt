package main.Tools.Exceptions;

public class InvalidInputException extends Exception {
    public InvalidInputException(String errorMessage){
        super(errorMessage);
    }
}
