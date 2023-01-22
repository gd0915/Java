package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FP07 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Mark");
        list.add("Jackson");
        list.add("Amanda");
        list.add("Mariano");
        list.add("Alberto");
        list.add("Tucker");
        list.add("Christ");

        printElementsStartingWithA(list);//ALI AMANDA ALBERTO
        System.out.println();
        printElementsStartingWithAOrEndingWithO(list);//ali amanda mariano alberto
        System.out.println();
        sortWithLength(list);//ALI MARK AMANDA TUCKER CHRIST JACKSON MARIANO ALBERTO
        System.out.println();
        printElementsLengthGreaterThanFive(list);//Jackson Amanda Mariano Alberto Tucker Christ
        System.out.println();
        //System.out.println(removeIfLengthLessThanFive(list));// [Jackson, Amanda, Mariano, Alberto, Tucker, Christ]
        printLengthOfEveryElement(list);// Ali: 3 Mark: 4 Amanda: 6 Tucker: 6 Christ: 6 Jackson: 7 Mariano: 7 Alberto: 7
        System.out.println();
        System.out.println(checkNoneMatchOfLengthEleven(list));//true

    }


    //  1)Functional Programming
    //  Create a method to print list elements which are starting with "A" in upper cases

    public static void printElementsStartingWithA(List<String> list){

        list.stream().filter(t-> t.startsWith("A")).forEach(t-> System.out.print(t.toUpperCase() + " "));
    }

    //  2) Functional Programming
    //  Create a method to print list elements which are starting with "A" or ending with "o" in lower cases

    public static void printElementsStartingWithAOrEndingWithO(List<String> list){

        list.stream().filter(t-> t.startsWith("A") || t.endsWith("o")).forEach(t-> System.out.print(t.toLowerCase() + " "));
    }

    //  3)Functional Programming
    //  Create a method to print the elements in upper cases after ordering according to their lengths

    public static void sortWithLength(List<String> list) {

       // list.stream().sorted(Comparator.comparing(String::length)).forEach(t-> System.out.print(t.toUpperCase() + " "));

        list.stream().
                sorted(Comparator.comparing(String::length)).
                map(String::toUpperCase).
                forEach(Utils::printElementsInTheSameLineWithSpace);
    }

    //  4) Use "Functional Programming"
    //  Create a method to print the elements if the length is greater than 5

    public static void printElementsLengthGreaterThanFive(List<String> list){

        list.stream().filter(t-> t.length()>5).forEach(Utils::printElementsInTheSameLineWithSpace);
    }

    //  5)Use "Functional Programming"
    //  Create a method to remove the elements if the length is less than 5
    //  If you want to use "remove()" methods do not use stream(), work with list directly.

    /*
    public static List<String> removeIfLengthLessThanFive(List<String> list){

        list.removeIf(t-> t.length()<5);
        return list;
    }
     */


    //      6)  Use "Functional Programming"
    //	        Create a method to print the length of every element in the following format.
    //	        Sort by length.
    //	        Ali: 3        Mark: 4       Amanda: 6     etc.

    public static void printLengthOfEveryElement(List<String> list){

        list.stream().sorted(Comparator.comparing(String::length)).map(t-> t + ": " + t.length()).forEach(Utils::printElementsInTheSameLineWithSpace);
    }


    //  7) Use "Functional Programming"
    //  Create a method to check if no element has length 11

    public static boolean checkNoneMatchOfLengthEleven(List<String> list){

        return list.stream().noneMatch(t-> t.length() == 11);
    }










}
