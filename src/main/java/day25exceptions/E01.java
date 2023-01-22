package day25exceptions;

public class E01 {

    /*
            1) "Exception" means unexpected issues in code execution
            2) There are 2 ways to work with Exceptions
                i)Using try-catch block: Handling Exception
                ii)Throw Exception and block the application
            3) If you do not handle the Exception, Java stop execution and the application is blocked.
            4) "try" can be used with a single or more catch blocks
            5) "try" cannot be used alone (you have to put catch or something else==>we will learn later on)

       NOTE: "Exception class" has some codes/messages, and then it is sending the message according to the child (in the last example in class E06 ==> try-catch block)
             in the situation of multiple codes and scenarios
     */

    public static void main(String[] args) {

       divide(6,2);//to divide a number zero is impossible, so Java gives Exception. "ArithmeticException"
                         //Java encountered an issue.

        divide2(6,0);

    }


    //1.Way: to help Java(We do not recommend that way)
    //      i) It is not mandatory for developers to know all math rules.
    //      ii)In math, there may be very problematic rules, it is so difficult to cover all in if statement
    public static void divide(int a, int b){
        if(b==0) {
            System.out.println("A number cannot be divided by zero");
        }
        System.out.println(a / b);
    }

    //2.Way: Handle Exception by using try-catch block
    public static void divide2(int a, int b){

        try{
            System.out.println(a/b);//If Java encounters an exception here, Java will throw ArithmeticException and stop executing the code
                                    //and will come to the "catch" part

            System.out.println("Hi Exceptions");//If Java gives arithmetic exception this code ("Hi exceptions") and the others coming after will not be run.

            System.out.println("By Exceptions");

        }catch(ArithmeticException e){  //After catching arithmetic exception, it will print the message below

            System.out.println("A problem occurred in division");

        }

    }




}
