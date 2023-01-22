package questions_ppt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists_Slide152_Q02 {

    public static void main(String[] args) {

        /*
            By using add() with index method, add B into the 1st index.
            List elements should be like A, B, C, E, and F. Print it on the console
         */

        List<String> a = new ArrayList<>();
        a.add("A");
        a.add("C");
        a.add("E");
        a.add("F");
        System.out.println(a);//[A, C, E, F]

        a.add(1,"B");
        System.out.println(a);//[A, B, C, E, F]



    }
}
