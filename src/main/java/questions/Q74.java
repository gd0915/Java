package questions;

import java.util.Scanner;

public class Q74 {
    /*
    Ask user to enter the number of lines of a pyramide.
    Type a program to create the pyramide.
    For example if the number of lines is 5, the pyramide will be like;
                   *
                 * * *
               * * * * *
             * * * * * * *
           * * * * * * * * *

     */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows to create an pyramid please!");
        int rows = scan.nextInt();

        for(int i=0; i<rows; i++){

            for(int j=i; j<rows; j++){

                System.out.print("  ");
            }
            for( int k=0; k<=i; k++){

                System.out.print("*" + " ");
            }
            for(int l= 0; l<i; l++){

                System.out.print("*" + " ");
            }
            System.out.println();
        }




    }
}
