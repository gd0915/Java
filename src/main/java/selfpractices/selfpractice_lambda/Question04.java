package selfpractices.selfpractice_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question04 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        getSquareOfDistinctEl(numbers);
        getSquareOfDistinctEl02(numbers);
    }

    //Q10: Create List of square of all distinct numbers

    //1.Way:
    public static void getSquareOfDistinctEl(List<Integer> list){

        list.stream().distinct().map(t-> t*t).forEach(t-> System.out.print(t + " "));
    }

    //2.Way:
    public static void getSquareOfDistinctEl02(List<Integer> list){

        List<Double> square= list.stream().distinct().map(t-> Math.pow(t,2)).collect(Collectors.toList());
    }




}
