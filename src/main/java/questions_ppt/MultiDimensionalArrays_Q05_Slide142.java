package questions_ppt;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrays_Q05_Slide142 {

    public static void main(String[] args) {

        /*
        Ask user to enter long two sentences. Then type a program to count all “words” in the sentences.
        “Java is easy, if you study. Nothing is easy, if you do not study”
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a long two sentences, please!");
        String str = input.nextLine();

        //Solving with Arrays
      String str1 = str.trim().replaceAll("\\p{Punct}", "");
      String arr [] = str1.split(" ");

      System.out.println(Arrays.toString(arr));
      System.out.println("The number of the total words is " + arr.length);//14






















    }
}
