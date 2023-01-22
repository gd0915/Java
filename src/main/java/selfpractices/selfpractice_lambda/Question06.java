package selfpractices.selfpractice_lambda;

import java.util.stream.IntStream;

public class Question06 {

    public static void main(String[] args) {

        System.out.println(productFromThreeToEight01(3, 8));
        sumOfIntegersBetweenTwoIntegers(4, 16);
        sumOfEvenIntegersInTheGivenRange(2, 8);
    }


    //Q12: Create a method to calculate multiplication of the integers from 3(inclusive) to 8(inclusive)

    public static int productFromThreeToEight01(int x, int y){

        return IntStream.rangeClosed(x, y).reduce(1, Math::multiplyExact);
    }

    //Q13: Create a method to get sum of integers between given two integers(both are inclusive)

    public static void sumOfIntegersBetweenTwoIntegers(int x, int y){

        Integer sum = IntStream.rangeClosed(x, y).reduce(0, Integer::sum);
        System.out.println(sum);
    }

    //Q14: Create a method to calculate the sum of even integers between given two integer

    public static void sumOfEvenIntegersInTheGivenRange(int x, int y){

        Integer sum = IntStream.rangeClosed(x, y).filter(t-> t%2==0).reduce(0, Integer::sum);
        System.out.println(sum);
    }





}
