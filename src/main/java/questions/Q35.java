package questions;

import java.util.Scanner;

public class Q35 {

    public static void main(String[] args) {

        // Type a program which gets integer values from the user and stops by displaying "Done"
        // when the sum of these values is grater than 100

        Scanner input = new Scanner(System.in);

        int sum=0;
        do{
            System.out.println("Enter an Integer please!");
            int i = input.nextInt();

            sum += i;

            if(sum >100){
                System.out.println("Done!");
                break;
            }

        }while(true);









    }
}
