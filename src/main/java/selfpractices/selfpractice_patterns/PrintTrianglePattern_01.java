package selfpractices.selfpractice_patterns;

import java.util.Scanner;

public class PrintTrianglePattern_01 {

    /* Print this triangle shape by using for loop

     *
     * *
     * * *
     * * * *
     * * * * *
     */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rows number please: ");

        int rows = scan.nextInt();

        for(int i =1; i<=rows; i++){
            for(int k = 1; k<=i; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }








    }
}


