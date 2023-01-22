package lambda_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class FP02 {

    /*
        In functional programming we use Lambda expressions, but when we use method reference,
        Lambda expressions will not be recommended
        When we use method reference we have " Class name :: method name" Be careful about ()-> no need
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
        printEvenElements(l);// 8 10 10 2 8
        System.out.println();
        printElementsGreaterThanEight(l);//9 131 10 9 10 15
        System.out.println();
        printSquareOfOddElements(l);//81 17161 81 225



    }

    //     1) Create a method to print the list elements on the console in the same line with a space
    //     between two consecutive elements.(functional)

    public static void printElements(List<Integer> list){

        list.stream().forEach(Utils::printElementsInTheSameLineWithSpace);
    }

    //     2) Create a method to print the even list elements on the console in the same line with a space
    //     between two consecutive elements.(Functional)

    public static void printEvenElements(List<Integer> list){

          list.stream().filter(Utils::checkToBeEven).forEach(Utils::printElementsInTheSameLineWithSpace);
    }

   //      3) Create a method that prints all the numbers more than 8 on the console

    public static void printElementsGreaterThanEight(List<Integer> list){

        list.stream().filter(t-> t>8).forEach(Utils::printElementsInTheSameLineWithSpace);
    }

    //     4) Create a method to print the square of odd list elements on the console in the same line with a space
    //     between two consecutive elements.(Functional)

    public static void printSquareOfOddElements(List<Integer> list){

        list.stream().filter(Utils::checkToBeOdd).map(Utils::getSquare).forEach(Utils::printElementsInTheSameLineWithSpace);
    }












}
