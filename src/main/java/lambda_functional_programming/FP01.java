package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP01 {

    /*
        Lambda is a functional programming, we have had Lambda in Java with version 8
        Functional programming focuses on "What to do", with structured programming we focus on "How to"
        Functional programming is used just with Collections and Arrays
        We can not use Maps directly in functional programming, but we can convert Maps to Sets and use them
        by using  entrySet() method
     */

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        l.add(15);

        printElements(l);//8 9 131 10 9 10 2 8 15
        System.out.println();
        printElementsFunctional(l);//8 9 131 10 9 10 2 8 15
        System.out.println();
        printEvenElements(l);//8 10 10 2 8
        System.out.println();
        printEvenElementsFunctional(l);//8 10 10 2 8
        System.out.println();
        printSquareOfOddEle(l);//81 17161 81 225
        System.out.println();
        printCubeOfOddEle(l);//729 2248091 3375
        System.out.println();
        getMaxValue(l);//131
        getMaxValue02(l);//131
        getEvenMinGreaterThanSeven(l);//8
        getEvenMinGreaterThanSeven02(l);//8
        getEvenMinGreaterThanSeven03(l);//8
        getHalfOfEleGreaterThanFiveInReverse(l);//[65.5, 7.5, 5.0, 4.5, 4.0]
        sumOfTheSquaresOfEvenElements(l);//168
        productOfCubesOfEvenElements(l);//4096000






    }

    // 1)Create a method to print the list elements on the console in the same line with a space
    // between two consecutive elements.(Structured)

    public static void printElements(List<Integer> list){
        for(Integer w : list){
            System.out.print(w + " ");
        }
    }

    // 2) Create a method to print the list elements on the console in the same line with a space
    //    between two consecutive elements.(functional)

    public static void printElementsFunctional(List<Integer> list){

        list.stream().forEach(t-> System.out.print(t + " "));
    }

    // 3) Create a method to print the even list elements on the console in the same line with a space
    //    between two consecutive elements.(Structured)

    public static void printEvenElements(List<Integer> list){
        for(Integer w : list){
            if(w%2==0){
                System.out.print(w + " ");
            }
        }
    }

    // 4) Create a method to print the even list elements on the console in the same line with a space
    //    between two consecutive elements.(Functional)

    public static void printEvenElementsFunctional(List<Integer> list){

        list.stream().filter(t-> t%2==0).forEach(t-> System.out.print(t + " "));
    }

    //  5) Create a method to print the square of odd list elements on the console in the same line with a space
    //     between two consecutive elements.(Functional)

        public static void printSquareOfOddEle(List<Integer> list){

        list.stream().filter(t-> t%2!=0).map(t-> t*t).forEach(t-> System.out.print(t + " "));
        }


    //  6) Create a method to print the cube of distinct odd list elements on the console in the same line with a space
    //    between two consecutive elements.(Functional)
    //    elements should be distinct (unique)
    //    elements should be odd
    //    elements printed as cube

    public static void printCubeOfOddEle(List<Integer> list){

        list.stream().distinct().filter(t-> t%2!=0).map(t-> t*t*t).forEach(t-> System.out.print(t + " "));
    }

    // 7)Create a method to find the maximum value from the list elements

    //1.Way:
    public static void getMaxValue(List<Integer> list){

       Integer max =  list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t>u ? t : u);
        System.out.println(max);
    }

    //2.Way:
    public static void getMaxValue02(List<Integer> list){

        Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u);
        System.out.println(max);
    }

    // 8) Create a method to find the minimum value which is greater than 7 and even from the list
    //    more than 7, even min value

    //1.Way:
    public static void getEvenMinGreaterThanSeven(List<Integer> list){

        Integer min = list.
                        stream().
                        distinct().
                        filter(t-> t%2==0).
                        filter(t-> t>7).
                        reduce(Integer.MAX_VALUE, (t, u) -> t>u ? u : t);

        System.out.println(min);
    }

    //2.Way:
    public static void getEvenMinGreaterThanSeven02(List<Integer> list){

        Integer min = list.
                        stream().
                        distinct().
                        filter(t-> t%2==0).
                        filter(t-> t>7).
                        sorted().
                        findFirst().
                        get();

        System.out.println(min);
    }

    //3.Way:
    public static void getEvenMinGreaterThanSeven03(List<Integer> list){

        Integer min = list.
                        stream().
                        distinct().
                        filter(t-> t%2==0).
                        filter(t-> t>7).
                        sorted(Comparator.reverseOrder()).
                        reduce(Integer.MAX_VALUE, (t, u)-> u);

        System.out.println(min);
    }

    //  9)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list
    //    distinct,half of the elements, greater than 5, reverse,list

    public static void getHalfOfEleGreaterThanFiveInReverse(List<Integer> list){

        List<Double> result = list.
                                stream().
                                distinct().
                                filter(t-> t>5).
                                map(t -> t/2.0).
                                sorted(Comparator.reverseOrder()).
                                collect(Collectors.toList());

        System.out.println(result);
    }

    //  10) Create a method to calculate the sum of the squares if distinct even elements

    public static void sumOfTheSquaresOfEvenElements(List<Integer> list){

       Integer sum =  list.stream().distinct().filter(t-> t%2==0).map(t -> t*t).reduce(0, (t, u) -> t+u);
        System.out.println(sum);
    }

    //  11) Create a method to calculate the product of the cubes of distinct even elements

    public static void productOfCubesOfEvenElements(List<Integer> list){

        Integer product = list.stream().distinct().filter(t -> t%2==0).map(t -> t*t*t).reduce(1, (t, u) -> t*u);
        System.out.println(product);
    }







}
