package question_bank.loops;

public class Loops_Q12 {

    public static void main(String[] args) {

            /*
            Type code to draw the following image by using a for loop.
                A A A A A A A A
                A X X X X X X A
                A X X X X X X A
                A X X X X X X A
             */

        //1.Way:

        int rows = 4;
        int columns=8;

        for(int i =1; i<=rows; i++) {
            String s = "";
            if (i == 1) {
                for (Integer k = 1; k <= columns; k++) {
                    s = s + "A";
                }
                System.out.println(s);
            } else {
                s = s + "A";
                for (Integer m = 2; m < columns; m++) {
                    s = s + "X";
                }
                s = s + "A";
                System.out.println(s);
            }
        }


    }
}
