package day26exceptions;

public class E02 {

    /*

            1)If you want to execute the code for every scenario, use "finally" block after "try" body
            2)Finally can be used just with "try" without "catch", it will work
            3)"try" can be used like   i) try + single catch   ii) try + multiple catch   iii) try + single catch + finally
               iv) try + multiple catch +m finally   v) try + finally
               Note: "try" cannot be used alone
            4) "ArithmeticException", "NullPointerException", "ArrayIndexOutOfBoundsException, "NumberFormatException",
             "StringIndexOutOfBoundsException", "IllegalArgumentException" are displayed on the console after I clicked on run button;
             therefore, those are called "RunTime Exception"
            5)There is "Compile Time Exception" as well. "Compile Time Exception" will be displayed before clicking on the run button;
            therefore, they are called ""Compile Time Exception"

            Interview Question: Could you please explain final and finally keyword in Java?
            Final==> final variable cannot , final method, final class
            Finally ==> is used at the end of the try-catch code blocks to execute the code in every scenario
     */

    public static void main(String[] args) {

    divide(6,2);
    divide(6,0);//throws exception

    }

    //Create a method to do division then save the result into database
    public static void divide(int a, int b){

                                        //If the division throws an exception Java will not cut the connection with database
        try {
            System.out.println(a / b + " was saved into database");
        }catch(ArithmeticException e){
            System.out.println("Do not use zero as divisor");
        }finally {       //If you use "Finally code block" at the end, Java will execute the code inside the "finally code" in every (happy and error) scenario
            System.out.println("Cut the connection with the database");
        }                   //after try catch block we use finally to execute the code for every scenario

    }



}
