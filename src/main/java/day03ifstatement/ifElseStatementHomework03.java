package day03ifstatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ifElseStatementHomework03 {

    public static void main(String[] args) {

        /*
        Ask user to enter a character, then check whether the character is alphabet or not
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character, please!");
        String character = input.next();

        if(character.equalsIgnoreCase("A + B + C + D + E + F + G +H + I + G + H + I + J + K + L + M + N + O + P + Q + R + S + T + U + V + W + X + Y + Z")){
            System.out.println("alphabet");
        }else{
            System.out.println("non-alphabet");
        }

    }
}
