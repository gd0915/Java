package questions;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        /*
        Check PERFECT NUMBER using for Loop
        A perfect number is a number that is equal to the sum of its positive divisors
        (excluding the number itself). For example, 6, 28, 496 etc. are perfect number
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to check if it is perfect number");
        int number = scan.nextInt();
        number = Math.abs(number);

        int sum = 0;
        for(int i= 1; i<number; i++){

            if(number%i==0){
                sum += i;
            }
        }
        System.out.println(sum);

        if(sum==number){
            System.out.println("It is a perfect number");
        }else{
            System.out.println("This number is not a perfect number");
        }

    }
}
