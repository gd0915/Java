package selfpractices.selfpractice_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda_FP_01 {

    //Lambda is functional programming. In functional programming we use just existing functions/ methods.
    // We will not create method. We use existing methods that were created by Java.
    //The code will be very short.
    //When we create a method, we have to test it. But Java method were tested millions of time, so the code will be error free.
    //Functional programming was added to Java in Java 8. Before Java 8, we were able to use just the structured programming.
    //Structured programming focuses on "How to do" most of the time. In functional programming focuses on "What to do"
    //Functional programming is used to Arrays and Collections

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(9);
        l.add(13);
        l.add(14);
        l.add(9);
        l.add(10);
        l.add(4);
        l.add(12);
        l.add(15);

        printElements01(l);
        System.out.println();
        printElements02(l);
        System.out.println();
        printEvenEl01(l);
        System.out.println();
        printEvenEl02(l);
        System.out.println();
        printSquareOfOddEl01(l);
        System.out.println();
        printSquareOfOddEl02(l);
        System.out.println();
        printCubeOfDistinctOddEl(l);
        System.out.println();
        sumOfSquaresOfDistinctEl(l);
        productOfCubesOfDistinctEvenEl(l);
        maxValue(l);
        maxValue02(l);
        minValue(l);
        minValue02(l);
        minEvenGreaterThanSeven(l);
        minEvenGreaterThanSeven02(l);
        minEvenGreaterThanSeven03(l);



    }

    //1-Create a method to print list elements on the console in the same line with a space between 2 consecutive elements

    //Structured P:
    public static void printElements01(List<Integer> l){
        for(Integer w : l){
            System.out.print(w + " ");
        }
    }

    //Functional P:
    public static void printElements02(List<Integer> l){
        l.stream().forEach(t->System.out.print(t + " "));
    }

    //2-Create a method to print list elements on the console in the same line with a space between 2 consecutive elements

    //Structured P:
    public static void printEvenEl01(List<Integer> l) {
        for (Integer w : l) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    //Functional P:

     public static void printEvenEl02(List<Integer> l){
            l.stream().filter(t-> t%2==0).forEach(t->System.out.print(t + " "));
     }

    //3-Create a method to print the square of odd list elements on the console in the same line with a space between 2 consecutive elements

    //Structured P:
    public static void printSquareOfOddEl01(List<Integer> l){
        for(Integer w : l){
        if(w%2!=0) {
            System.out.print(w*w + " ");
        }
        }

    }
    //Functional P:
    public static void printSquareOfOddEl02(List<Integer> l){
        l.stream().filter(t-> t%2!=0).map(t -> t*t).forEach(t-> System.out.print(t + " "));

    }

    //4- Create a method to print the cube of distinct odd list elements on the console in the same line with a space between 2 consecutive elements

    public static void printCubeOfDistinctOddEl(List<Integer> l){
        l.stream().distinct().filter(t-> t%2!=0).map(t-> t*t*t).forEach(t-> System.out.print(t + " "));

    }

    //5- Create a method to calculate the sum of the squares of distinct even elements
    public static void sumOfSquaresOfDistinctEl(List<Integer> l){

        Integer sum =  l.stream().distinct().filter(t-> t%2==0).map(t-> t*t).reduce(0, (t, u)-> t+u);
        System.out.println("The sum of the squares of distinct even elements is " + sum);
    }

    //Note: reduce() method ==> the number of elements gets reduced

    //6- Create a method to calculate the product of the cubes of distinct even elements
    public static void productOfCubesOfDistinctEvenEl(List<Integer> l){

       Integer product = l.stream().distinct().filter(t-> t%2==0).map(t-> t*t*t).reduce(1, (t, u)-> t*u);
        System.out.println("The multiplication of the cubes of distinct even elements is " + product);
    }

    //7- Create a method to find the maximum value from the list elements
    //1.Way
    public static void maxValue(List<Integer> l){
        Integer maxEl = l.stream().reduce(Integer.MIN_VALUE, (t, u)-> t>u ? t : u);
        System.out.println(maxEl);
    }
    //2.Way
    public static void maxValue02(List<Integer> l){
        Integer maxEl = l.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u)-> u);
        System.out.println(maxEl);
    }
    //8- Create a method to find the minimum value from the list elements

    //1.Way
    public static void minValue(List<Integer> l){

        Integer minEl = l.stream().reduce(Integer.MAX_VALUE, (t,u)-> t<u ? t :u);
        System.out.println(minEl);
    }

    //2.Way

    public static void minValue02(List<Integer> l){
        Integer minEl = l.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t, u)-> u);
        System.out.println(minEl);
    }

    //Note: sorted() method without parameter ==> put the elements in ascending order
    //Note: sorted(Comparator.reverseOrder()) ==> put the elements in reversed(descending) order


    //9- Create a method to find the minimum value which is even and greater than 7 from the list elements

    public static void minEvenGreaterThanSeven(List<Integer> l){
        Integer result = l.stream().distinct().filter(t-> t>7 && t%2==0).reduce(Integer.MAX_VALUE, (t, u) -> t<u ? t : u);
        System.out.println("The minimum elements is " + result);
    }
    public static void minEvenGreaterThanSeven02(List<Integer> l){
        Integer result = l.stream().distinct().filter(t-> t>7 && t%2==0).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t, u) -> u);
        System.out.println("The minimum elements is " + result);
    }
    public static void minEvenGreaterThanSeven03(List<Integer> l){
        Integer result = l.stream().distinct().filter(t-> t>7 && t%2==0).sorted().findFirst().get();
        System.out.println("The minimum elements is " + result);
    }

    //NOTE: use findFirst() method together with get() method to get Integer return type
}
