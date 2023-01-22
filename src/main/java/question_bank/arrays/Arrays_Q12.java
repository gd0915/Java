package question_bank.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Q12 {

    /*
        Create an integer array by getting the elements from the user then print the difference
        between the smallest and the greatest elements on the console.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the Array please!");
        int n = input.nextInt();

        int arr [] = new int[n];

        System.out.println("Enter " + n + " elements");
        for(int i = 0; i<n; i++){
           arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));//[20, 59, 41]

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[20, 41, 59]

        System.out.println("The difference between the smallest and the greatest elements = " + (arr[2] - arr[0]));
        //The difference between the smallest and the greatest elements = 39















    }
}
