package selfpractices.selfpractice_abstraction;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DigitsOnlyFileReader digitsOnlyFileReader = new DigitsOnlyFileReader("src\\main\\java\\selfpractices\\selfpractice_abstraction\\message.txt");

        System.out.println(digitsOnlyFileReader.readFile());
        System.out.println(digitsOnlyFileReader.getPath());
    }
}
