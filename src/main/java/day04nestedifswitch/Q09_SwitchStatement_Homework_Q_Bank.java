package day04nestedifswitch;

import java.util.Scanner;

public class Q09_SwitchStatement_Homework_Q_Bank {

    /*Create an Enum whose name is ‘Seasons’ and print the following by using the Enum in
    switch-on statement
    For winter print 'Snowboarding'
    For summer and spring print 'Fishing'
    For fall print 'Trekking
    */

     public enum Seasons{
         WINTER, SUMMER, FALL, SPRING
     }

         public static void main(String[] args) {

             Scanner input = new Scanner(System.in);
             System.out.println("Enter the season ");
             String season = input.next().toUpperCase();

             switch(season){
                 case "WINTER":
                     System.out.println("Snowboarding");
                     break;
                 case "SUMMER":
                 case "SPRING":
                     System.out.println("Fishing");
                     break;
                 case "FALL":
                     System.out.println("Trekking");
                     break;
                 default:
                     System.out.println("Undefined season");

         }
     }
    }
