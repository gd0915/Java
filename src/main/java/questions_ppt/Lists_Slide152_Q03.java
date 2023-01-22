package questions_ppt;

import java.util.ArrayList;
import java.util.List;

public class Lists_Slide152_Q03 {

    public static void main(String[] args) {

        /*
            By using set() method, convert E to D.
            List elements should be like A, B, C, D, and F. Print it on the console
         */

        List<String> a = new ArrayList<>();
        a.add("A");
        a.add("C");
        a.add("E");
        a.add("F");
        System.out.println(a);//[A, C, E, F]

        a.add(1,"B");
        System.out.println(a);//[A, B, C, E, F]

        a.set(a.indexOf("E"), "D");
        System.out.println(a);//[A, B, C, D, F]






    }
}
