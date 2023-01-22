package day15multidimensionalarraylists;

public class MultiDimensionalArrays04_Review {

    public static void main(String[] args) {

    //Example 1: Find the maximum element in a two-dimensional array

    int arr [][] = { {5, 0}, {-2, 4}, {65, -12, 23} };

    //1.Way:
    int max = arr[0][0];

    for(int [] w : arr){
        for(int u : w){
            if(u>max){
                max=u;
            }
        }
    }
        System.out.println(max);//65

    //2.Way:

        int brr [][] = { {5, 0}, {-2, 4}, {65, -12, 23} };
        int maxi = 0;

        for(int [] w: brr){
            for(int u : w){
                maxi = Math.max(maxi, u);
            }
        }
        System.out.println(maxi);//65










    }
}
