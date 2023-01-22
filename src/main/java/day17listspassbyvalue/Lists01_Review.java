package day17listspassbyvalue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01_Review {

    public static void main(String[] args) {

        //Example 1: Type code to make all elements in a List unique//Interview Question
        //           [2, 3, 2, 2, 5] ==> [2, 3, 5]

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);

        List<Integer> b = new ArrayList<>();

        for(Integer w : a){

            if(!b.contains(w)){
               b.add(w);
            }
        }
        System.out.println(b);

        // Example 2: Ask user to enter a letter, if the letter exists inside the list, convert the element to "Got it"
        //            Otherwise, add the element into the list

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter please!");
        String str = input.next();

        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");


            if (c.contains(str)) {
                c.set(c.indexOf(str), "Got it");
            } else {
                c.add(str);
            }

        System.out.println(c);

        //indexOF()
        List<String> d = new ArrayList<>();
        d.add("Ab");
        d.add("Kl");
        d.add("Rs");
        d.add("St");
        d.add("Rs");

        int s = d.indexOf("Rs");
        int k = d.lastIndexOf("Rs");
        int l = d.lastIndexOf("Mn");
        System.out.println(s);//2
        System.out.println(k);//4
        System.out.println(l);//-1 does not exist
















    }
}
