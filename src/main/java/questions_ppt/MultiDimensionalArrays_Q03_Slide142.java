package questions_ppt;

public class MultiDimensionalArrays_Q03_Slide142 {

    public static void main(String[] args) {

        /*
            Find the sum of the elements whose indexes are same in the given two multidimensional arrays
            arr1 = { {1,2}, {3,4,5}, {6} } and arr2 = { {7,8,9}, {10,11}, {12} }
         */
        int arr [][] = { {1,2}, {3,4,5}, {6} };
        int brr [][] = { {7,8,9}, {10,11}, {12} };

        int crr[] = new int[arr.length];

        int sum = 0;

        for(int i = 0; i<arr.length; i++){

            int minLength = Math.min(arr[i].length, brr[i].length);

           for( int k = 0; k<minLength; k++){
               sum+= arr[i][k] + brr[i][k];
           }
       }
        System.out.println(sum);


//        int sum = 0;
//        int counter =0;
//        for(int [] w : arr){
//
//        for(int [] x : brr){
//
//            for (int k : w) {
//
//            for (int y : x) {
//
//                if (w.length == x.length) {
//                    sum = k + y;
//                }else{
//                    int minLength =Math.min(w.length, x.length);
//                        sum = k + y;
//                        counter++;
//                        if(counter == minLength ){
//                            break;
//                    }
//                }
//            }
//        }
//        }
//        }
//        System.out.println(sum);




    }
}
