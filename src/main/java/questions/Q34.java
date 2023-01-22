package questions;

import java.util.Scanner;

public class Q34 {

    public static void main(String[] args) {

        //Ask user to enter a number and then print the sum of the unique digits

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number please!");
        String digits = scan.next();

        int sum =0;

        for(int i=0; i<digits.length(); i++) {

            char c = digits.charAt(i);
            if (digits.indexOf(c) == digits.lastIndexOf(c)) {
                sum += Integer.valueOf("" + c);

            }
        }
            System.out.println(sum);


    }
}
