package day03ifstatement;

import java.util.Scanner;

public class IfElseIfStatement_Example03_Slide_71 {

    /*
            Type java code by using if-else if() statement.
        A school has the following rules for grading system:
        1. Below 50 - D 2. 50 to 59 - C 3. 60 to 80 - B. 4. From 80 to 100 - A
        Ask user to enter marks and print the corresponding grade.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your mark, please!");
        byte grade = input.nextByte();

        if(grade<50 && grade>=0){
            System.out.println("D");
        }else if(grade>=50 && grade<=59){
            System.out.println("C");
        }else if(grade>=60 && grade<80){
            System.out.println("B");
        }else if(grade>=80 && grade<=100){
            System.out.println("A");
        }else{
            System.out.println("Invalid mark");
        }

    }

}
