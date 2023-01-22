package question_bank.loops;

public class Loops_Q14 {

    public static void main(String[] args) {

        //Type code to find the multiplication of the integers from 3 to 9

        //1.Way:
        int multiplication=1;

        for(int i = 3;i<10; i++){
            multiplication = multiplication*i;

        }
        System.out.println(multiplication);

        //2.Way:
        int result=1;
        int k=3;

        while(k<10){
            result = result*k;
            k++;
        }
        System.out.println(result);

        //3.Way:

        int res = 1;
        int z= 3;

        do{
            res=res*z;
            z++;
        }while(z<10);
        System.out.println(res);


    }
}
