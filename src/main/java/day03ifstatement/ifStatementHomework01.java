package day03ifstatement;

import java.util.Scanner;

public class ifStatementHomework01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number, please!");
        int number = input.nextInt();

        if (number == 0 || number == 2 || number == 4 || number == 6 || number ==8){
            System.out.println("The integer is " + "even");
        }
        if (number == 1 || number == 3 || number == 5 || number == 7 || number == 9){
            System.out.println("The integer is " + "odd");
        }
    }
}
