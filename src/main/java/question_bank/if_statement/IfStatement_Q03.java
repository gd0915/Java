package question_bank.if_statement;

public class IfStatement_Q03 {
    /*
     Type code to print
    a) "Round up by last digit:" and print the rounded value if the last digit is greater than
    or equal to 5
    b) "Round down by last digit" and print the rounded value if the last digit is less than 5
        */

    public static void main(String[] args) {

        int num = 126;

        if(num%10>=5){
            System.out.println("Round up by last digit " + (num/10+1)*10);
        }else{
            System.out.println("Round down by last digit " + (num/10)*10);
        }




    }
}
