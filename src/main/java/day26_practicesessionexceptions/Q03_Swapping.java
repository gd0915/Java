package day26_practicesessionexceptions;

import java.util.Scanner;

public class Q03_Swapping {

    //Ask user enter 2 numbers then swap them
    //a=12; and b=13; ===> a=13; and b=12

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter first number");
            double a = input.nextDouble();

            System.out.println("Enter second number");
            double b = input.nextDouble();

            System.out.println("Before swapping: " + a + " " + b);
            double temp = 0;
            temp = a;
            a = b;
            b = temp;

            System.out.println("After swapping: " + a + " " + b);

        }catch (Exception e){
            System.out.println("Something went wrong while swapping");
        }



        //2.Way:
//        System.out.println("Before swapping: " + a + " " +  b);
//        a= a+b;
//        b= a-b;
//        a= a-b;
//        System.out.println("After swapping: " + a + " " + b);

    }
}
