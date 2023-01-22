package selfpractices.selfpractice_arrays;

public class Arrays_07 {

    public static void main(String[] args) {

        //Type a program like; given an array whose length is 3, return an array with the elements "rotated left"
        //        For example; if the array is [1, 2, 3] output will be [2, 3, 1].

//        int arr[] = {1, 2, 3};
//
//        int brr[] = new int[arr.length];
//
//
//        brr [arr.length-1] = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            for (int k = 0; k < arr.length-1; k++) {
//                brr[k] = arr[i];
//            }
//        }
//        System.out.println(Arrays.toString(brr));

//        int arr[]={1,2,3,4,5,6};
//        int brr[]= new int[arr.length];
//
//        brr[arr.length-1] =arr[0];
//
//        for (int i= 1; i<arr.length; i++){
//
//            brr[i-1]= arr[i];
//        }
//
//        System.out.println(Arrays.toString(brr));
//        }

        System.out.println("==================");

        //Find the sum of all elements in the multidimensional array { {1,2,3}, {4,5,6} }

        int a [][] = { {1,2,3}, {4,5,6}};

        int sum =0;
        for(int [] w : a){
            for(int u : w){
                sum = sum +u;
            }
        }
        System.out.println(sum);

        System.out.println("================");

        // Find the product of the last elements in the array elements of the
        //given multi dimensional array { {1,2,3}, {4,5}, {6} }

    int c [][] = { {1,2,3}, {4,5}, {6} };

        int product = 1;

        for(int i [] : c){

            for(int u : i){

                if(u==i[i.length-1]){
                    product = product*u;
                }
            }
        }
        System.out.println(product);//90




    }
}
