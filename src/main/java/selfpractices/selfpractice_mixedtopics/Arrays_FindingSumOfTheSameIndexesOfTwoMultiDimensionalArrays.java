package selfpractices.selfpractice_mixedtopics;

public class Arrays_FindingSumOfTheSameIndexesOfTwoMultiDimensionalArrays {

    public static void main(String[] args) {



    int arr[][] = {{1,2},{3,4,5},{6}};

    int brr[][] = {{7,8,9}, {10,11},{12}};

       int crr[] = new int[arr.length];

        int sum = 0;

        for(int i=0; i<arr.length; i++) {

            int minLength= Math.min(arr[i].length, brr[i].length);
            for(int j=0; j<minLength; j++) {

                sum+= arr[i][j] + brr[i][j];
                }

            }

        System.out.println(sum);










    }
}