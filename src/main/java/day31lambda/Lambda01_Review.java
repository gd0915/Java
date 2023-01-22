package day31lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01_Review {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(9);
        l.add(8);
        l.add(10);
        l.add(151);
        l.add(9);
        l.add(4);
        l.add(8);

        printElementsStructured(l);
        System.out.println();
        printElementsFunctional(l);
        System.out.println();
        printEvenElements01(l);
        System.out.println();
        printEvenElements02(l);
        System.out.println();
        printSquareOfOddElements01(l);
        System.out.println();
        printSquareOfOddElements02(l);
        System.out.println();
        printCubeOfOddElements(l);
        System.out.println();
        sumOfSquaresOfEvenElements(l);
        productCubesOfEvenElements(l);
        System.out.println();
        maxValue01(l);
        maxValue02(l);
        minValue01(l);
        minValue02(l);



    }


    //  1) Create a method to print the elements on the console in the same line with a space
    //     between two consecutive elements (Structured P)

    public static void printElementsStructured(List<Integer> list) {
        for (Integer w : list) {
            System.out.print(w + " ");
        }
    }

    public static void printElementsFunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));
    }

    // 2) Create a method to print the even elements in the list on the console in the same line with a space
    //    between two consecutive elements (Structured P)

    public static void printEvenElements01(List<Integer> list){
        for(Integer w : list){
            if(w%2==0){
                System.out.print(w + " ");
            }
        }
    }

    public static void printEvenElements02(List<Integer> list){
        list.stream().filter(t-> t%2==0).forEach(t-> System.out.print(t + " "));
    }


    // 3)Create a method to print the square of odd list elements on the console in the same line
    // with a space between two consecutive elements (Functional p)

    public static void printSquareOfOddElements01(List<Integer> list) {
        for (Integer w : list) {
            if (w % 2 != 0) {
                System.out.print(w * w + " ");
            }
        }
    }

    public static void printSquareOfOddElements02(List<Integer> list){
        list.stream().filter(t-> t%2!=0).map(t-> t*t).forEach(t-> System.out.print(t + " "));
    }


    //    4)Create a method to print the cube of distinct(unique) odd list elements on the console in the same line
    //      with a space between two consecutive elements

    public static void printCubeOfOddElements(List<Integer> list){
        list.stream().distinct().filter(t-> t%2!=0).map(t-> t*t*t).forEach(t-> System.out.print(t + " "));
    }

    //  5) Create a method to calculate the sum of the squares of distinct even elements

    public static void sumOfSquaresOfEvenElements(List<Integer> list){
        Integer sum = list.stream().distinct().filter(t-> t%2==0).map(t-> t*t).reduce(0, (t,u)-> t+u);
        System.out.println(sum);
    }

    // 6) Create a method to calculate the product of the cubes of distinct even elements

    public static void productCubesOfEvenElements(List<Integer> list){
        Integer product = list.stream().distinct().filter(t -> t%2==0).map(t -> t*t*t).reduce(1, (t, u)-> t*u);
        System.out.println(product);
    }


    // 7) Create a method to find the maximum value from the list elements

    public static void maxValue01(List<Integer> list){
        Integer maximum = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t>u ? t : u );
        System.out.println(maximum);
    }
    public static void maxValue02(List<Integer> list){
        Integer maximum = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u);
        System.out.println(maximum);
    }

    // 8) Create a method to find the maximum value from the list elements(in 2 ways)

    public static void minValue01(List<Integer> list){
        Integer minimum = list.stream().distinct().reduce(Integer.MAX_VALUE, (t, u) -> t>u ? u : t);
        System.out.println(minimum);
    }

    public static void minValue02(List<Integer> list){
        Integer minimum = list.stream().distinct().sorted().findFirst().get();
        System.out.println(minimum);
    }













}
