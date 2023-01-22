package day04nestedifswitch;

import java.util.Scanner;

public class Q01_SwitchStatement_Slide_82 {


    /* If the user pressed 1, 2, 3 the program will print the number that is pressed; otherwise,
    program will print "Not allowed"
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number among 1, 2, 3, please!");
        int num1 = input.nextInt();

        switch(num1){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("Not allowed");
        }
    }

}
