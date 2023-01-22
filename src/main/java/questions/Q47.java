package questions;

import java.util.Scanner;

public class Q47 {

        //Ask user to enter a number and then print the sum of the unique digits

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number please ");
        int number = input.nextInt();

        String strNum = String.valueOf(number);

        int sum=0;
        for(int i =0; i<strNum.length(); i++){

            String ch = strNum.substring(i, i+1);

            if(strNum.indexOf(ch) == strNum.lastIndexOf(ch)){
               sum += Integer.valueOf(ch);
            }
        }
        System.out.println(sum);











    }
}
