package questions;

import java.util.Scanner;

public class Q24 {

    public static void main(String[] args) {

        //Ask user age and gender to check if they can get retired

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age please!");
        int age = input.nextInt();

        if(age>=18) {

            System.out.println("Enter the initial of your gender please!");
            char ch = input.next().toLowerCase().charAt(0);

            if (ch == 'f') {

                if (age > 60) {
                    System.out.println("You can get retired!");
                } else {
                    System.out.println("You should still work until the age of 60");
                }
            } else {

                if (age > 65) {
                    System.out.println("You can get retired!");
                } else {
                    System.out.println("You should still work until the age of 65");
                }
            }
        }else{
            System.out.println("You cannot work/or you entered invalid value");
        }

    }
}
