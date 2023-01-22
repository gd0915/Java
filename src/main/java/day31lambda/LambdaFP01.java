package day31lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LambdaFP01 {

   /*
     The Lambda expression is used to provide the implementation of an interface which has functional interface.
     It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing
     the implementation.
     A lambda expression is a short block of code which takes in parameters and returns a value.
     Lambda expressions are similar to methods, but they do not need a name, and they can be implemented
     right in the body of a method.
     Functional programming is called lambda . To type codes in functional programming is shorter, and it is error free.
     Lambda is used to shorten our way of coding.
     With the help of Lambda expressions we can easily handle error free code line,
     we do not need to type everything one by one.
     In functional programming, we use the methods that were created by Java.

     The usage of structured programing is a longer way to type codes in Java.

     We can use many methods with Lambda expressions.
     For ex; substring() is created by Java it is error free bec it was created by Java which means that it was tested
     thousands of times before it was deployed. Functional programming can be used for arrays, collections and maps,
     but we cannot use maps  in functional programming directly. At the beginning we should convert a map to a
     collection, and then we can use maps for functional programming as well ==>How to convert a map into a collection??

     by using entrySet() we can convert a map into a set and set is collection then you can use Collections in functional programming.

      1) Lambda is functional programming, IT field started to use Lambda in Java 8.
      2) In Functional Programming we focus on "what to do?" but in Structured Programming Language we focus on "how to do?"
      3) Functional Programming can be used just with Arrays and Collections
      4) By using "entrySet()" method java converts Map to Set then you can use Functional Programming in Maps as well.

     */

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>(); //l variable - Arrayobject
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);

        printElements(l);
        System.out.println();
        printElementsFunctional(l);
        System.out.println();
        printEvenElementsStructured(l);
        System.out.println();
        printEvenElementsFunctional(l);
        System.out.println();
        printSquareOfOddElements(l);
        System.out.println();
        printCubeOfDistinctOddElements(l);
        System.out.println();
        sumOfDistinctEvenElements(l);
        System.out.println();
        productOfCubesOfDistinctEvenElements(l);
        System.out.println();
        getMaxElement01(l);
        System.out.println();
        getMaxElement02(l);
        System.out.println();
        getMinElement01(l);
        System.out.println();
        getMinElement02(l);

    }

    //  1)  Create a method to print the elements on the console in the same line with a space
    //      between two consecutive elements (Structured P)

    public static void printElements(List<Integer> list) {

        for (Integer w : list) {
            System.out.print(w + " ");
        }
    }

    public static void printElementsFunctional (List<Integer> list) {

            list.stream().forEach(t -> System.out.print(t + " "));//to be able to reach out some more data in insertion order we use stream() method

        }

        //  2) Create a method to print the even elements in the list on the console in the same line with a space
        //     between two consecutive elements (Structured P)

    public static void printEvenElementsStructured (List<Integer> list){

        for(Integer w: list){
            if(w%2==0){
                System.out.print(w + " ");
            }
        }

    }

    public static void printEvenElementsFunctional (List<Integer> list){

             //stream() method takes the elements one by one from the list and send them into the filter
                            // t-> means take the element ---> and then check the elements one by one if it can be divided by 2 with the help of filter() method
        list.stream().filter(t-> t%2==0).forEach( t-> System.out.print(t + " "));
    }


    //  3) Create a method to print the square of odd list elements on the console in the same line
    //  with a space between two consecutive elements (Functional p)

    public static void printSquareOfOddElements(List<Integer> list){
        //list.stream().filter(t-> t%2 !=0).forEach(t-> System.out.print( t*t + " ")); //this way works as well
        list.stream().filter(t-> t%2 !=0).map(t-> t*t).forEach(t-> System.out.print( t + " ")); //In math operations we use map()
    }

    //4)Create a method to print the cube of distinct(unique) odd list elements on the console in the same line
    // with a space between two consecutive elements
    public static void printCubeOfDistinctOddElements(List<Integer> list) {
        list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t*t*t).forEach(t -> System.out.print(t + " "));
        //distinct() method takes the unique elements -- eliminate repeated elements
        // (If there are 2 of the element Java will take only one with the help of distinct() method
        //And then filter() method eliminate the even numbers
        //map() structure will do the mathematics operation
    }


    //5) Create a method to calculate the sum of the squares of distinct even elements
    public static void sumOfDistinctEvenElements(List<Integer> list){

        Integer sum = list.stream().distinct().filter(t -> t%2 ==0).map(t ->t*t).reduce(0, (t, u) -> t+u );
        System.out.println(sum);
        //0 stands for sum container; t and u the values that Java will add(square of the unique even numbers)
        // reduce() method will take the all squares and reduce them into a one single sum value
        //reduce() method has created a container I will take the elements in it (0 is the starting point for my integers)
        // this process will return me sum container
    }

    //6) Create a method to calculate the product of the cubes of distinct even elements
    public static void productOfCubesOfDistinctEvenElements(List<Integer> list){

        Integer product = list.stream().distinct().filter(t -> t%2==0).map(t -> t*t*t).reduce(1, (t, u) -> t*u);
        System.out.println(product);
    }

    //7) Create a method to find the maximum value from the list elements

    public static void getMaxElement01(List<Integer> list){
        //1.Way
        Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t>u ? t : u );
        //Java will take the elements one by one with the help of stream() method
        //And then eliminate repeated ones the help of distinct() method
        //And then compare the elements with the Min Integer Value with the help of Integer Wrapper Class Min_Value() method
        //And then return  the greater value with the help of Ternary Structure
        //reduce() method reduces the given elements into a single value by executing a reducer function.
        System.out.println(max);
    }
    public static void getMaxElement02(List<Integer> list){

        Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) ->  u );
        System.out.println(max);
        //sorted() put the elements into the ascending order
    }

    //8) Homework : Create a method to find the maximum value from the list elements(in 2 ways)

    public static void getMinElement01(List<Integer> list){

        Integer min = list.stream().distinct().reduce(Integer.MAX_VALUE, (t,u) -> t<u ? t : u);
        System.out.println(min);

    }

    public static void getMinElement02(List<Integer> list){

        Integer min = list.stream().distinct().sorted().findFirst().get();
        System.out.println(min);
    }





}
