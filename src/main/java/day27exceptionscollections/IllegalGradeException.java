package day27exceptionscollections;

public class IllegalGradeException extends Exception{


    //To make a class "Exception Class" make it child of the "Exception Class" by using "extends" keyword
    //If you use "extends Exception" it will be "Compile Time Exception"(Checked Exception)

    public IllegalGradeException(String message){  //We put an exception  message for that exception
        super(message);  //Go to parent constructor and in my parent constructor use my message as message
    }

}
