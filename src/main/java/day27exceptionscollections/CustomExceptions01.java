package day27exceptionscollections;

public class CustomExceptions01 {

    /*
        Normally, Java has many Exception Classes which cover many issues
        Sometimes we need Custom Exception for 2 reasons;
            1)To make Java Exceptions more specific
              "FileNotFoundException" has 2 reasons in it i)Path can be wrong ii)File does not exist
               to understand which reason exactly gives me an exception we use custom exception
            2)To create some Exceptions for our application
              "IllegalGradeException" can be created for a school management system application

            3)Custom Exceptions guide the developers not to break the application rules
            Note:Custom exceptions created by developers not by Java
            Note: When we create custom exception after the name we have to use "exception" keyword. All exception classes
            have "exception" keyword at the end.
     */

    public static void main(String[] args) {

        try{
            printGrade(45);         // It will give again red underline because that method throws exception(warn developer) and it is a compile-time exception
                                    // to handle it ==> come to the "more actions" ==> add try-catch block"
        }catch(IllegalGradeException e){
            e.printStackTrace();
        }

        System.out.println(checkNameFormat("tom")); //Since it is run time exception it does not give any red underline, even if it is not true
                                                    //We will see the exception on the console



    }

    public static void printGrade(double grade) throws IllegalGradeException {

        if(grade<0 || grade>100) {
            throw new IllegalGradeException("Grade cannot be less then zero and more than hundred");
            //Since it is "compile time exception", it gives red underline
            //To handle it come to the "more actions" ==> choose "add exception to method signature"
            //When I throw "IllegalGradeException" in the method signature line, I am making mandatory for developers to use try-catch block

        }else{
            System.out.println(grade);
        }
    }

    public static boolean checkNameFormat(String name){

        if(name.charAt(0)>='A' && name.charAt(0)<='Z'){
            return true;
        }else{
            throw new IllegalNameException("Names must start with upper cases");
        }
    }
}
