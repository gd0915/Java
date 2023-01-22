package selfpractices.selfpractice_lists;

import java.util.ArrayList;
import java.util.List;

public class List03 {

    public static void main(String[] args) {

        // 6) If a list has 15 or 13, remove them.
        //Example: (10, 31, 15, 13, 54) ==> Output is (10, 31, 54)

        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(31);
        l.add(15);
        l.add(13);
        l.add(54);
        System.out.println(l);

        List<Integer> k = new ArrayList<>();


        if(l.contains(15) || l.contains(13)) {
            for (Integer w : l) {
                if (w == 15 || w == 13) {
                    continue;
                }else{
                    k.add(w);
                }
            }
            System.out.println(k);
        }




    }
}
