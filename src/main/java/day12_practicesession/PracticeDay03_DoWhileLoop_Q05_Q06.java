package day12_practicesession;

import java.util.Scanner;

public class PracticeDay03_DoWhileLoop_Q05_Q06 {

    //Example 1:Type code to reverse a string

    public static void main(String[] args) {

        String str = "Tom Hanks";
        String reversed = "";

        for (int i = str.length() - 1; i > -1; i--) {
            String ch = str.substring(i, i + 1);
            reversed = reversed + ch;
        }
        System.out.println(reversed);

        //Example 2:Get the initial from full name
        //Tom Hanks ==> TH

        //trim() method removes the spaces just from the beginning and from the end.It does not touch spaces in the middle.
        //substring(startingIndex, endIndex) method is used to get a specific part of a string.
        //starting index is inclusive, ending index is exclusive.

        String fullName = "    Tom Hanks     ";
        String initialFirstName = fullName.trim().substring(0, 1).toUpperCase();
        System.out.println("Initial of first name is: " + initialFirstName);
        String initialLastName = fullName.trim().split(" ")[1].substring(0, 1).toUpperCase();
        System.out.println("Initial of last name is: " + initialLastName);

        System.out.println(initialFirstName + initialLastName);

        System.out.println();

        /*Example 3:
            Username is "admin", Password is "pwd123"
            Ask user to enter username and password
            User should see "Enter your username and password" message
            If user enters correct credentials, he should get "You are in your account!" message
            Otherwise, he should see "Enter your username and password" message 3 times
            After 3 times he should get "Your account is blocked" message
         */

        Scanner input = new Scanner(System.in);
        int counter = 0;

        do {
            if (counter == 3) {
                System.out.println("Your account is blocked");
                break;
            }

        System.out.println("Enter your username");
        String username = input.next();

        System.out.println("Enter your password");
        String pwd = input.next();

        counter++;

        if(username.equals("admin") && pwd.equals("pwd123")) {
            System.out.println("You are in your account!");
            break;
        }

        }while(true);














    }
}
