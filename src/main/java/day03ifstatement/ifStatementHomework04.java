package day03ifstatement;

import java.util.Scanner;

public class ifStatementHomework04 {

    public static void main(String[] args) {

       //Ask user to enter the values of length and width of a rectangle, then check if it is square or not

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length and the width, please!");
        double width = input.nextDouble();
        double length = input.nextDouble();

        if(width != length){
            System.out.println("This is a rectangle!");
        }
        if(width == length){
            System.out.println("This is a square!");
        }






    }
}
