package day09loops;

import java.util.Scanner;

public class ForLoop02 {

    public static void main(String[] args) {

        //Example 1: Type code to print characters except "m" in a String
        //For example, Andromeda ==>Androeda

        String str = "Mama";

        //1.Way:
        for(int i =0 ; i<str.length(); i++){

            char ch =str.charAt(i);

            if(ch!='m'){
                System.out.print(ch);
            }
        }

        System.out.println();

        //2.Way: better way for skip

        for(int i =0 ; i<str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'm') {
                continue;   // If the condition is true, continue will skip specific value
                            // If continue works, Java will stop to execute the code, and  will come to the increment part
                            // If the condition is false, continue will not work, Java will not skip a value
                            //If you want to skip any value in a loop, use "continue"
            }
            System.out.print(ch);
        }

        System.out.println();

        //Example 2: Type code to print characters before "m" in a String
        //              Luxembourg ==>

        String city = "Luxembourg";

        for(int i =0 ; i<city.length(); i++){

            char ch = city.charAt(i);

            if (ch == 'm') {
                break; //Java will go outside the loop if the condition is true
                        //If you want to break any loop under some conditions you can use "break" keyword
            }
            System.out.print(ch);

        }

        System.out.println();

        //Example 3: Type code to find the sum of the unique digits in an integer
        //For example , 1232 ==> 1+3=4

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer to see the sum of the unique digits in it");
        String num = input.next();

        int sum = 0;

        for(int i =0; i<num.length(); i++){

            String digit = num.substring(i, i+1);

            if(num.indexOf(digit) == num.lastIndexOf(digit)){

                sum = sum + Integer.valueOf(digit);

            }
        }

        System.out.println(sum);
















    }
}
