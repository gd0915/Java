package questions_02;

import java.util.Scanner;

public class Q17 {

    public static void main(String[] args) {

        //Ask user to enter an integer and then type a code that prints all prime numbers less than a given number.
        // Example: If user enters 20 output will be 2, 3, 5, 7, 11, 13, 17, 19

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int n = scan.nextInt();

        String numbers = "";
        int counter =0;
        for(int i= 2; i<n; i++){

            for(int k=1; k<=i; k++){
                if(i%k==0){
                    counter++;
                }
            }
            if(counter==2){
                System.out.print(i + " ");
            }
            counter = 0;
        }
    }
}
