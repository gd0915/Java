package question_bank.loops;

public class Loops_Q15 {

    public static void main(String[] args) {

        //Type code to print characters from 'C' to 'A' on the console by using do-while loop

        String str ="";
        char ch= 'C';

        do{
            str= str + ch + " ";
            ch--;
        }while(ch>='A');
        System.out.println(str);

    }
}
