package questions_02;

import java.util.Arrays;

public class Q09 {

    public static void main(String[] args) {

        //Example: set all elements to 1

          int a[][] = { {5,0}, {-2,4}, {65,-12,230}};


        for (int i=0; i<a.length; i++){
            for (int k=0; k<a[i].length; k++){
                a[i][k]=1;
            }
        }
        System.out.println(Arrays.deepToString(a));


    }
}
