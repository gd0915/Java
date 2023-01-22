package questions;

import java.util.Arrays;
import java.util.Scanner;

public class Q60 {

    // Get String from user and print just vowels(aeiou) inside String on the console

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String to find the vowels in it");
        String str = scan.nextLine();

        str = str.toLowerCase().replaceAll("\\s", "");
        System.out.println(str);

        //1.Way:
        str = str.replaceAll("[^aeiou]", "");
        System.out.println(str);

        //2.Way : by using switch statement
//        for(int i=0; i<str.length(); i++){
//            String ch = str.substring(i, i+1);
//            switch (ch) {
//                case "a":
//                    System.out.print(ch + " ");
//                    break;
//                case "e":
//                    System.out.print(ch + " ");
//                    break;
//                case "i":
//                    System.out.print(ch + " ");
//                    break;
//                case "o":
//                    System.out.print(ch + " ");
//                    break;
//                case "u":
//                    System.out.print(ch + " ");
//                    break;
//            }
//        }




    }
}
