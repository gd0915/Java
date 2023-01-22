package questions;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Q61 {

    public static void main(String[] args) {

        /*
            Create a function that takes an array and the difference between the largest
            and the smallest numbers.
            Ask user to enter array elements.
         */


        getDifferenceMaxAndMinEle();



    }

    public static void getDifferenceMaxAndMinEle(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements please");
        int numOfElements = scan.nextInt();
        int arr [] = new int[numOfElements];

        for(int i=0; i<arr.length;i++) {
            System.out.println("Enter " + (i + 1) + ". element please");
            arr[i] = scan.nextInt();
        }
            System.out.println(Arrays.toString(arr));
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            System.out.println("The difference between the Maximum and Minimum element is: " + (arr[arr.length-1] - arr[0]));

    }
}
