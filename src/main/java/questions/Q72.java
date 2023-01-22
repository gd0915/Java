package questions;

import java.util.Scanner;

public class Q72 {

    /*
	  	Ask user to enter the number of lines of a inverted half pyramid.
	  	Type a program to create the inverted half pyramid.
	    For example if the number of lines is 5, the pyramid will be like;
	        * * * * *
			* * * *
			* * *
			* *
			*
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows to create an pyramid please!");
        int rows = scan.nextInt();

        for(int i= 0; i<rows; i++){

            for(int j = rows-i; j>0; j--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
