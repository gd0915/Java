package question_bank.loops;

public class Loops_Q17 {

    public static void main(String[] args) {

        //Type code to find the sum of the digits in an integer

        int num = 12456;
        int sum = 0;

        //1. Way:

        for(int i = num; i>0; i=i/10){
            sum = sum + i%10;
        }
        System.out.println(sum);

        //2.Way:

        int n = 12456;
        int s = 0;

        while(n>0) {
            s = s + n%10;
            n=n/10;
        }
        System.out.println(s);

        //3.Way:

        int i = 12456;
        int sumOfDigits = 0;

        do{
            sumOfDigits = sumOfDigits + i%10;
            i=i/10;
        }while(i>0);
        System.out.println(sumOfDigits);

    }
}
