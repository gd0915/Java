package question_bank.loops;

public class Loops_Q19 {

    public static void main(String[] args) {

        //Find the total number of characters different from space and punctuation marks in a String

        String s = "Java is a strongly typed, object-oriented programming language.";

        int numOfCharsDifferentFromSpacePunctuation = s.replaceAll("\\s","").replaceAll("\\p{Punct}", "").length();

        System.out.println(numOfCharsDifferentFromSpacePunctuation);

    }
}
