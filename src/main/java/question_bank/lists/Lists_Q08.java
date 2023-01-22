package question_bank.lists;

import java.util.ArrayList;
import java.util.List;

public class Lists_Q08 {

    public static void main(String[] args) {

        //Increase the value of every element except 7 and 10 by 2 in a List
        //Example: (12, 31, 7, 13, 10) ==> Output is (14, 33, 7, 15, 10)

        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(31);
        a.add(7);
        a.add(13);
        a.add(10);
        System.out.println(a);

        for(Integer w : a){
            if(w==7 || w==10){
                continue;
            }else{
               a.set(a.indexOf(w), w+3);
            }
        }
        System.out.println(a);

    }
}
