package questions;

import java.util.Scanner;

public class Q92 {

    /*Type code to check the grammatical rules for full name
    a) Your code should print “Error in initials” for “ali Can”, “Ali can”, “ali can”
    b) Your code should print “First name or last name missed” for single words like
    “Ali” or “Can” or “ali”
    c) Your code should print “Format error” for all the format like “ALI CAN”
    d) Your code should print “Name was not entered” for one or more space
    characters like ” ” or ” ”
    e) Your code should print “Invalid Name” if the name has any character different
    from letters and space.

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name please");
        String fullName = input.nextLine();

        if(fullName.replaceAll("\\s", "").length()==0){
            System.out.println("Name was not entered");
        }
        else if(fullName.replaceAll("[A-Za-z\\s]", "").length()>0){
            System.out.println("Invalid Name");
        }
        else if(fullName.trim().split(" ").length<2){
            System.out.println("First name or last name missed");
        }
        else if(fullName.replaceAll("[a-z\\s]", "").length()<2){
            System.out.println("Error in initials");
        }
        else if(fullName.replaceAll("[A-Z\\s]", "").length()==0){
            System.out.println("Format error");
        }





    }
}
