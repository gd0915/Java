package day03_practicesessionifstatement;

import java.util.Scanner;

public class PracticeDay01_Q01_IfStatement {

    public static void main(String[] args) {
        /*
        If the score is less than 50 then you will fail
        If the score is greater than 50 then you will pass,

        If the score is less than 50 then you will fail otherwise you will pass.(this way is better as it is shorter)
        here only one condition will be checked.

        if the first part is true then the first action eill occur but
        if the first condition is false then the second action eill occur,this is the logic of "if else".
         */

        //1.step: Create object from Scanner class
        Scanner input = new Scanner(System.in);

        //2.Step: Send message to the user.Ask user to enter his/her grade
        System.out.println("Enter your grade");

        //3.Step: Create a container with the appropriate data type
        int score = input.nextInt();

        //4.Step: Type code condition with if statement

//        1.way: with if else.
//        if(score >= 50){
//            System.out.println("You passed");
//        }else {
//            System.out.println("You failed");
//        }

        //2.way: with multiple if statements

//        if (score < 50) {
//            System.out.println("You failed");
//        }
//        if (score >= 50) {
//            System.out.println("You passed");
//        }

        //3.way:
        if (score < 50) {
            System.out.println("You failed");
        } else if ((score >= 50) && (score<=100)) {
            System.out.println("You passed");
        } else if ((score<=0) || (score>100)){
            System.out.println("Enter a valid score");
        }


    }
}

