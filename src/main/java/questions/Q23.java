package questions;

import java.util.Scanner;

public class Q23 {

    public static void main(String[] args) {

        //Aks user a number to find its absolute value

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find its absolute value please!");
        int i = input.nextInt();

        int num = Math.abs(i);
        System.out.println("The abs of the number is " + num );
    }
}
