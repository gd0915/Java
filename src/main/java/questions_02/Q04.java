package questions_02;

public class Q04 {


    public static void main(String[] args) {

        //Type code to print the elements whose indexes are odd numbers.

        int arr [] = {34, 45, 67, 68, 88, 92, 87, 65};

        for(int i = 0; i< arr.length; i++){

            if(i%2==1){
                System.out.print( arr[i] + " ");
            }
        }




    }
}
