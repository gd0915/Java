package day13arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03_Review {

    public static void main(String[] args) {

        //Example 1: Let user  enter student names into the application
        // (Create an Array together with the user)

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students ");
        int numOfStudents = input.nextInt();

        String names[] = new String[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter the " + (i + 1) + ". student name. To stop insertion please press Q");
            String stdNames = input.next();

            if (!stdNames.equalsIgnoreCase("Q")) {
                names[i] = stdNames;
            } else {
                break;
            }
        }
        System.out.println(Arrays.toString(names));

    }
}