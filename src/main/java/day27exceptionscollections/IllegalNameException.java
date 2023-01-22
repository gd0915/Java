package day27exceptionscollections;

public class IllegalNameException extends RuntimeException{

    //When you extend "RunTimeException Class" your "Custom Exception" will be "RunTimeException"

    public IllegalNameException(String message){
        super(message);
    }

}
