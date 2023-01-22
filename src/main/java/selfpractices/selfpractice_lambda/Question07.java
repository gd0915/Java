package selfpractices.selfpractice_lambda;

import java.util.stream.IntStream;

public class Question07 {

    public static void main(String[] args) {


        sumOfDigitsOfEachIntegers(20, 30);

    }

    //Q15: Create a method to calculate the sum of digits of every integers between given to integers
    //     23 and 32 ==> 2+3 2+4 2+5 2+6 2+7 2+8 2+9 3+0 3+1 3+2 ==> for each some parts

    public static void sumOfDigitsOfEachIntegers(int x, int y){

        Integer sum = IntStream.rangeClosed(x, y).map(Question07::getSumOfDigits).reduce(0, Integer::sum);
        System.out.println(sum);
    }



    public static int getSumOfDigits(int a){

        int sum=0;
        while(a!=0){
            sum += a%10;
            a= a/10;
        }
        return sum;
    }

}
