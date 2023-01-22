package questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q59 {

    /*
                Ask user to enter a number and then check
                How many times a given number is repeated in a sequence
                Create the Java program that finds it.
        */

    public static void main(String[] args) {

        int [] arr = { 1, 1, 2, 3, 3, 4, 1, 2, 6, 8, 3, 9, 12, 14};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check how many times repeated in the given Array");
        int number = input.nextInt();

        int counter = 0;
        for(int i =0; i<arr.length; i++){

           if(number == arr[i]){
               counter++;
           }
        }
        System.out.println("The asked number " + number + " - " +  counter + " times repeated in the given Array");





    }
}
