package day01variables;

public class Concatenation_Example01_Slide56 {
        /*int numA = 2;
    int numB = 3;
    String str1 = “Study”
    String str2 = “Hard”
    Type a program to see the following outputs on the console
    by using “concatenation” operation.
    A) Study Hard B) 5 Study C) Hard23 D) Hard1
    Note: Be careful about the spaces between the variables
     */

    public static void main(String[] args) {

        int numA = 2;
        int numB = 3;
        String str1 ="Study";
        String str2 ="Hard";

        System.out.println(str1 + " " + str2);
        System.out.println((numA+numB) + " " + str1);
        System.out.println(str2 + numA + numB);
        System.out.println(str2 + (numB - numA));





    }



}
