package questions;

import java.util.Scanner;

public class Q69 {

    /*   At-bashCode ; It is a simple method based on the Hebrew alphabet to encrypt or decrypt a text.
         The first letter of the alphabet is used instead of the last letter.
        "abcdefghijklmnopqrstuvwxyz"; 26 character
        "zyxwvutsrqponmlkjihgfedcba";       */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a message to convert it to At-bashCode");
        String str = scan.nextLine().toLowerCase();

        //1.way

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        String useThis =   "zyxwvutsrqponmlkjihgfedcba";



        for(int j=0; j<str.length(); j++) {


            System.out.print(useThis.charAt(alphabet.indexOf(str.charAt(j))));
        }
        System.out.println();








    }
}
