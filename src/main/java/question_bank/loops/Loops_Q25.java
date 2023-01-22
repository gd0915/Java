package question_bank.loops;

import java.util.Scanner;

public class Loops_Q25 {

    public static void main(String[] args) {
        /*
        A number is called an Armstrong number if it equals the sum of the cube of its every digit.
        For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, which equals the
        cube of every digit. Type a code to check if the given number is the Armstrong number or
        not
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to check if it is Armstrong number or not");
        int n = scan.nextInt();
        int sumOfCubes = 0;
        int temp = n;
        int digit = 0;

        while(n>0) {
            digit = n%10;
            sumOfCubes = sumOfCubes + digit*digit*digit;
            n = n/10;
        }
        if(temp==sumOfCubes) {
            System.out.println(temp + " is Armstrong number");
        }else {
            System.out.println(temp + " is not Armstrong number");
        }













    }
}
