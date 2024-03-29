package day17listspassbyvalue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists02 {

    public static void main(String[] args) {

        //Example 1 : Find the closest 2 integers in the given list. [12, 15, 10, 21]

        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(15);
        a.add(16);
        a.add(21);
        System.out.println(a);//[12, 15, 16, 21]


        //How to sort list elements
        Collections.sort(a); //with list parameter
        System.out.println(a);//[12, 15, 16, 21]


        //How to get minimum difference

        int minDiff = Integer.MAX_VALUE;

        for(int i = 1; i<a.size();i++ ){

            minDiff = Math.min(minDiff, a.get(i) - a.get(i-1));

        }

        System.out.println(minDiff);//1

        for(int i = 1; i<a.size();i++ ){

            if(a.get(i) - a.get(i-1) == minDiff){
                System.out.println(a.get(i) + " and " + a.get(i-1) );//16 and 15
            }
        }



    }
}
