package question_bank.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists_Q07 {

    public static void main(String[] args) {

        //Find the closest 2 integers in an Integer List
       //Example: (12, 31, 15, 13, 54) ==> Output is 12 and 13


        List<Integer> h = new ArrayList<>();
        h.add(12);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        System.out.println(h);//[12, 31, 15, 13, 54]

        Collections.sort(h);
        System.out.println(h);//[12, 13, 15, 31, 54]

        int minDiff = Integer.MAX_VALUE;
        for(int i= 1; i<h.size(); i++){
            minDiff = Math.min(minDiff, h.get(i)-h.get(i-1));
        }
        System.out.println(minDiff);//1

        for(int i= 1; i<h.size(); i++){
            if(h.get(i)-h.get(i-1)==minDiff){
                System.out.println(h.get(i) + ","  + h.get(i-1));//13,12
            }
        }





    }
}
