package question_bank.loops;

public class Loops_Q13 {

    public static void main(String[] args) {

        //Type code to find the sum of the integers from 3 to 14

        //1.Way:

        int sum = 0;

        for(int i = 3; i<15; i++){
            sum = sum + i;
        }
        System.out.println(sum);

        //2.Way:

        int sum1 = 0;
        int k= 3;

        while(k<15){
            sum1= sum1 + k;
            k++;
        }
        System.out.println(sum1);

        //3.Way:

        int sum2=0;
        int z= 3;

        do{
            sum2=sum2+z;
            z++;
        }while(z<15);
        System.out.println(sum2);


    }
}
