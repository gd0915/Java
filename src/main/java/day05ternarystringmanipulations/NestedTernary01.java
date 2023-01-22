package day05ternarystringmanipulations;

public class NestedTernary01 {

    public static void main(String[] args) {

        /*
        Type java code by using nested ternary.
        Write a program to check if a year is leap year or not.
        i)If the year is divisible by 100 then it must be divisible by 400.==>1600+, 2000+, 1800-
        i)If a year is not divisible by 100 then it must be divisible by 4.==>2004+, 1996+, 2021-
 */

        // (y>5) ? (y<10 ? 2*y : 3*y) : (y>10 ? 2+y : 3+y);

        //(12>5) ? (12<10 ? 2*12 : 3*12) : (12>10 ? 2+12 : 3+12);

        int year = 1800;

        String isLeap = year%100==0 ? (year%400==0 ? "Leap" : "Not Leap") : (year%4==0 ? "Leap" : "Not leap");

        System.out.println(isLeap);

        /*
        Type code to check the password
        If it has more than 8 characters, initial should be 'i'
        If it has no more than 8 characters initial should be 'K'
        Solve the task by using nested-ternary
         */

        String pwd = "ia1b3cXyz";

        String isValid = pwd.length()>8 ? (pwd.charAt(0)=='i' ? "Valid" : "Invalid") : (pwd.charAt(0)=='K' ? "Valid" : "Invalid");

        System.out.println(isValid);

            //Note: "length()" will return the number of characters in String
            //Note:  "charAt(0)" will return the first character of object in Char data type



    }
}
