package questions;

public class Q11 {

    public static void main(String[] args) {

        //Type code to find sum of the numbers from 3 to 12, except 5

//        int sum = 0;
//        for(int i = 3; i<=12; i++){
//            if(i != 5){
//               sum += i;
//            }
//        }
//        System.out.println(sum);


        int sum = 0;
        int i = 3;
        do {
            if (i != 5) {
                sum += i;
            }
            i++;
        }while (i <= 12) ;
            System.out.println(sum);




    }
}
