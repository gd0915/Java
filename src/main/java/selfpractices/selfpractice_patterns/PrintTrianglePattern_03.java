package selfpractices.selfpractice_patterns;

import java.util.Scanner;

public class PrintTrianglePattern_03 {

    public static void main(String[] args) {

        /* Type code to draw the following image by using a for loop.
                         *
                         * *
                         * * *
                         * * * *
                         * * * * *
                         * * * * * *
                         * * * * *
                         * * * *
                         * * *
                         * *
                         *
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows please ");
        int rows = input.nextInt();

        for(int i =1 ; i<=rows; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i =rows-1 ; i>=0; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
