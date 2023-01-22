package selfpractices.selfpractice_patterns;

public class PrintTrianglePattern_04 {
    /*
                 * * * * *
                 * * * * *
                 * * * * *
                 * * * * *
                 * * * * *
     */

    public static void main(String[] args) {

        int r = 5;
        int c = 5;

        for(int i = 1; i<=r; i++){
                String s= "";
            for(int k = 1; k<=c; k++){
                s = s + "*";
            }
            System.out.println(s);
        }
















    }
}
