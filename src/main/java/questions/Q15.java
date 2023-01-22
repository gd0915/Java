package questions;

import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {

            //Type Java program to see repeated characters in A String

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String to see repeated characters in it");
        String str = input.nextLine();

        findRepeatedChars(str);

    }

    public static void findRepeatedChars(String str2){

        str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        String repeatedChars = "";


        for(int i = 0; i<str2.length(); i++){
            String ch = str2.substring(i, i+1);
                if(str2.indexOf(ch) != str2.lastIndexOf(ch) && !repeatedChars.contains(ch)){
                    repeatedChars += ch + " ";
                }
        }
        System.out.print(repeatedChars);

    }
}
