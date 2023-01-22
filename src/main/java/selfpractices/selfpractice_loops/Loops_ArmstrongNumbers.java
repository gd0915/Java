package selfpractices.selfpractice_loops;

import java.util.Scanner;

public class Loops_ArmstrongNumbers {

    public static void main(String[] args) {

        /*
            A number is called an Armstrong number if it equals the sum of the cube of its every digit.
            For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, which equals the
            cube of every digit. Type a code to check if the given number is the Armstrong number or
            not
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check if it is Armstrong or not");
        int num = input.nextInt();

        int digit= 0;
        int sum = 0;

        int temp = num;
        while(num>0){
            digit = num%10;
            sum = sum + digit*digit*digit;
            num = num/10;
        }
        if(sum == temp){
            System.out.println("It is an Armstrong");
        }else{
            System.out.println("It is not an Armstrong");
        }










    }
}
