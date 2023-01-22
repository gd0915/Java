package question_bank.loops;

public class Loops_Q01 {

    public static void main(String[] args) {

            /*Example 1:
            1) Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line
            with a space between two consecutive integers
             */
        //1.Way:
        for (int i = 120; i > 10; i--) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //2.Way:
        int i = 120;

        while (i > 10) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
            }
            i--;
        }

        System.out.println();

        //3.Way:
        int k = 120;

        do {
            if ((k % 4 == 0 && k % 6 == 0)) {
                System.out.print(k + " ");
            }
            k--;
        } while (k > 10);
    }
}
