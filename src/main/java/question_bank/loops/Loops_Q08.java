package question_bank.loops;

public class Loops_Q08 {

    public static void main(String[] args) {

        //Type code to print odd integers from 20 to 3 in the same line with a space between two consecutive ones.

        //1.Way:

        for(int i= 20; i>2; i--){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //2.Way:

        int k=20;

        while(k>2){
            if(k%2!=0){
                System.out.print(k + " ");
            }
            k--;
        }

        System.out.println();

        //3.Way:
        int s = 20;

        do {
            if (s % 2 != 0) {
                System.out.print(s + " ");
            }
            s--;
        }while (s > 2) ;

    }
}
