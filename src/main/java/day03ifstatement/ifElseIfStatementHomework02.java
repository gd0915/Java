package day03ifstatement;

import java.util.Scanner;

public class ifElseIfStatementHomework02 {

    /*Type java code by using if-else if() statement,
    If age is less than 13 output will be “Should not work”,
    If age is greater than 65 output will be “Retired”,
    Otherwise; output will be “Should work”
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter yor age, please!");
        int age = input.nextInt();

        if(age<0){
            System.out.println("Enter a valid age,please!");
        }else if(age<13){
            System.out.println("Should not work!");
        }else if(age>65){
            System.out.println("Retired");
        }else{
            System.out.println("Should work");
        }








    }


}
