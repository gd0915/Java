package selfpractices.selfpractice_lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question09 {

    public static void main(String[] args) {

        String fileName = "src\\main\\java\\selfpractice_lambda\\Notes01.txt";


        Stream<String> yasin = null;
        try {
            yasin = Files.lines(Paths.get(fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //1. filter startWith "M"
        //2. convert all lowercase to upper case
        //3. convert it into a List

        List<String> list = new ArrayList<>();
        list = yasin.filter(t -> !t.startsWith("M")).map(String::toUpperCase).collect(Collectors.toList());

        list.forEach(System.out::println);
        System.out.println(list);

    }

}
