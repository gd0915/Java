package selfpractices.selfpractice_lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Question08 {

    public static void main(String[] args) {

        //Reading a text file line by line by using Lambda Expression

        Stream<String> stream1 = null;
        try {
            stream1 = Files.lines(Paths.get("src\\main\\java\\selfpractice_lambda\\Notes01.txt")).limit(2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Stream<String> stream2 = null;
        try {
            stream2 = Files.lines(Paths.get("src\\main\\java\\selfpractice_lambda\\Notes01.txt")).filter(s -> s.startsWith("M"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        read1(stream1);
        System.out.println();
        read2(stream2);

    }

    public static void read1(Stream<String> stream1) {

        stream1.forEach(s -> System.out.println(s));

    }

    public static void read2(Stream<String> stream2) {

        stream2.forEach(s -> System.out.println(s));


    }

}
