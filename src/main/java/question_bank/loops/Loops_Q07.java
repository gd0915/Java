package question_bank.loops;

public class Loops_Q07 {

    public static void main(String[] args) {

            /*
            Type code to create multiplication table like
            3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
             */

        //1.Way:

        int num=3;

        for(int i=1; i<11; i++){
            System.out.println(num + "x" + i + " = " + num*i);
        }

        System.out.println();
        //2.Way

        int n = 3;
        int k =1;

        while(k<11){
            System.out.println(num + "x" + k + " = " + num*k);
            k++;
        }

        System.out.println();

        //3.Way:

        int m=3;
        int l=1;

        do{
            System.out.println(m + "x" + l + " = " + m*l);
            l++;
        }while(l<11);


    }
}
