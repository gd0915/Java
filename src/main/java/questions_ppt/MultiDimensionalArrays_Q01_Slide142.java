package questions_ppt;

public class MultiDimensionalArrays_Q01_Slide142 {
    /*
     Find the sum of all elements in the multi dimensional array { {1,2,3}, {4,5,6} }
     */

    public static void main(String[] args) {

        int arr[][] = { {1,2,3}, {4,5,6} };


        int sum =0;
        for(int [] w : arr){
           for(int u : w){
               sum = sum +u;
           }
        }
        System.out.println(sum);//21


    }
}
