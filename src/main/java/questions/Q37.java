package questions;

import java.util.HashMap;
import java.util.Scanner;

public class Q37 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //Create a method to count all words in a string get the string from user

        //1.Way:
        System.out.println("Enter a String that is created from multiple words please");
        String s1 = scan.nextLine();
        HashMap<String, Integer> a = new HashMap<>();

        s1 = s1.replaceAll("\\p{Punct}", "");
        String arr[] = s1.split(" ");

        for (String w : arr) {
            Integer numOfOccurrence = a.get(w);
            if (a.get(w) == null) {
                a.put(w, 1);
            } else {
                a.put(w, numOfOccurrence + 1);
            }

        }
        System.out.println(a);


        //2.Way: to find total num of words
        System.out.println(numOfWordsInAString(" "));


    }

    public static int numOfWordsInAString ( String s){

        System.out.println("Enter a String that is created from multiple words please");
        s = scan.nextLine();

        s = s.replaceAll("\\p{Punct}", "");
        String [] arr = s.split(" ");

        int numOfWords = arr.length;
        return numOfWords;
        }





}
