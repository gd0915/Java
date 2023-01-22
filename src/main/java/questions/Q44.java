package questions;

import java.util.Scanner;

public class Q44 {

    public static void main(String[] args) {

        /*
        Write java code checking the number is Perfect number or not.

        * Any number can be a Java Perfect Number if the sum of its positive divisors
        excluding the number itself is equal to that number.
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it is perfect number");
        int number = scan.nextInt();

        int sum=0;
        for(int i = 1; i<number; i++){

            if(number%i == 0){
                sum += i;
            }
        }
        if(sum == number){
            System.out.println("This number is a perfect number");
        }else{
            System.out.println("It is not a perfect number");
        }

    }
}
