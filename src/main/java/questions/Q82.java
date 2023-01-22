package questions;

import java.util.Scanner;

public class Q82 {

    // Type Java code to check your Pin code

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String basedPin= "emily.12345";
        int attempt = 3;

        while(true) {
            System.out.println("Enter your Pin code to login");
            String pin = scan.next();

            if (pin.equals(basedPin)) {
                System.out.println("You are in the system");
            } else {
                System.out.println("Pin is incorrect");
                attempt--;
                System.out.println(attempt + " attempts are left!");
            }
            if (attempt == 0) {
                System.out.println("Your attempts have been failed. Sim card locked!");
                break;
            }
        }
    }

}
