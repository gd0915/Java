package question_bank.arrays;

import java.util.Arrays;

public class Arrays_Q01 {

    public static void main(String[] args) {

        /*
            Find the middle element in an integer array
            Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
            (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
          */

        int ages [] = new int[4];
        ages[0] = 12;
        ages[1] = 5;
        ages[2] = 8;
        ages[3] = 10;

        System.out.println(Arrays.toString(ages));

        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        if(ages.length%2!=0){
            int indexOfMiddleElement = ages.length/2;
            System.out.println((ages[indexOfMiddleElement]));
        }else{
            int indexOfMiddleElement = ages.length/2;
            int averageValue = (ages[indexOfMiddleElement]+ ages[indexOfMiddleElement-1])/2;
            System.out.println(averageValue);

        }
    }
}
