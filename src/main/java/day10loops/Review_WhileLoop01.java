package day10loops;

import java.util.Scanner;

public class Review_WhileLoop01 {
    public static void main(String[] args) {

        //Type code to  print integers from 3 to 6

        //1.Way: for-loop
        for (int i = 3; i < 7; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        //2.Way: while-loop
        int i = 3;

        while (i < 7) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        //Example 2: Type code to print odd integers from 12 to 67 in the same line with a space between them

        int num = 12;

        while (num < 68) {

            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
            num++;
        }

        System.out.println();

        //3.Example: Type code to find the sum of integers from 12 to 67

        int k = 12;
        int sum = 0;

        while (k < 68) {

            sum=sum+k;
            k++;

        }
        System.out.println("The sum is " + sum);


        System.out.println();

         /*  4.Example: Type java code by using while loop,
            Write a program that prompts the user to input an integer.
            It should then find the sum of the digits of that number.
            123 ==> 1+2+3 = 6 */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer please!");
        int x = input.nextInt();

        int sumOfDigits = 0;

        while(x>0){
            sumOfDigits = sumOfDigits + x%10;
            x=x/10;
        }
        System.out.println(sumOfDigits);

        System.out.println();


         /*
            Example 5: Type java code by using while loop,
               Write a program that prompts the user to input a number.
               It should then print the multiplication table of that number.
               3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30
                */

        System.out.println("Enter an Integer to see multiplication table!");
        int n = input.nextInt();

        int p = 1;

        while(p<11){

            System.out.println(n + "x" + p + " = " + n*p);
            p++;
        }








    }
}
