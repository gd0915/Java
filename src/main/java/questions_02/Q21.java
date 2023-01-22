package questions_02;

public class Q21 {

    public static void main(String[] args) {



    /*
        From a given array find all pairs whose sum is 10.
        int arr [] = {4, 6, 5, -10, 8, 5, 20}; output will be 4+6=10, 5+5=10, -10+20=10
     */

        int number = 10;

        int arr[] = {4, 6, 5, -10, 8, 5, 20};

        for (int i = 0; i < arr.length; i++) {

            for(int k = i+1; k<arr.length; k++){

                if(arr[i] + arr[k] == number){
                    System.out.println(arr[i] + "+" + arr[k] + "=" + number );
                }
            }
        }


    }
}
