package questions;

import java.util.Scanner;

public class Q56 {


    public static void main(String[] args) {

        /*
        Ask user to enter 2 integer then find GCD (The Greatest Common Divisor) and LCM (The Least Common Multiple)
        Input :
        30 and 40
        Expected OutPut:
        GCD for 30 and 40 = 10

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number/integer please");
        int num1 = input.nextInt();
        System.out.println("Enter the second number/integer please");
        int num2 = input.nextInt();

        int num = Math.min(num1, num2);

        int gcd = 0;
        for(int i = 1; i<=num; i++){

            if(num1%i==0 && num2%i==0){

                gcd = i;

            }
        }
        System.out.println("The Greatest Common Divisor of  " + num1 + " and " + num2 + " is " + gcd);

        int lcm = (num1 * num2) / gcd;

        System.out.println("The Least Common Multiple of " + num1 + " and " + num2 + " is " + lcm);


    }
}
