package questions_ppt;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrays_Q06_Slide142 {

    public static void main(String[] args) {

//        //Write a Java program to remove a specific element from an array.

        int arr [] =  { 1,2, 3,4,5,6 };

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element you want to remove");
        int element = input.nextInt();


        int idx1= 0;
        int removed [] = new int[arr.length-1];

            for (int i = 0; i < arr.length; i++) {

                    if (arr[i] != element) {
                        removed[idx1] = arr[i];
                        idx1++;
                    }
                }
        System.out.println(Arrays.toString(removed));













    }
}
