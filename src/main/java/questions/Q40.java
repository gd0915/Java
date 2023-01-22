package questions;

import java.util.Scanner;

public class Q40 {

    public static void main(String[] args) {

          // Type a program to check the Pin code which is String. After the 4th attempt, the attempt will be failed.

        Scanner scan = new Scanner(System.in);
        String pinCode = "htc*1981";
        int attempt = 4;

        System.out.println("*****Welcome*****");

        while(true) {
            System.out.println("Enter your pin code, please");
            String pin = scan.next();

            if (attempt == 1) {
                System.out.println("Your attempt to log in to the system is failed, and your sim card has been blocked");
                break;
            }
            if (pin.equals(pinCode)) {
                System.out.println("You have logged into the system! ");
                break;
            } else {
                System.out.println("Enter your valid pin code please!");
                attempt--;
                System.out.println(" The remaining entry is " + attempt);
            }

            }



    }
}
