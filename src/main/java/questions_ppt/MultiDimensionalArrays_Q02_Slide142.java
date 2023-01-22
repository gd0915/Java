package questions_ppt;

public class MultiDimensionalArrays_Q02_Slide142 {

    public static void main(String[] args) {

        //Find the product of the last elements in the array elements of the
        //given multi dimensional array { {1,2,3}, {4,5}, {6} }

        int arr [][] = { {1,2,3}, {4,5}, {6} };

        int product = 1;

        for(int w [] : arr){

            for(int u : w){

                if(u==w[w.length-1]){
                    product = product*u;
                }
            }
        }
        System.out.println(product);//90


    }
}
