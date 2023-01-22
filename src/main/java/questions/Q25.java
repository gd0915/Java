package questions;

import java.util.Scanner;

public class Q25 {

    public static void main(String[] args) {

        /*
            Ask user to enter a character and type in the console if it is upper case or lower case
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter please!");
        char ch = input.next().charAt(0);

        if( ch >= 'a' && ch<= 'z'){
            System.out.println("The letter you entered is lowercase");
        }else if(ch >= 'A' && ch<= 'Z'){
            System.out.println("The letter you entered is upper case");
        }else{
            System.out.println("The character you entered is not a letter");
        }



    }
}
