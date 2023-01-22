package selfpractices.selfpractice_mixedtopics;

import java.util.Scanner;

public class TernaryPractice {

    ////Example 1:
    //       Ask user to enter an integer and print "even" on the console for even integers, increase the value by 3
    //       for odd integers and print it on the console by using ternary.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer please!");
        int k = input.nextInt();

        System.out.println(k % 2 == 0 ? "Even" : k + 3);
    }



}
