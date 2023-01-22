package selfpractices.selfpractice_loops;

public class For_Loop_Example {

    public static void main(String[] args) {

        /*
        1
        2 1
        3 2 1
        4 3 2 1
         */

        int rows = 5;

        for(int i =1; i<=rows; i++ ){

            for(int k = i; k>=1; k--){
                System.out.print(k + " ");
            }
            System.out.println();

        }
    }
}
