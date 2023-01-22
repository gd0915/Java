package selfpractices.selfpractice_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda_FP_03 {

    public static void main(String[] args) {

        List<String> l = new ArrayList<>();

        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");

        printUppercase01(l);
        System.out.println();
        printElementsSortedByLength(l);
        System.out.println();
        printElementsInReverseOrder(l);
        System.out.println();
        printSortedByLastChar(l);
        System.out.println();
        printSortedByLastChar01(l);
        System.out.println();
        printSortedByLengthAndFirstChar01(l);
        System.out.println();
        printSortedByLengthAndFirstChar02(l);
        System.out.println();
      //removeElementsWhoseLengthGreaterThanFive(l);
        System.out.println();
      //removeElementsStartingWithAOrEndingWithO(l);
        System.out.println();
      //removeElementsWhoseLengthGreaterThanFiveLessThan10EndingWithO(l);
        System.out.println(checkTheLengthLessThanTwelve(l));//true
        System.out.println(checkAnyNotToStartWithX(l));//true
        System.out.println(checkAnyElementEndingWithR(l));//true


    }

    //Q01- Create a method to print all list elements in uppercase(Method Reference)

    //1st Way:
    public static void printUppercase01(List<String> l) {

        l.stream().map(String::toUpperCase).forEach(My_Util::printOnTheSameLine);
    }

    //2nd Way:
//    public static void printUppercase02(List<String> l) {
//
//        l.replaceAll(String::toUpperCase);
//        System.out.println(l);
//    }

    //2) Create a method to print the elements after ordering according to their lengths

    public static void printElementsSortedByLength(List<String> list){

        list.stream().sorted(Comparator.comparing(String::length)).forEach(My_Util::printOnTheSameLine);
    }

    //3) Create a method to print the elements after ordering according to their lengths (In reverse order)

    public static void printElementsInReverseOrder(List<String> list){

        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(My_Util::printOnTheSameLine);
    }

    // 4) Create a method to sort the distinct elements by using their last characters
    //1.Way:
    public static void printSortedByLastChar(List<String> list){

        list.stream().distinct().sorted(Comparator.comparing(t-> t.charAt(t.length()-1))).forEach(t-> System.out.print(t + " "));
    }

    //2.Way:
    public static void printSortedByLastChar01(List<String> list){

        list.stream().distinct().sorted(Comparator.comparing(My_Util::getLastCharacter)).forEach(My_Util::printOnTheSameLine);
    }

    //  5) Create a method to sort elements according to their lengths then according to their first character
    //1. Way:
    public static void printSortedByLengthAndFirstChar01(List<String> list){

        list.
                stream().
                distinct().
                sorted(Comparator.comparing(String::length).thenComparing(My_Util::getFirstCharacter)).
                forEach(My_Util::printOnTheSameLine);
    }

    //2.Way:
    public static void printSortedByLengthAndFirstChar02(List<String> list){

        list.
                stream().
                distinct().
                sorted(Comparator.comparing(String::length).thenComparing(t-> t.charAt(0))).
                forEach(My_Util::printOnTheSameLine);
    }

    // 6)  Remove the elements if the length of the element is greater than 5

//    public static void removeElementsWhoseLengthGreaterThanFive(List<String> list){
//
//        list.removeIf(t-> t.length()>5);
//        System.out.println(list);
//    }

    // 7) Remove the elements if the element is starting with 'A' , 'a' or ending with 'O' or 'o'

//    public static void removeElementsStartingWithAOrEndingWithO(List<String> list){
//
//        Predicate<String> checkCondition = t-> t.charAt(0)=='A' || t.charAt(0)=='a' || t.charAt(t.length()-1)=='O' || t.charAt(t.length()-1)=='o';
//        list.removeIf(t-> checkCondition.test(t));
//        System.out.println(list);
//    }

    // 8)Remove the elements if the element length is between 5 and 10 or ending with 'o'

//    public static void removeElementsWhoseLengthGreaterThanFiveLessThan10EndingWithO(List<String> list){
//        Predicate<String> checkCondition = t-> t.length()>4 &&  t.length()<11 || t.charAt(t.length()-1)=='o';
//        list.removeIf(t-> checkCondition.test(t));
//        System.out.println(list);
//    }

    // 9)Create a method to check if the lengths of all elements are less than 12  ==> allMatch() ==> complete match

    public static boolean checkTheLengthLessThanTwelve(List<String> list) {

        return list.stream().allMatch(t-> t.length()<12);
    }

    // 10) Create a method to check if the initial of any element is not "X"  ==> noneMatch()

    public static boolean checkAnyNotToStartWithX(List<String> list){

        return list.stream().noneMatch(t-> t.charAt(0)=='X');

    }
    //  11) Create a method to check if at least one of the element ending with "r"; ==> anyMatch()

    public static boolean checkAnyElementEndingWithR(List<String> list){

       return  list.stream().anyMatch(t-> t.endsWith("r"));
    }




}
