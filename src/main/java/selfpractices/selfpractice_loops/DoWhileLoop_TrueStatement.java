package selfpractices.selfpractice_loops;

import java.util.Scanner;

public class DoWhileLoop_TrueStatement {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int k;

        do {
            System.out.println("Enter an Integer please!");
            k = input.nextInt();

            if (k < 100) {
                System.out.println("You win");
            }else{
                System.out.println("You lost");
                break;
            }

        } while (true);













    }
}
