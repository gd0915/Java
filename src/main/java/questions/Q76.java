package questions;

import java.util.Scanner;

public class Q76 {

    /*
	 Type code to draw isosceles right triangle whose side length will be given by user.
	 For example; if the side is 5 triangle will be like;   *
															* *
															*   *
															*     *
															* * * * *
	 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows to create an pyramid please!");
        int rows = scan.nextInt();

        for(int i= 0; i<rows; i++){

            for(int j=0; j<=i; j++){

                if(i == 2 && j == 1){
                    System.out.print("  ");
                }else if(i == 3 && j == 1){
                    System.out.print("  ");
                }else if(i == 3 && j == 2) {
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }





    }
}
