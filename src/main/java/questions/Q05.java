package questions;

import java.util.Arrays;
import java.util.Scanner;

public class Q05 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        /*
        Create a function that takes an array and
	 	returns the difference between the biggest and the smallest numbers.
	    Ask user to enter array elements.
         */

        System.out.println("Enter the number of elements you want to see in your Array");
        int numOfElements = input.nextInt();

        getDifference(4);

    }


        private static void getDifference(int numOfElements ) {
            int arr[] = new int[numOfElements];

            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter " + (i + 1) + " . element");
                arr[i] = input.nextInt();
            }
            System.out.println(Arrays.toString(arr));

            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));

            int differenceGreatestAndSmallestNum = arr[arr.length - 1] - arr[0];
            System.out.println("The difference between the greatest and smallest numbers in the Array " + differenceGreatestAndSmallestNum);


        }

}
