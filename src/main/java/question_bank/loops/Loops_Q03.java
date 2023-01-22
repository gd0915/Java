package question_bank.loops;

public class Loops_Q03 {
    public static void main(String[] args) {

        //Example 3:Type code to check whether a String is palindrome or not. If a String is the same with its
        //reverse then it is called palindrome. For example; “anna”, “123321” are palindromes


        //1.Way:
        String str = "anna";
        String r = "";

        for (int i = str.length() - 1; i > -1; i--) {
            String c = str.substring(i, i + 1);
            r = r + c;
        }
        if (str.equals(r)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is not palindrome");
        }

        System.out.println();

        //2.Way:
        String s = "anna";
        String n = "";
        Integer m = str.length() - 1;

        while (m > -1) {
            String l = str.substring(m, m + 1);
            n = n + l;
            m--;
        }
        if (s.equals(n)) {
            System.out.println(s + " is palindrome");
        } else {
            System.out.println(s + " is not palindrome");
        }

        System.out.println();

        //3.Way:

        String b = "anna";
        String f = "";
        Integer y = b.length() - 1;

        do {
            String g = b.substring(y, y + 1);
            f = f + g;
            y--;
        } while (y > -1);

        if (b.equals(f)) {
            System.out.println((s + " is palindrome"));
        } else {
            System.out.println(s + " is not palindrome");
        }

    }
}
