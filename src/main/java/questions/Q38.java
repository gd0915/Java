package questions;

import java.util.Scanner;

public class Q38 {

    //Create a method to count all characters different from space in a string get the string from user

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String to check how many characters different from space in it, please");
        String str= input.nextLine();

        System.out.println(numOfAllCharsDifferentFromSpace(str));

    }

    public static int numOfAllCharsDifferentFromSpace(String str) {


        str = str.replaceAll("\\s", "").replaceAll("\\p{Punct}", "");
        String [] arr = str.split("");
        int numOfAllChars = arr.length;
        return numOfAllChars;

    }




}
