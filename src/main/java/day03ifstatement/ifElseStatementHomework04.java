package day03ifstatement;

import java.util.Scanner;

public class ifElseStatementHomework04 {

    public static void main(String[] args) {

        /*
            Ask user to enter any name of the week, then get second ,fourth,
            and sixth letter of the day name and print them on the console,
            in the same line.
                For example; if the user enters “Monday” output will be “ody”
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the day");
        String dayName = input.next();

        if(dayName.equalsIgnoreCase("Monday")){
            System.out.println("ody");
        }else if(dayName.equalsIgnoreCase("Tuesday")){
            System.out.println("usa");
        }else if(dayName.equalsIgnoreCase("Wednesday")){
            System.out.println("end");
        }else if(dayName.equalsIgnoreCase("Thursday")){
            System.out.println("hrd");
        }else if(dayName.equalsIgnoreCase("Friday")){
            System.out.println("rdy");
        }else if(dayName.equalsIgnoreCase("Saturday")){
            System.out.println("aud");
        }else if(dayName.equalsIgnoreCase("Sunday")){
            System.out.println("udy");
        }else{
            System.out.println("invalid day name");
        }



    }
}
