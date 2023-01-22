package recap02;

import java.util.Scanner;

public class DoWhileLoop_PwdCreation {

    /*
            Ask user to enter the password. The password should be
                    i) longer than 6 characters
                    ii) It should begin with upper case "A"
            If the password meets the all conditions then print "It is valid"on the console
            Otherwise it will print "Make the length longer than 6"
            Note: Solve the question by using do-while-loop
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = "";

        do{
            System.out.println("Enter your password please!");
            s= scan.nextLine();
            if(s.length()>6 && s.startsWith("A")){
                System.out.println("It is valid");
            }else{
                System.out.println("Make the length longer than 6");
            }

        }while(!(s.length()>6));

        scan.close();


    }
}
