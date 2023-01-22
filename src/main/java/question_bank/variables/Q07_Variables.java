package question_bank.variables;

import java.util.Scanner;

public class Q07_Variables {

    /*
        Type a code to swap two integers
     */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 Integers, please!");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();

        System.out.println("Before swapping: " + n1 + "-" + n2);

            //1.Way:

        double temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("After swapping: " + n1 + "-" +n2);

            //2.Way:

        n1= n1+n2;
        n2=n1-n2;
        n1=n1-n2;

        System.out.println("After swapping: " + n1 + "-" + n2);





    }
}
