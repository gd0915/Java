package selfpractices.selfpractice_patterns;

public class Pattern_Q01 {

    public static void main(String[] args) {
//        /* Example 1)   ***
//         ***
//         ***
//
//         */
//
//        int rows = 3;
//        int columns = 3;
//
//        for (int i = 1; i <= rows; i++) {
//            String s = "";
//            for (int k = 1; k <= columns; k++) {
//                s = s + "*";
//
//            }
//            System.out.println(s);
//        }
//
//        System.out.println("============");
//
//        /*    Example 2)   Question 1
//
//         * * * * *
//         * * * * *
//         * * * * *
//         * * * * *
//         * * * * *
//
//         */
//
//        int r = 5;
//        int c = 5;
//
//
//        for (int i = 1; i <= r; i++) {
//            String s = "";
//            for (int k = 1; k <= c; k++) {
//                s = s + "*";
//            }
//            System.out.println(s);
//        }
//
//        System.out.println("==============");
//
//        /*Example 3:
//                    * * * * *
//                    * * * *
//                    * * *
//                    * *
//                    *
//
//         */
//
//          int rows1 =5;
//
//        for (int i= rows1-1; i>=0 ; i--) {
//
//            for (int j = 0; j <= i; j++) {
//
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
//
//
//        System.out.println("===============");
//
//        /*
//        Example = 4:
//                   *
//                   * *
//                   * * *
//                   * * * *
//                   * * * * *
//         */
//
//        int n = 5;
//
//        for(int i= 0; i<=n; i++){
//
//            for(int j =0; j<=i; j++ ){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("==============");
//
//        /*
//        Example 5:
//                0
//                1 1
//                2 2 2
//                3 3 3 3
//                4 4 4 4 4
//         */
//
//        int m = 5;
//
//
//        for(int i =1; i<=m; i++){
//
//            for(int k = 1; k<=i; k++){
//                System.out.print(i + " ");
//
//            }
//            System.out.println();
//        }
//        System.out.println();
//

        //Example 6:

        int p = 5;

        for( int i= 1; i<=p ; i++){

            for(int k = p-i; k>0; k--){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }








        }
}