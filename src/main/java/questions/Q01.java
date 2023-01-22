package questions;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

        //Ask user to enter a String and type a Java Program to reverse the String

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String to reverse please!");
        String str = input.nextLine();


        //1.Way
        String reversed = "";
        for(int i=str.length()-1; i>=0; i--){
            String ch = str.substring(i, i+1);
            reversed = reversed + ch;
        }
        System.out.println(reversed);

        //2.Way: by using StringBuilder
        StringBuilder strB = new StringBuilder();
        strB.append(str);
        System.out.println(strB.reverse());


    }
}
