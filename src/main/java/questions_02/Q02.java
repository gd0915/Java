package questions_02;

import java.util.Arrays;

public class Q02 {

    public static void main(String[] args) {

        //Find the smallest positive element and greatest negative element in an integer array
        //Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, the greatest negative is -2

        int[] a = new int[]{-12, 18, -5, 23, -2};

        //1.Way:
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));//[-12, -5, -2, 18, 23]

        for (int i=0;i<a.length;i++) {
            if (a[i] < 0 && a[i + 1] > 0) {
                System.out.println( a[i]); //-2
                System.out.println(a[i + 1]); //18
            }
        }

        //2.Way:

        int minPositive = a[a.length-1];
        int maxNegative = a[0];

        for(int w : a){
            if(w>0){
                minPositive =Math.min(minPositive,w);
            }
            if(w<0){
                maxNegative = Math.max(maxNegative, w);
            }
        }
        System.out.println("The smallest positive element and greatest negative element are " + minPositive + " " + maxNegative);
        //The smallest positive element and greatest negative element are 18 -2











        }
}
