package questions;

import java.util.Scanner;

public class Q75 {

    /*
	  	Ask user to enter the number of lines of an inverted pyramid.
	  	Type a program to create the inverted pyramid.
  	    For example; if the number of lines is 5, the pyramid will be like; * * * * * * * * *
																			  * * * * * * *
																			    * * * * *
																			      * * *
																			        *
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows to create an pyramid please!");
        int rows = scan.nextInt();

        for(int i=0; i<rows; i++){

           for(int j= 0; j<i; j++){

               System.out.print("  ");
           }
           for(int k= i; k<rows; k++){

                System.out.print("*" + " ");
            }
            for(int l= i; l<rows-1; l++ ){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
