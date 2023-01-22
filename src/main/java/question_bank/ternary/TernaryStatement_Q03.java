package question_bank.ternary;

public class TernaryStatement_Q03 {

            /*Use ternary to print
            a) "Round up by last digit" and print the rounded value if the last digit of an integer is greater than or equal to 5
            b) "Round down by last digit" and print the rounded value if the last digit of an integer is less than 5

         For example; 127 will be rounded up and the value will be 130
         125 will be rounded up and the value will be 130
         123 will be rounded down and the value will be 120
                      */

    public static void main(String[] args) {

        int i = 194;

        String result = i%10>=5 ? ("Round up : " + (i/10+1)*10) : ("Round down : " +(i/10)*10);
        System.out.println(result);


    }









}
