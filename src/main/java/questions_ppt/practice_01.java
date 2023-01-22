package questions_ppt;

import java.util.Scanner;

public class practice_01 {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day.");
        String dayName = input.next();

        char char2 = dayName.charAt(1);
        char char4 = dayName.charAt(3);
        char char6 = dayName.charAt(5);

        System.out.println("The second, fourth, and sixth letters are " +char2 + char4 + char6 + " in order.");





    }


}
