package day34lambdafp;

import day32lambdafp.UtilsClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda_IntStream {

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

        System.out.println(getSumFromSevenToHundred01());//5029
        System.out.println(getSumFromSevenToHundred02());//5029
        System.out.println(productFromTwoToEleven01());
        System.out.println(calculateFactorial02(0));//Do not use negative numbers in factorial operations
        System.out.println(calculateFactorial01(0));//Do not use negative numbers
                                                       // 0
        System.out.println(sumOfEvenIntsInGivenRange(1, 10));//30
        System.out.println(sumOfEvenIntsInGivenRange(-2, 4)); //4
        System.out.println(sumOfEvenIntsInGivenRange(-2, -4));//0 ==> Range is incorrect, first parameter should be less than second
                                                                    // -6 ==> after adding swapping in the method ==> correct
        System.out.println(findSumOfDigitsInGivenRange(23, 32));//68


    }

    //1) Create a method to find the sum of integers from 7 to 100

    //1.Way:
    public static int getSumFromSevenToHundred01(){
        // This IntStream does the same actions as for loop does in structured programming
        // InStream.range() ==> (int startInclusive, int endExclusive)
        return IntStream.range(7, 101).reduce(0, Math::addExact);
    }

    //2.Way:
    public static int getSumFromSevenToHundred02(){
        //(int startInclusive, int endInclusive)
        return IntStream.rangeClosed(7, 100).reduce(0, Math::addExact);
    }

    //2) Create a method to find multiplication of the integers from 2 (inc) to 11(inc)

    public static int productFromTwoToEleven01(){

        return IntStream.rangeClosed(2, 11).reduce(1, Math::multiplyExact);
    }

    //3) Create a method to calculate the factorial of a given number. (5 factorial= 1*2*3*4*5 ==> 5!= 1*2*3*4*5)

    public static Object calculateFactorial01(int x){

        if(x>0){
            return IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact);
        }
            System.out.println("Do not use negative numbers");
            return 0;
    }
    public static Object calculateFactorial02(int x){

        return x>0 ? IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact) : "Do not use negative numbers in factorial operations";
        //ternary statement can return weather int or String ==> Object
    }

    // 4) Crate a method to calculate sum of even integers between given two integers

    public static int sumOfEvenIntsInGivenRange(int a, int b){
        int x = 0;
        if(a>b){
            x=a;
            a=b;
            b=x;
        }
        return IntStream.rangeClosed(a, b).filter(UtilsClass::checkToBeEven).sum();
    }

    //  5) Create a method to calculate the sum of digits of every integers between given two integers
    // 23 and 32 ==> 2+3  2+4  2+5  2+6  2+7  2+8  2+9 3+0  3+1 3+2 ==> for each sum part we will use sum of digits

    public static int findSumOfDigitsInGivenRange(int a, int b){
        int x =0;
        if(a>b){
            x=a;
            a=b;
            b=x;
        }
       return  IntStream.rangeClosed(a, b).map(UtilsClass::getSumOfDigits).sum();
    }



}
