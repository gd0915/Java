package selfpractices.selfpractice_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Question02 {


    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(12);
        l.add(9);
        l.add(13);
        l.add(4);
        l.add(9);
        l.add(2);
        l.add(4);
        l.add(12);

        printElementsOnTheSameLine(l);
        System.out.println();
        getMinimumValue(l);
        getMinimumValue2(l);
        getMaximumValue(l);
        getMinimumValue2(l);
        getSumOfElements(l);
        getSumOfEvenElements(l);
        System.out.println(getSumOfElementsFrom7To100(l));
        getSquareDistinctSum(l);
        System.out.println(findFactorial01(5));


    }

    // Q01-Create an Utils class and do a method for ( print the elements on the console in the same line with a space) Then use it on the lambda expression
    // and print the list elements In the same line with a space
    public static void printElementsOnTheSameLine(List<Integer> list){

        list.stream().forEach(My_Util::printOnTheSameLine);
    }

    // Q02-Create a method to find the minimum value which is greater than 7

    public static void getMinimumValue(List<Integer> list){

        Integer min = list.stream().distinct().filter(t-> t>7).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t,u) ->u);
        System.out.println(min);
    }

    public static void getMinimumValue2(List<Integer> list){

        Integer min = list.stream().distinct().filter(t-> t>7).sorted().reduce(Integer.MAX_VALUE, Math::min);
        System.out.println(min);
    }

    //  Q03-)Create a method to find the maximum value which is smaller than 10

    public static void getMaximumValue(List<Integer> list){

        Integer max = list.stream().distinct().filter(t-> t<10).sorted().reduce(Integer.MIN_VALUE, Math::max);
        System.out.println(max);
    }

    public static void getMaximumValue02(List<Integer> list){

        Integer max = list.stream().distinct().filter(t-> t<10).sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(max);
    }

    //Q04-Create a method to find the sum of all elements in the list

    public static void getSumOfElements(List<Integer> list){

        Integer sum = list.stream().reduce(0, (t, u)-> t+u);
        System.out.println(sum);
    }
    public static void getSumOfElements02(List<Integer> list){

        Integer sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
    public static void getSumOfElements03(List<Integer> list){

        Integer sum = list.stream().reduce(0, Math::addExact);
        System.out.println(sum);
    }

    public static void getSumOfElements04(List<Integer> list){

        Integer sum = list.stream().reduce(0, Math::addExact);
        System.out.println(sum);
    }

    //Q05-)Create a method to find the sum of EVEN elements and greater than 7 elements in the list

    public static void getSumOfEvenElements(List<Integer> list){

      Integer sum = list.stream().filter(t-> t%2==0 && t>7).reduce(0, Math::addExact);
      System.out.println(sum);
    }

    //Q06-Create a method to find the sum of Integers from 7 to 100 (hint:use range method in InStream.)

    public static int getSumOfElementsFrom7To100(List<Integer> list) {
        return IntStream.rangeClosed(7, 100).reduce(0, Math::addExact);
    }

    // Q07-Create a method to calculate the sum of the squares of distinct odd elements

    public static void getSquareDistinctSum(List<Integer> list) {

        int square = list.stream().distinct().filter(t -> t % 2 != 0).map(Question02::getSquare).reduce(0, Integer::sum);
        System.out.println(square);
    }

    public static int getSquare(int a){
        return a*a;
    }


    //Q08- Create a method to calculate the factorial of a given number.(5 factorial = 5! )

    public static Object findFactorial01(int x) {

        return x>0 ? IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact) : "Do not use negative numbers in factorial operations";
    }














}
