package question_bank.ternary;

public class TernaryStatement_Q06 {
    /*
        Type code to calculate the absolute value of a number
    For positive numbers and zero absolute value is the same with the number
    For negative numbers to find absolute value multiply the number by -1
     */

    public static void main(String[] args) {


        int i = -35;

        String abs = i>=0 ? "i" : "-1*i";
        System.out.println(abs);

    }
}


