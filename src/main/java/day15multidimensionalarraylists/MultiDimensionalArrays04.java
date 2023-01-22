package day15multidimensionalarraylists;

public class MultiDimensionalArrays04 {

    public static void main(String[] args) {

        //Example 1: Find the maximum element in a two-dimensional array

        int arr [][] = { {5, 0}, {-2, 4}, {65, -12, 23} };

        //1.Way:
            int max = arr[0][0];

            for(int [] w : arr) {

                for (int u : w) {
                    if (max < u) {
                        max = u;
                    }
                }
            }
        System.out.println(max);//65


        //2.Way:

        int arr1 [][] = { {5, 0}, {-2, 4}, {65, -12, 23} };

        int max1 = arr[0][0];

        for(int [] w : arr1) {

            for (int u : w) {
               max1 = Math.max(max1, u); //max() method selects the maximum value of the given two numbers
            }

        }
        System.out.println(max1);//65








    }
}
