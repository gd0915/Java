package day10loops;

import java.util.Scanner;

public class Review_NestedForLoop01 {

    public static void main(String[] args) {

         /* 1.Example:Type code to get the output like
        Week: 1
        Day: 1
        Day: 2
        Day: 3
                  .....
        Week: 2
        Day: 1
        Day: 2
        Day: 3
                  ....
        Week: 3
        Day: 1
        Day: 2
        Day: 3
                  ....
 */

        for(int i = 1; i<5 ; i++){

            System.out.println("Week: " + i);

            for(int k =1; k<8 ; k++){

                System.out.println("   Day: " + k);
            }

        }

        System.out.println();

        /*
        2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop  //Interview question
                 ****
                 ****
                 ****
             Note: Get the number of rows and columns from user
            */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = input.nextInt();
        System.out.println("Enter the number of columns");
        int column = input.nextInt();

        for(int i = 1; i<=row ; i++){

            for (int k = 1; k <= column; k++){
                System.out.print("*");
            }
            System.out.println();//That will put the pointer into the next line
        }

        System.out.println();

        /*
        3.Example: Type code to get the output like
               1                //vertical and horizontal repetition
               1 2
               1 2 3
               1 2 3 4
               1 2 3 4 5
     */
        System.out.println("Enter the number of rows");
        int numOfRows = input.nextInt();

        for(int i = 1; i<=numOfRows; i++){

            for(int k = 1; k<=i; k++){
                System.out.println(k);
            }
            System.out.println();
        }

        System.out.println();


















    }
}
