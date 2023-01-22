package questions_ppt;

import java.util.Arrays;

public class Varargs_Slide169_Q04 {

    public static void main(String[] args) {


        int[] random = {6, -4, 12, 0, -10};

        int x = 12;
        int y = Arrays.binarySearch(random, x);
        System.out.println(y);
    }
}
