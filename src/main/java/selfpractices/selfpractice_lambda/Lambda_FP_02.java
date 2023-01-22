package selfpractices.selfpractice_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda_FP_02 {

    /*
      Method References: Class Name:: Method Name without method parenthesis
      Example ==>        String    :: length
                         ArrayList :: size

                         NOTE: If Java has any method, we prefer to use it, but if Java does not have any method
                         we create the method inside Utils Class and use it.
     */

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(9);
        l.add(13);
        l.add(4);
        l.add(9);
        l.add(2);
        l.add(4);
        l.add(12);
        l.add(15);

        printElGreaterThanFive(l);
        System.out.println();
        printElements(l);
        System.out.println();
        printEvenElements(l);
        System.out.println();
        printSquareOfOddEl(l);
        System.out.println();
        printCubeOfDistinctOddEl(l);
        System.out.println();
        sumOfSquaresOfDistinctEl(l);
        System.out.println();
        productOfCubesOfDistinctEvenEl(l);
        System.out.println();
        maxValue(l);
        minValue(l);
        minEvenGreaterThanSeven(l);
        System.out.println();
        printElGreaterThanFiveMR(l);


    }

    // 10-Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list

    public static void printElGreaterThanFive(List<Integer> list){

        List<Integer> resultList = list.stream().distinct().filter(t-> t>5).map(t-> t/2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(resultList);
    }

    //Since the task requires a list, we use collect() method and Collectors.toList()

    //Method References:

    //Q01) Create a method to print list elements on the console in the same line with a space between 2 consecutive elements(Method Reference)

    public static void printElements(List<Integer> list){

        list.stream().forEach(My_Util::printOnTheSameLine);
    }

    //Q02)Create a method to print list elements on the console in the same line with a space between 2 consecutive elements

    public static void printEvenElements(List<Integer> list) {

        list.stream().filter(My_Util::checkToBeEven).forEach(My_Util::printOnTheSameLine);
    }

    //Q03)Create a method to print the square of odd distinct list elements on the console in the same line with a space between 2 consecutive elements

    public static void printSquareOfOddEl(List<Integer> list){

        list.
                stream().
                distinct().
                filter(My_Util::checkToBeOdd).map(My_Util::getSquare).forEach(My_Util::printOnTheSameLine);
    }

    //4- Create a method to print the cube of distinct odd list elements on the console in the same line with a space between 2 consecutive elements

    public static void printCubeOfDistinctOddEl(List<Integer> l){
            l.stream().
                    distinct().
                    filter(My_Util::checkToBeEven).
                    map(My_Util::getCube).
                    forEach(My_Util::printOnTheSameLine);

    }

    //5- Create a method to calculate the sum of the squares of distinct even elements

    public static void sumOfSquaresOfDistinctEl(List<Integer> l){

        Integer sum =  l.
                        stream().
                        distinct().
                        filter(My_Util::checkToBeEven).
                        map(My_Util::getSquare).
                        reduce(0, Math::addExact);
        System.out.println("The sum of the squares of distinct even elements is " + sum);
    }

    //6- Create a method to calculate the product of the cubes of distinct even elements

    public static void productOfCubesOfDistinctEvenEl(List<Integer> l){

        Integer product = l.
                        stream().
                        distinct().
                        filter(My_Util::checkToBeEven).
                        map(My_Util::getCube).
                        reduce(1, Math::multiplyExact);
        System.out.println("The multiplication of the cubes of distinct even elements is " + product);
    }

    //7- Create a method to find the maximum value from the list elements
    //1.Way
    public static void maxValue(List<Integer> l){
        Integer maxEl = l.stream().reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("The max value is " + maxEl);
    }

    //8- Create a method to find the minimum value from the list elements

    //1.Way
    public static void minValue(List<Integer> l){

        Integer minEl = l.
                        stream().
                        reduce(Integer.MAX_VALUE, Math::min);
        System.out.println("The minimum value is " + minEl);
    }

    //9- Create a method to find the minimum value which is even and greater than 7 from the list elements

    public static void minEvenGreaterThanSeven(List<Integer> l){
        Integer result = l.
                            stream().
                            distinct().
                            filter(t-> t>7).
                            filter(My_Util::checkToBeEven).
                            reduce(Integer.MAX_VALUE, Math::min);
        System.out.println("The minimum elements is " + result);
    }

    // 10-Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list

    public static void printElGreaterThanFiveMR(List<Integer> list){

        List<Double> resultList = list.
                                    stream().
                                    distinct().
                                    filter(t-> t>5).
                                    map(My_Util::getHalf).
                                    sorted(Comparator.reverseOrder()).
                                    collect(Collectors.toList());
        System.out.println(resultList);
    }








}
