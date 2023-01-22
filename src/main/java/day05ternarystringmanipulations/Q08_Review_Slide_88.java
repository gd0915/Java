package day05ternarystringmanipulations;

import java.util.Locale;
import java.util.Scanner;

public class Q08_Review_Slide_88 {

    /*
            Ask user to enter his/her first name, last name and Social Security Number.
        Then type a program which makes
        a) initials of the first name and the last name in uppercase,
        other characters will be in lowercase.
        b) all characters except last 4 characters of the Social Security Number “ * ”.
         For example; Suleyman Alptekin *****5678
     */

    public static void main(String[] args) {

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter your first name, please!");
        String firstName = input2.nextLine().toLowerCase();
        System.out.println("Enter your last name, please1");
        String lastName = input2.nextLine().toLowerCase();
        System.out.println("Enter your Social security number, please!");
        String ssn = input2.next();

        String initialFirstName = firstName.substring(0,1).toUpperCase();
        String restOfFirstName = firstName.substring(1).toLowerCase();

        String initialLastName = lastName.substring(0,1).toUpperCase();
        String restOfLastName = lastName.substring(1).toLowerCase();

        String firstFiveCharactersOfSsn = ssn.substring(0,5).replaceAll("[0-9]","*");
        String lastFourCharactersOfSsn = ssn.substring(5);
        String newSsn = firstFiveCharactersOfSsn +lastFourCharactersOfSsn;

        System.out.println(initialFirstName + restOfFirstName + " " + initialLastName + restOfLastName + " " + newSsn);















//
//
//        String newSsn = "*****" + ssn.substring(5);
//
//
//        String name1 = fName.substring(0,1).toUpperCase();
//        String name2 = fName.toLowerCase().substring(1);
//
//        String name3 = lName.substring(0,1).toUpperCase();
//        String name4 = lName.toLowerCase().substring(1);
//
//
//
//        System.out.println(name1+name2 + " " + name3+name4 + " " +newSsn);



    }


}
