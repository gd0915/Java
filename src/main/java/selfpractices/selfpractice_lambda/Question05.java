package selfpractices.selfpractice_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question05 {

    public static void main(String[] args) {

        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");

        convertUpper(G7);
        convertUpper02(G7);
        System.out.println();
        System.out.println(convertUpper03(G7));

    }

    //Q11: Convert Strings to Uppercase and join them using coma

    //1.Way:
    public static void convertUpper (List <String> list){

        List<String> l = list.stream().map(t-> t.toUpperCase()).collect(Collectors.toList());
        System.out.println(l);
    }


    //2.Way:
    public static void convertUpper02 (List <String> list){

        list.stream().map(t-> t.toUpperCase().concat(", ")).forEach(System.out::print);
    }


    //3.Way:

    public static List<String> convertUpper03 (List <String> list){

        return list.stream().map(t-> t.toUpperCase()).collect(Collectors.toList());
    }






}
