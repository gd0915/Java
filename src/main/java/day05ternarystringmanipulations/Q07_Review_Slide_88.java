package day05ternarystringmanipulations;

import java.util.Scanner;

public class Q07_Review_Slide_88 {
    /*
        Ask user to enter password,

        if the password is okay for the following conditions
        output will be
        “Your password is created successfully.”

        If the password is not okay for any of the following conditions
        Output will be “Enter a new password according to the give conditions”

        1.First letter must be uppercase
        2.Last letter must be lowercase
        3.Password must contain 6 characters
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the password, please!");
        String pwd = input.next();

        char firstLetter= pwd.charAt(0);
        int lastLetter= pwd.charAt(pwd.length()-1);


        if ((firstLetter>64 && firstLetter<91) && (lastLetter>96 && lastLetter<123) && (pwd.length()==6)) {

            System.out.println("Your password is created successfully.");

        } else {

            System.out.println("Enter a new password according to the give conditions");
        }




    }











}
