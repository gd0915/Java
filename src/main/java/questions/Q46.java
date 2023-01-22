package questions;

import java.util.Scanner;

public class Q46 {

    public static void main(String[] args) {

        //  Ask user to enter 4 digit number and type a Java program to check
        //  the equality of the sum of first and third and second and last digit :
        //  Example: 1573 ==> 1+7 = 5+3 ==>Print "Good" if the sum are equals

        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer please");
        int number = input.nextInt();
        String numb = String.valueOf(number);
        String arr[] = numb.split("");


            int ab = 0;
            int cd = 0;

            for (int i = 0; i < numb.length(); i = i + 2) {
                ab += Integer.valueOf(arr[i]);
            }

            for (int j = 1; j < numb.length(); j = j + 2) {
                cd += Integer.valueOf(arr[j]);
            }

            if (ab == cd) {
                System.out.println("Good");
            } else {
                System.out.println("Bad");
            }







    }
}
