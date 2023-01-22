package day05ternarystringmanipulations;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q04_Review_Slide_87 {

    /*
            Ask user ta enter his/her first and last name. If the first name is longer
        output will be “First name is longer.” If the length of last name is equal
        To the length of last name output will be “First name and last name
        have same length.” Otherwise, output will be “Last name is longer”
     */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name and last name, please!");
        String firstName = input.nextLine();
        String lastName = input.nextLine();

        if(firstName.length()>lastName.length()){
            System.out.println("First name is longer");
        }else if(firstName.length()==lastName.length()){
            System.out.println("First name and last name have same length");
        }else{
            System.out.println("Last name is longer");
        }

    }













}
