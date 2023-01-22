package selfpractices.selfpractice_lambda;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;

public class Question03 {



    public static void main(String[] args) {



        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        getCount(primes);
        getMin(primes);
        getMax(primes);
        getSumOfElements(primes);
        System.out.println(getAvgOfElements(primes));

        Statistic(primes);


    }
    // Q09: Get count, min, max, sum, and average for numbers

    public static void getCount(List<Integer> list){
        Integer count = list.size();
        System.out.println(count);
    }
    public static void getMin(List<Integer> list){
        Integer min = list.stream().distinct().sorted().reduce(Integer.MAX_VALUE, Math::min);
        System.out.println(min);
    }

    public static void getMax(List<Integer> list){
        Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, Math::max);
        System.out.println(max);
    }

    public static void getSumOfElements(List<Integer> list){
        int sum = list.stream().reduce(0, Math::addExact);
        System.out.println(sum);
    }

    public static double getAvgOfElements(List<Integer> list){
        double result = (list.stream().reduce(0, Math::addExact));
        return result/ list.size();
    }

        //Usage of summaryStatistics() ==> includes count(), max(), min(), sum(), avg()
    public static void Statistic(List<Integer> primes) {
        IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println(stats);

        System.out.println("Highest prime number in List : " + stats.getMax());
        System.out.println("Lowest prime number in List : " + stats.getMin());
        System.out.println("Sum of all prime numbers : " + stats.getSum());
        System.out.println("Average of all prime numbers : " + stats.getAverage());
    }














}
