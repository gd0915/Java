package questions;

import java.util.Arrays;
import java.util.Scanner;

public class Q36 {

    public static void main(String[] args) {

        /*
            A four-digit number "ABCD" is called  Lucky if A+B = C+D
            Write a program that asks the user to enter a four-digit number and tell if the number is a lucky number or not
            Example: 3719 ==> 3+7 = 1+9  This is a Lucky number
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a four digit number, please");
        int number = scan.nextInt();

        String numb = String.valueOf(number);
        String arr[] = numb.split("");

        if (number > 999 && number < 10000) {
            int ab = 0;
            int cd = 0;

            for (int i = 0; i < numb.length() / 2; i++) {
                ab += Integer.valueOf(arr[i]);
            }


            for (int j = numb.length() / 2; j < numb.length(); j++) {
                cd += Integer.valueOf(arr[j]);
            }

            if (ab == cd) {
                System.out.println("Lucky Number");
            } else {
                System.out.println("Not Lucky");
            }


        } else {
            System.out.println("The number you have given is not 4 digit! Please try again!");
        }


    }

    }
