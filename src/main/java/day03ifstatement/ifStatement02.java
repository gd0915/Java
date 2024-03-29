package day03ifstatement;

import java.util.Scanner;

public class ifStatement02 {

    public static void main(String[] args) {

        /*
           Example 1:Type code to print "Weekday" for the weekday names, "Weekend day" for the weekend day names
                     Monday --> Friday ==> Weekday         Saturday --> Sunday ==> Weekend day
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day name");
        String dayName = input.next();

        //Note: To compare Strings use "equals()", do not use "=="
        //Note: When we use "==" Java checks i)The value ii)The address If both are same Java will tell you true

        //Note: "equals()" method checks just the values
        //       If the values are same Java will tell you true

        //1.Way: That code works, but it has many repetitions and Java does many tasks

        if(dayName.equals("Monday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Tuesday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Wednesday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Thursday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Friday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Saturday")){
            System.out.println("Weekend day");
        }
        if(dayName.equals("Sunday")){
            System.out.println("Weekend day");
        }


        //2.Way: I will use if-else statement
        //Note: "equalsIgnoreCase()==> Java does not look at the upper or lower case
        // We should make our code case-insensitive if the user type the data grammatically wrong on the application by adding "IgnoreCase" method after "equals"

        boolean isWeekDay = dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday")
                || dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday")
                || dayName.equalsIgnoreCase("Friday");

        boolean isWeekEndDay = dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday");

        if(isWeekDay){
            System.out.println("Weekday");
        }else if(isWeekEndDay){
            System.out.println("Weekend day");
        }else{
            System.out.println("Invalid day name");
        }

        /*
               Note: "OR" operator in Java is "||"
               How does "||" operator work: "||" operator can be used just with "boolean"s
               1 || 2 --> to write this is not possible

               To get false from "||" operator everything should be false.
               true || true ==> true
               true || false ==> true
               false || true ==> true
               false || false ==> false

         */

        /*
              Beauty of if-else-if statement
              After finding true Java does not check the other conditions
         */




    }
}
