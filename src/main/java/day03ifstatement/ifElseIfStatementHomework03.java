package day03ifstatement;

import java.util.Scanner;

public class ifElseIfStatementHomework03 {

    /*
    Type java code by using if-else if() statement.
    A school has following rules for grading system:
    1. Below 50 - D 2. 50 to 59 - C 3. 60 to 80 - B. 4. From 80 to 100 - A
    Ask user to enter marks and print the corresponding grade
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade, please!");
        byte grade = input.nextByte();

        if(grade<0){
            System.out.println("Enter a valid grade!");
        }else if(grade<50){
            System.out.println("D 2 ");
        }else if(grade>=50 & grade<=59){
            System.out.println("C 3 ");
        }else if(grade>=60 & grade<80){
            System.out.println("B 4 ");
        }else if(grade>=80 & grade<=100){
            System.out.println("A ");
        }else{
            System.out.println("Invalid grade");
        }
    }
}
