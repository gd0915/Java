package questions_ppt;

import java.util.Scanner;

public class Do_While_Loop_Slide96_Q06 {

    public static void main(String[] args) {

        /*
            Ask user to enter a name.
            If the name contains the letter ‘a’ then print "Won!" on the console
            otherwise ask user to enter another name.
            Use do-while loop.
         */

        Scanner input = new Scanner(System.in);


        do {
            System.out.println("Enter your name please!");
            String name = input.next();

            if (name.contains("a")) {
                System.out.println("Won!");
                break;
            }
        }while (true) ;
        }


    }

