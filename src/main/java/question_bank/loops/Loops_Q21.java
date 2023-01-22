package question_bank.loops;

public class Loops_Q21 {

    public static void main(String[] args) {

        /*
            Type code to find the sum of the unique digits of an integer
            Example: 12133455 Ş 2+4=6
         */

        int num = 12133455;
        String s = String.valueOf(num);
        int sum = 0;

        for(int i =0; i<s.length(); i++ ) {
            String ch = s.substring(i, i + 1);
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                sum = sum + Integer.valueOf(ch);
            }
        }
            System.out.print(sum);
















    }
}
