package question_bank;

import java.util.Scanner;

public class Practise_01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password, please");
        int pwd = input.nextInt();

        String result = pwd%5!=0 ? "It cannot be divided by 5" : pwd%10==0 ? "It is an even which can be divided by 5" : "It is an odd which can be divided by 5";
        System.out.println(result);

    }
}
