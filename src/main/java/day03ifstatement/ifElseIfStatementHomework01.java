package day03ifstatement;

import java.util.Scanner;

public class ifElseIfStatementHomework01 {

    /*
    Type java code by using if-else if() statement,
    if both of the two integers are positive, output will be the sum of them.
    If both of the two integers are negative, output will be the multiplication of them.
    Otherwise; output will be “I cannot add or multiply different signed numbers”
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer, please!");
        int int1 = input.nextInt();
        System.out.println("Enter the second integer, please!");
        int int2 = input.nextInt();

        if(int1%2 == 0 && int2%2 == 0){
            System.out.println("int1 + int2");
        }else if(int1%2 != 0 && int2%2 != 0) {
            System.out.println("int1 * int2");
        }else{
                System.out.println("I cannot add or multiply different signed numbers");
            }





    }
}
