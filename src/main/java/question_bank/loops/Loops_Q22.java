package question_bank.loops;

public class Loops_Q22 {

    public static void main(String[] args) {

        //Type code to print integers from 3 to 9 except 5

        //1.Way:
        for(int i = 3; i<10; i++){
            if(i != 5){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //2.Way:
        for(int i = 3; i<10; i++){
            if(i == 5){
                continue;
            }
            System.out.print(i + " ");
        }




    }
}
