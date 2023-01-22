package tasks;

import java.util.Scanner;

public class Task02 {

    /*
    Write a java program to reverse the number which user entered.
    Input  :1238
    Output :Reverse Of The Number: 8321
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number please");

//        String number = input.next();
//        String reversed = "";
//        for(int i = number.length()-1; i>-1; i--){
//        reversed = reversed + number.substring(i, i+1);
//        }
//        System.out.println(reversed );//8321

        int number = input.nextInt();
        int i = number;
        int reversed = 0;
        while(i>0){
           int remainder = i%10;
           reversed = reversed*10+remainder;

           i= i/10;
       }









    }
}
