package questions;

public class Q09 {

    public static void main(String[] args) {

        /*
              From a given array find all pairs whose sum is a given number
              {4, 6, 5, -10, 8, 5, 20} ==> 10
              For example;	4+6=10, 5+5=10, -10+20=10
         */

        int arr[] = {4, 6, 5, -10, 8, 5, 20};


        int num = 10;
        for (int i = 0; i < arr.length ; i++) {

            for (int k = i+1; k < arr.length ; k++) {

                if (arr[i]+arr[k]==num) {
                    System.out.println(arr[i] + "+" + arr[k] + " = " + num);
                }
            }

        }





    }



}
