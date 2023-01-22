package selfpractices.selfpractice_mixedtopics;

public class FindingNonRepeatedCharsPractice {

    public static void main(String[] args) {

        String s = "Java is easy and I love Java and learn Java earn money";

        String uniqueChars = "";

        for(int i = 0; i<s.length(); i++) {
            String ch = s.substring(i, i + 1);
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                uniqueChars = uniqueChars + ch;
            }
        }
        System.out.print(uniqueChars + " ");





    }
}
