package day26exceptions;

public class E02_Review {

    public static void main(String[] args) {

            divide(6,0);


    }

    public static void divide (int a, int b){
        try {
            System.out.println((a / b + " was saved into database"));
        }catch(ArithmeticException e){
            System.out.println("Do not use zero as divisor");
        }finally {//If you use "Finally code block" at the end, Java will execute the code inside the "finally code" in every scenario
            System.out.println("Cut the connection with the database");//If the division throws an exception Java will not cut the connection with database
        }

    }





}
