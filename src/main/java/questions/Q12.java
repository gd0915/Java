package questions;

import java.util.Scanner;

public class Q12 {

    /*
        Two numbers are entered through the keyboard. Write a program to find
        the value of one number raised to the power of another.
     */


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 integers to raise the first number to the power of the second");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

//        double result = Math.pow(num1, num2);
//        System.out.println(result);

        power(num1, num2);

    }

    public static void power(int a, int k){
        int product = 1;
        int i = k;
      while(k >0){
            product = product * a;
            k--;
      }
        System.out.println(product);


    }


}