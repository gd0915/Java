package day05ternarystringmanipulations;

import java.util.Scanner;

public class Q01_TernaryOperatorQuestions_Slide_76 {

    /*
    Type java code by using ternary and if-else, ask user to enter an integer, if the integer is even,
    the output will be “The integer is even”. If the integer is odd, the output will be “The integer is odd”.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer, please!");
        int i1 = input.nextInt();

        if (i1%2 == 0){
        System.out.println("The integer is even");
        }else if(i1%2!=0){
            System.out.println("The integer is odd");
        }else{
            System.out.println("Enter an valid integer");
        }

        String result = i1%2==0 ? "The integer is even" : "The integer is odd";
        System.out.println(result);






    }

}
