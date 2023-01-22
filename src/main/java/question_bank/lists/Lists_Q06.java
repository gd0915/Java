package question_bank.lists;

import java.util.ArrayList;
import java.util.List;

public class Lists_Q06 {

    /*
        If a list has 15 or 13, remove them.
        Example: (10, 31, 15, 13, 54) ==> Output is (10, 31, 54)
     */

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(31);
        a.add(15);
        a.add(13);
        a.add(54);
        System.out.println(a);

        if(!a.contains(15) && !a.contains(13)) {
            System.out.println("The list does not contain 15 or 13");
        }else {
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) == 15) {
                    int idx = a.indexOf(15);
                    a.remove(idx);
                    i--;
                }
                if (a.get(i) == 13) {
                    int idx1 = a.indexOf(13);
                    a.remove(idx1);
                    i--;
                }
            }
            System.out.println(a);
        }


    }
}