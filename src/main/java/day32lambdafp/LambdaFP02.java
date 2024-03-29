package day32lambdafp;

import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFP02 {

    /*
        1)"variable or variables" ==> "logic"==> this structure is called "Lambda Expression"
        2) In Functional Programming, we can use "Lambda Expression", it is allowed but not recommended
           Instead of "Lambda Expression", we prefer "method reference".
        3) Method Reference is  "Class Name :: Method Name".
           e.g.;                "String :: length" (Do not type method parenthesis, type just method name)
                                "Arrays :: toString"
                                "UtilsClass :: getCube"
           Note: This Structure is used for Lambda.

           Note: We use this structure (UtilsClass::getCube)  only in Methods that we created by ourselves
           In Java, there is no all kind of tasks. Sometimes, we need to create our own methods.

           You can use your own class to create the required methods for your application. e.g.; you created "Animal" class,
           and you have eat() in Animal class  ==> "
     */

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();

        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);

        printElementsFunctional(l);// 8 9 131 10 9 10 2 8
        System.out.println();
        printEvenElementsStructured(l);// 8 10 10 2 8
        System.out.println();
        printSquareOfOddElements(l);// 81 17161 81
        System.out.println();
        printCubeOfDistinctOddElements(l);//729 2248091
        System.out.println();
        sumOfDistinctEvenElements01(l);// 168
        sumOfDistinctEvenElements02(l);//168
        productOfCubesOfDistinctEvenElements(l); //4096000
        getMaxElement01(l);// 131
        getMinElement01(l);//2
        getMinElement02(l);//2
        getMinGreaterThanSevenEvenNum(l);// 8
        getHalfOfDistinctEleInReverseOrder(l);//[65.5, 5.0, 4.5, 4.0]


    }

    //  1)  Create a method to print the elements on the console in the same line with a space
    //      between two consecutive elements

    public static void printElementsFunctional (List<Integer> list) {

        list.stream().forEach(UtilsClass::printInTheSameLineWithASpace);


    }

    //     2) Create a method to print the even elements in the list on the console in the same line with a space
    //        between two consecutive elements (Functional with "Method Reference")

    public static void printEvenElementsStructured (List<Integer> list){

        list.stream().filter(UtilsClass::checkToBeEven).forEach(UtilsClass::printInTheSameLineWithASpace);
    }

    //  3) Create a method to print the square of odd list elements on the console in the same line
    //  with a space between two consecutive elements (Functional with "Method Reference")

    public static void printSquareOfOddElements(List<Integer> list) {


        list.stream().filter(UtilsClass::checkToBeOdd).map(UtilsClass::getSquare).forEach(UtilsClass::printInTheSameLineWithASpace);
    }

    //4)Create a method to print the cube of distinct(unique) odd list elements on the console in the same line
    // with a space between two consecutive elements

    public static void printCubeOfDistinctOddElements(List<Integer> list) {

        list.stream().distinct().filter(UtilsClass::checkToBeOdd).map(UtilsClass::getCube).forEach(UtilsClass::printInTheSameLineWithASpace);
    }

    //5) Create a method to calculate the sum of the squares of distinct even elements

    public static void sumOfDistinctEvenElements01(List<Integer> list){
        //1.Way
        Integer sum = list.stream().distinct().filter(UtilsClass::checkToBeEven).map(UtilsClass::getSquare).reduce(0, Math::addExact);
        System.out.println(sum);

        //If Java gives me a method, we do not need to create a new one.
    }

    public static void sumOfDistinctEvenElements02(List<Integer> list) {
        //2.Way
        Integer sum = list.stream().distinct().filter(UtilsClass::checkToBeEven).map(UtilsClass::getSquare).reduce(0, Integer::sum);
        System.out.println(sum);
    }

    //6)Create a method to calculate the product of the cubes of distinct even elements

        public static void productOfCubesOfDistinctEvenElements(List<Integer> list){

            Integer product = list.
                                stream().
                                distinct().
                                filter(UtilsClass::checkToBeEven).
                                map(UtilsClass::getCube).
                                reduce(1, Math::multiplyExact);

            System.out.println(product);
        }

    //7) Create a method to find the maximum value from the list elements

    public static void getMaxElement01(List<Integer> list){

        Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, Math::max);
        System.out.println(max);
    }

    //8) Homework : Create a method to find the minimum value from the list elements(in 2 ways)

    public static void getMinElement01(List<Integer> list){

        Integer min = list.stream().distinct().reduce(Integer.MAX_VALUE, Math::min);
        System.out.println(min);
    }

    public static void getMinElement02(List<Integer> list){

        Integer min = list.stream().distinct().min(Integer::compareTo).get();
        System.out.println(min);
    }

    //9) Create a method to find the minimum value which is greater than 7 and even elements from the list

    public static void getMinGreaterThanSevenEvenNum(List<Integer> list){

        Integer min = list.
                        stream().
                        distinct().
                        filter(t-> t>7).
                        filter(UtilsClass::checkToBeEven).
                        reduce(Integer.MAX_VALUE, Math::min);

        System.out.println(min);
    }

    //10) Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in a list

    public static void getHalfOfDistinctEleInReverseOrder(List<Integer> list){

       List<Double> result =  list.
               stream().
               distinct().
               filter(t -> t>5).
               map(UtilsClass::getHalf).
               sorted(Comparator.reverseOrder()).
               collect(Collectors.toList());

        System.out.println(result);
    }





}
