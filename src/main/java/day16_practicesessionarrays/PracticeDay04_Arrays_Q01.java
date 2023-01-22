package day16_practicesessionarrays;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeDay04_Arrays_Q01 {
    public static void main(String[] args) {

        // Example 1: Ask user to enter the number of the names into the application by using an Array then take the number of the elements and
        // then print them on the console.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the elements of the Array");
        int length = input.nextInt();

        String arrNames[] = new String[length];


        //insert the elements into the array

        for(int i = 0; i<length; i++){
            System.out.println("Enter the name of " + (i+1) + ". elements please! Please press 'Q' to quit");

            String employeeName = input.next();

            if(!employeeName.equalsIgnoreCase("Q")){
                arrNames[i]=employeeName;
            }else{
                break;
            }
        }
        System.out.println(Arrays.toString(arrNames));


        //Example 2: Type code to print the sum of min and max integers in an Array

        int arr [] = {12, 56, 89, 5, 34, 92};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[5, 12, 34, 56, 89, 92]

        System.out.println(arr[arr.length-1] + arr[0]);


    }
}
