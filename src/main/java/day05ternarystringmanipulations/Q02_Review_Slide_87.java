package day05ternarystringmanipulations;

import java.util.Scanner;

public class Q02_Review_Slide_87 {

    /*
        Ask user to enter his kid’s name, if the name contains “a” output will be “This name contains ‘a’.”
    if the name contains “z” output will be “This name contains ‘z’.” Otherwise, output will be
    “This name contains neither ‘a’ nor ‘z’.”
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your kid's name,please!");
        String name =input.nextLine();

        if(name.contains("a") && !name.contains("z")){
            System.out.println("This name contains a");
        }else if(name.contains("z") && !name.contains("a")){
            System.out.println("This name contains z");
        }else if(name.contains("a") && (name.contains("z"))) {
            System.out.println("This name contains both 'a' and 'z'");
        }else{
            System.out.println("This name contains neither ‘a’ nor ‘z’");
        }
    }
}
