package selfpractices.selfpractice_lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Question01 {

     /* Ask user to enter a String.
       And then print the occurrence number of each character by using Lambda functional programming.
        E.g.: alacan ==> a=3, l =3, c=1, n=1
              abaa ==> a=3, b=1;
         */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String please");
        String str = input.nextLine();

        findOccurrenceOfChars(str);

    }

    public static void findOccurrenceOfChars(String str){

            Arrays.
                    stream(str.split("")).
                    map(String::toLowerCase).
                    collect(Collectors.groupingBy(t-> t, HashMap::new, Collectors.counting())).
                    forEach((k, v) -> System.out.println(k + " = " + v));

    }






}
