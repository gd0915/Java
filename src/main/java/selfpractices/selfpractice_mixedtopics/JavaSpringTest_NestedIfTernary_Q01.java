package selfpractices.selfpractice_mixedtopics;

import java.util.Scanner;

public class JavaSpringTest_NestedIfTernary_Q01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age please!");
        int age = input.nextInt();
        System.out.println("Enter uor gender please!");
        String gender = input.next();

            if(gender.equals("male")) {
            if(age<20) {
            System.out.println("Boy");
            }else {
            System.out.println("Man");
            }
            }else if(gender.equals("female")) {
            if(age<20) {
            System.out.println("Girl");
            }else {
            System.out.println("Woman");
            }
            }else {
            System.out.println("There is no any definition for other genders");
            }

    }
}
