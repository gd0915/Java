package question_bank.loops;

public class Loops_Q18 {

    public static void main(String[] args) {

        //Type code to print unique characters in a String. For example; Hello ==> Heo

        //1.Way:

        String s ="Hello";


        for(int i = 0; i<s.length(); i++) {
            String ch = s.substring(i, i + 1);

            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                System.out.print(ch);
            }
        }

        System.out.println();

        //2.Way:

        String str ="Hello";
        int k = 0;

        while(k<str.length()) {

            char c = str.charAt(k);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.print(c);
            }
            k++;
        }

    }
}
