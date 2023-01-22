package question_bank.arrays;

import java.util.Arrays;

public class Arrays_Q02 {

    public static void main(String[] args) {

        /*
            Find the smallest positive element and greatest negative element in an integer array
            Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2
         */

        int a [] = {-12, 18, -5, 23, -2};

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

      for(int i =0; i<a.length; i++){

          if(a[i]<0 && a[i+1] >0){
              System.out.println("Maximum negative " + a[i]);
              System.out.println("Smallest positive " + a[i+1]);
          }
        }






    }
}
