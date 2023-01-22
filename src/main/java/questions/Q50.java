package questions;

public class Q50 {

    /* Find the sum of the elements whose indexes are same in the given two multidimensional arrays
    arr1 = { {1,2}, {3,4,5}, {6} } and arr2 = { {7,8,9}, {10,11}, {12} }
    */

    public static void main(String[] args) {

        int [][] arr = { {1,2}, {3,4,5}, {6} };
        int [][] brr = { {7,8,9}, {10,11}, {12} };



        int sum =0;
        for(int i=0; i<arr.length; i++){

          int minLength =Math.min(arr[i].length, brr[i].length);

          for(int j=0; j<minLength; j++){

              sum += arr[i][j] + brr[i][j];

          }
       }
        System.out.println(sum);











    }
}
