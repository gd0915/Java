package day04nestedifswitch;

import java.util.Scanner;

public class Q08_SwitchStatement_Homework_Q_Bank {

    /*Create an Enum and put the browser names in it like CHROME, SAFARI, IE, FIREFOX,
    YANDEX. Use switch statement and print ‘I am using CHROME’ for CHROME, 'I am using
    SAFARI’ for SAFARI, 'I am using IE for IE', 'I am using FIREFOX for FIREFOX', and 'I am using
    YANDEX’ for YANDEX, 'Not valid browser' for browsers different from CHROME, SAFARI, IE,
    FIREFOX, YANDEX.
            Note: You should create enum on developer console
            */

    public enum Browsers{
        CHROME, SAFARI, IE, FIREFOX, YANDEX
    }

     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         System.out.println("Enter your browser,please!");
         String browser = input.next().toUpperCase();

         switch(browser){
             case "CHROME":
                 System.out.println("I am using CHROME");
                 break;
             case "SAFARI":
                 System.out.println("I am using SAFARI");
                 break;
             case "IE":
                 System.out.println("I am using IE");
                 break;
             case "FIREFOX":
                 System.out.println("I am using FIREFOX");
                 break;
             case "YANDEX":
                 System.out.println("I am using YANDEX");
                 break;
             default:
                 System.out.println("It is not valid browser");
         }






    }


}
