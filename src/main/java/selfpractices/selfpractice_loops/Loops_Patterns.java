package selfpractices.selfpractice_loops;

public class Loops_Patterns {

    public static void main(String[] args) {

        /* Example 01:
            * * * * *
            * * * * *
            * * * * *
            * * * * *
            * * * * *

         */

        for(int i =0; i<5; i++){
            for(int k=0; k<5; k++){
                System.out.print("*" +" ");
            }
            System.out.println();
        }

        System.out.println();

        //Example 02:

        for(int i =1; i<6; i++){
            for(int k=1; k<6; k++){
                System.out.print(k +" ");
            }
            System.out.println();
        }

        System.out.println();

        //Example 03:

        int x =5 ;

        System.out.println(x>2 ? x <9 ? x <6 ? x >10 ? 10 : -2 :  8 : 7  : 20);//-2

        System.out.println();


        /*Example 04:
         *
         * *
         * * *
         * * * *
         * * * * *

         */

        int row= 5;

        for(int i = 0; i<row ; i++){
            for(int k = 0; k<=i; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println();

       //  Example 05:

         for(int i = 1; i<=row ; i++) {
             for (int k = 1; k <= i; k++) {
                 System.out.print(k + " ");
             }
             System.out.println();
         }

        System.out.println();


        /*  Example 06:
                0
                1 1
                2 2 2
                3 3 3 3
                4 4 4 4 4
         */

        int rows = 5;

        for(int i=0; i<rows; i++){

            for(int k=0; k<=i; k++){
                System.out.print(i + " ");
            }
            System.out.println();
        }


        System.out.println();

        /*
        Example 07:
                         *
                         * *
                         * * *
                         * * * *
                         * * * * *
                         * * * * * *
                         * * * * *
                         * * * *
                         * * *
                         * *
                         *
         */

        int r = 6;
        for(int i = 0; i<r; i++){

            for(int k = 0; k<=i; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        int r2 = 5;
        for(int i=r2; i>0; i--){

            for(int k= 0; k<i; k++){

                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println();

        /*
        A A A A A A A A
        A X X X X X X A
        A X X X X X X A
        A X X X X X X A
         */

        int z = 4;
        int c = 8;
        for(int i = 0; i<z; i++){
            if(i==0) {
                for (int k = 0; k < c; k++) {
                    System.out.print("A" + " ");
                }
            }else{
                System.out.print("A" + " ");
                for (int m = 2; m < c; m++){
                    System.out.print("X" + " ");
                }
                System.out.print("A" + " ");
            }
            System.out.println();
        }



    }
}
