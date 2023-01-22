package questions;

import java.util.Scanner;

public class Q71 {

    /*
        Ask user to enter the number of lines of a half pyramid.
        Type a program to create the half pyramid.
        For example if the number of lines is 5, the pyramid will be like;
        *
        * *
        * * *
        * * * *
        * * * * *
*/
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows to create an pyramid please!");
        int rows = scan.nextInt();

        for(int i=0; i<rows; i++){
            for(int j =0; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }








    }
}
