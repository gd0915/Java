package question_bank.lists;

import java.util.ArrayList;
import java.util.List;

public class Lists_Q05 {

    public static void main(String[] args) {

       // If the list has 15 as element, change all 15s to 51
       // Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)

        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(11);
        a.add(15);
        a.add(34);
        a.add(43);
        System.out.println(a);//[12, 11, 15, 34, 43]

        if(a.contains(15)) {
            for (Integer w : a) {
                if (w==15) {
                    a.set(a.indexOf(15), 51);
                }
            }
            System.out.println(a);//[12, 11, 51, 34, 43]
        }











    }
}
