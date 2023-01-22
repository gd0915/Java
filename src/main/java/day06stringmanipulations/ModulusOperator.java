package day06stringmanipulations;

import java.util.Scanner;

public class ModulusOperator {

    /*
    Modulus operator:"%" is called modulus operator in Java.
    It returns the remainder in a division operation
    13/5 ==> 3 Modulus operator gives you 3.
    13%5 ==> 3
     */

    public static void main(String[] args) {
//
//        //Ask user to enter an Integer then print 'Even' on the console if the number is even.
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter an integer, please!");
//        int num = input.nextInt();// -1000, -10, 0 ==> We should always consider Boundary values: -1000, -99, -10, 0 and so on.
//                                //We should use Math.abs(variable name)
//
//        int absNumber = Math.abs(num);
//        System.out.println("Is the number even? " + (absNumber%2==0));
//
//        //2. Step: Checking Odd
//
//        Scanner input2= new Scanner(System.in);
//        System.out.println("Enter a digit to check if it is an odd  number ");
//
//        int checkOdd =input2.nextInt();
//        int absCheckOdd = Math.abs(checkOdd);
//        System.out.println("Is the number odd? " + (absCheckOdd%2 != 0));
//

//        //2.Way:
//        if(num%2==0){
//            System.out.println("The integer is " + "Even");
//        }else{
//            System.out.println("The integer is " + "Odd");
//        }

        /*
            Ask user to enter a 3 digits integer then find the sum of the digits.
            For Ex; when the user enters 2-3-7 into the system we should first use modulus method like;
            237%10= 7 and then
         */

        Scanner threeDigitsNumber = new Scanner(System.in);
        System.out.println("Enter a 3 digits integer, please!");
        int absThreeDigitsNumber =threeDigitsNumber.nextInt();

        int last = absThreeDigitsNumber%10;
        absThreeDigitsNumber=absThreeDigitsNumber/10;

        int second = absThreeDigitsNumber%10;

        absThreeDigitsNumber=absThreeDigitsNumber/10;
        int first = absThreeDigitsNumber%10;

        System.out.println("The sum of the 3 digits is " + (last+second+first));





    }

}
