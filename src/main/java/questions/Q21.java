package questions;

import java.util.Scanner;

public class Q21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number please!");
        int i = input.nextInt();
        System.out.println("Enter the second number please!");
        int k = input.nextInt();

        System.out.println("The max number is "  + (i>k ?  i  : k));




    }
}
