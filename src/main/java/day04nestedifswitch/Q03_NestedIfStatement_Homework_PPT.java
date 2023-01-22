package day04nestedifswitch;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q03_NestedIfStatement_Homework_PPT {

    /*
    Ask user to enter a password
    If the initial of the password is uppercase then check if it is ‘A’ or not.
    If it is ‘A’ the output will be “Valid Password”
    otherwise the output will be “Invalid Password”
    For example; Ali ==> Valid password - ali ==> Invalid - Mark ==> Invalid
    If the initial of the password is lowercase then check if it is ‘z’ or not.
    If it is ‘z’ the output will be “Valid Password”
    otherwise the output will be “Invalid Password”
    For example; zoe ==> Valid password - Zoe ==> Invalid - john ==> Invalid
         */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the password, please!");
        char pwdInitial = input.next().charAt(0);

        if(pwdInitial >= 'A' && pwdInitial <= 'Z') {

            if (pwdInitial == 'A') {
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid Password");
            }
        }else if(pwdInitial >= 'a' && pwdInitial <= 'z') {

            if (pwdInitial == 'z') {
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid Password");
            }

        } else {
            System.out.println("Invalid Password");
        }



    }
}






