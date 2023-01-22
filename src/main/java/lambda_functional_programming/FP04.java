package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class FP04 {

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

        printElementsInUpperCase(l);//ALI ALI MARK AMANDA CHRISTOPHER JACKSON MARIANO ALBERTO TUCKER BENJAMIN
        System.out.println();
        printTheElementsOrderedBasedOnLength(l);//Ali Ali Mark Amanda Tucker Jackson Mariano Alberto Benjamin Christopher
        System.out.println();
        printTheElementsOrderedBasedOnLengthInReverse(l);//Christopher Benjamin Jackson Mariano Alberto Amanda Tucker Mark Ali Ali
        System.out.println();
        printDistinctElementsSortedByLastChar(l);//Amanda Ali Mark Jackson Benjamin Mariano Alberto Christopher Tucker
        System.out.println();
        printAllElementsByTheirLengthAndFirstInitialChars(l);//Ali Mark Amanda Tucker Alberto Jackson Mariano Benjamin Christopher
        System.out.println();
        //printRemoveTheElementsWhoseLengthGreaterThanFive(l);// [Ali, Ali, Mark]
        //removeTheElementsLengthsInBetween8And10OrEndsWithO(l);// [Ali, Ali, Mark, Amanda, Christopher, Jackson, Tucker]
        System.out.println(checkTheLengthLessThanTwelve(l));// true
        System.out.println(checkNotToStartX(l));//true
        System.out.println(checkAtLeastAnyMatchEndingWithR(l));//true


    }

    // 1) Create a method to print all list elements in upper case in the same line with a space

    public static void printElementsInUpperCase(List<String> list){

        list.stream().map(String::toUpperCase).forEach(Utils::printElementsInTheSameLineWithSpace);
    }

    //2.Way
    /*
    public static void printInUpperCase02(List<String> list){
        list.replaceAll(String :: toUpperCase);
        System.out.print(list);
    }
    */

    // 2)Create a method to print the elements after creating according their lengths

    public static void printTheElementsOrderedBasedOnLength(List<String> list) {

        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::printElementsInTheSameLineWithSpace);
    }

    // 3) Create a method to print the elements after creating according their lengths( in reverse order)

    public static void printTheElementsOrderedBasedOnLengthInReverse(List<String> list) {

        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::printElementsInTheSameLineWithSpace);
    }

    // 4) Create a method to sort the distinct elements by using their last characters

    public static void printDistinctElementsSortedByLastChar(List<String> list) {

        list.stream().distinct().sorted(Comparator.comparing(Utils::getLastChar)).forEach(Utils::printElementsInTheSameLineWithSpace);
    }

    //  5) Create a method to sort elements according to their lengths then according to their first character

    public static void printAllElementsByTheirLengthAndFirstInitialChars(List<String> list) {

        list.
                stream().
                distinct().
                sorted(Comparator.comparing(String::length).thenComparing(Utils::getFirstChar)).
                forEach(Utils::printElementsInTheSameLineWithSpace);
                //thenComparing(t-> t.charAt(0))
    }

    // 6)  Remove the elements if the length of the element is greater than 5
    /*
    public static void printRemoveTheElementsWhoseLengthGreaterThanFive(List<String> list){

        list.removeIf(t-> t.length()>5);
        System.out.println(list);
    }

     */

    // 7) Remove the elements if the length is between 8 and 10 or ending with 'o';

    public static void removeTheElementsLengthsInBetween8And10OrEndsWithO(List<String> list){
        Predicate<String> checkCondition = t-> t.length()>7 && t.length()<11 || t.endsWith("o");
        list.removeIf(t-> checkCondition.test(t));
        System.out.println(list);

     }

    //  8)Create a method to check if the lengths of all elements are less than 12

    public static boolean checkTheLengthLessThanTwelve(List<String> list) {

        return list.stream().allMatch(t -> t.length() < 12);
        //This method will check all the values with no exception
    }

    //10) Create a method to check if the initial of any element is not "X"
    public static boolean checkNotToStartX(List<String> list) {

        return list.stream().noneMatch(t -> t.startsWith("x"));
    }

    //11) Create a method to check if at least one of the element ending with "r";
    public static boolean checkAtLeastAnyMatchEndingWithR(List<String> list) {

        return list.stream().anyMatch(t -> t.endsWith("r"));
    }






}
