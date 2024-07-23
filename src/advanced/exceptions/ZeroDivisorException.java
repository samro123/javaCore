package advanced.exceptions;

public class ZeroDivisorException extends RuntimeException{
    public ZeroDivisorException(Exception exception){
        super(exception);
    }

    public ZeroDivisorException(String message){
        super(message);
    }

}
