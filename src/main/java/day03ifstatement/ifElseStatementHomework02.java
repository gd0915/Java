package day03ifstatement;

import java.util.Scanner;

public class ifElseStatementHomework02 {

    public static void main(String[] args) {

        /*
        Ask user to enter his/her age and gender. If the age is more than 65 and the gender is male
        then output will be “Hey man you retired!” else output will be “No need to work
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age and gender, please!");
        double age = input.nextDouble();
        String gender = input.next();

        if(age > 65 && gender.equalsIgnoreCase("male")){
            System.out.println("Hey man you retired!");
        }else{
            System.out.println("No need to work!");
        }


    }
}
