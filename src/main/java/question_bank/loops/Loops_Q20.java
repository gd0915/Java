package question_bank.loops;

public class Loops_Q20 {

    public static void main(String[] args) {

            /*
                Type code to draw the following image by using a for loop.
                        * * * * * *
                        * * * * *
                        * * * *
                        * * *
                        * *
                        *
             */

        int rows = 6;
        String s = "";

        for(int i = 1; i<=rows; i++){

            for(int k=rows; k>=i; k--){
                s = s + "*";
            }
            System.out.println(s);
            s="";
        }


    }
}
