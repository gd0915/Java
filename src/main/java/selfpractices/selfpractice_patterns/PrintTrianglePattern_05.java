package selfpractices.selfpractice_patterns;

public class PrintTrianglePattern_05 {
    /*
                0
                1 1
                2 2 2
                3 3 3 3
                4 4 4 4 4
              */

    public static void main(String[] args) {

        int r = 5;

        for(int i = 0; i<r; i++){
            for(int j = 0; j<=i ;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }









    }
}
