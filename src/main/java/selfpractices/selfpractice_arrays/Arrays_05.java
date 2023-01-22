package selfpractices.selfpractice_arrays;

import java.util.Scanner;

public class Arrays_05 {

    public static void main(String[] args) {

        // Example 01: Create an array whose length is 4 and print the second element on the console.

        int arr [] = {34, 45, 67, 68};
        int i = arr.length;
        System.out.println(i);
        System.out.println(arr[1]);

        System.out.println("=========");

        //Example 02: Type a code to print all elements in reverse order by putting "*" before each of them on the same line
        int brr [] = {34, 45, 67, 68};

        for(int n = brr.length-1; n>-1; n--){
            System.out.print("*" + arr[n] );
        }

        System.out.println("==============");

        //Example 03:  Type code to print the elements whose indexes are even numbers.
        int crr [] = {34, 45, 67, 68, 88, 92, 87, 65};

        for(int k = 0; k< crr.length; k++){
            if(k%2==0){
                System.out.print( crr[k] + " ");
            }
        }

        System.out.println("====================");

        //Example 04:  Ask user to create an integer array and type all odd numbers on the console.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the num of the elements please");
        int numOfElements = input.nextInt();

        int drr[] = new int[numOfElements];

        for(int n = 0; n<drr.length; n++){
            System.out.println("Enter the " +  (n+1) + ". elements please");
            drr[n] = input.nextInt();
            }

        for(int w : drr) {
            if (w%2 == 1) {
                System.out.print(w + " ");
            }

        }



    }
}
