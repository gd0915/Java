package questions;

import java.util.Scanner;

public class Q07 {



    public static void main(String[] args) {
        /*
            A number is called an Armstrong number if it equals to the sum of the cube of its every digit.
            For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, which is equal to 1^3+5^3+3^3.
            You need to write a program to check if the given number is Armstrong number or not.//548834
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a Armstrong or not ");
        String strNumber = scan.next();

        isArmstrong(strNumber);

    }

    public static void isArmstrong(String strNumber){

        String arr [] = strNumber.split("");

        int sum = 0;
        for(String w : arr){
            sum += Math.pow(Integer.valueOf(w), arr.length);
        }
        if(sum==Integer.valueOf(strNumber)){
            System.out.println("It is armstrong");
        }else{
            System.out.println("It is not armstrong");
        }




    }







}
