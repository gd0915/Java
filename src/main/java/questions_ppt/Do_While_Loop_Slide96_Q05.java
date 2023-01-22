package questions_ppt;

import java.util.Scanner;

public class Do_While_Loop_Slide96_Q05 {

    public static void main(String[] args) {

        /*
            Ask user to enter a number.
        If the number is divisible by 10 then print "Won!" on the console
        otherwise ask user to enter another number.
        Use do-while loop
         */

        Scanner input = new Scanner(System.in);


        int num = 0;

        do {
            System.out.println("Enter a number please");
            num = input.nextInt();

            if(num%10==0){
                System.out.println("Won");
                break;
            }
        }while(true);








    }
}
