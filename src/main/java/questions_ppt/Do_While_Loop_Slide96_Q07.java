package questions_ppt;

import java.util.Scanner;

public class Do_While_Loop_Slide96_Q07 {

    public static void main(String[] args) {

        /*
        Ask user to enter a String
        Print the characters whose indexes are odd on the console
        For example; Germany ==> e m n
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String please!");
        String s = input.next();

        int i= 0;

        do {

            String c = s.substring(i, i + 1);
            if (s.indexOf(c) % 2 != 0) {
                System.out.print( c + " ");
            }
            i++;
        }while(i<s.length());

    }
}
