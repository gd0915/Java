package day04nestedifswitch;

import java.util.Scanner;

public class Q06_SwitchStatement_Homework_Q_Bank {

    /*
    Use switch statement to create a simple calculator which does addition, subtraction,
    multiplication, and division with any 2 numbers
    a) When user entered 10.2 and 5 and + sign your code should print "The result is 15.2" on the
    console
    b) When user entered 10 and 5 and - sign your code should print "The result is 5.0" on the
    console
    c) When user entered 10 and 5.3 and * sign your code should print "The result is 53.0" on the
    console
    d) When user entered 10 and -5 and / sign your code should print "The result is -2.0" on the
    console
    e) When user entered 10 and -5 and operation different from +, -, *, / your code should print
    "That operation cannot be done"
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number...");
        double firstNum = input.nextDouble();

        System.out.println("Enter the second number");
        double secondNum = input.nextDouble();

        System.out.println("Enter the operation among +, -, *, /");
        char operator = input.next().charAt(0);

        switch(operator) {
            case '+':
                System.out.println(firstNum + secondNum);
                break;
            case '-':
                System.out.println(firstNum - secondNum);
                break;
            case '*':
                System.out.println(firstNum * secondNum);
                break;
            case '/':
                System.out.println(firstNum / secondNum);
                break;
            default:
                System.out.println("That operation cannot be done!");
                break;
        }




    }
}
