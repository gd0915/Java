package questions;

public class Q70 {

     /*      int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
              Find how many elements are there in the given array.  */

    public static void main(String[] args) {

        int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};

        int sum =0;

        for(int w [] : arr){
            sum += w.length;
        }
        System.out.println(sum);









    }
}
