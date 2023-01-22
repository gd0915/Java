package question_bank.loops;

public class Loops_Q04 {

    public static void main(String[] args) {

        //Type code to print the unique digits in an integer. Example; 223878 ⇒ 37

        int num = 223878;
        String s = String.valueOf(num);
        String uniqueDigits = "";

        //1.Way:

        for (int i = 0; i < s.length(); i++) {
            String c = s.substring(i, i + 1);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                uniqueDigits = uniqueDigits + c;
            }
        }
        System.out.println(uniqueDigits);

        System.out.println();

        //2.Way:
        int n = 223878;
        String str = String.valueOf(n);
        String d = "";

        int i = 0;

        while (i < str.length()) {
            String k = str.substring(i, i + 1);
            if (str.indexOf(k) == str.lastIndexOf(k)) {
                d = d + k;
            }
            i++;
        }
        System.out.println(d);

        System.out.println();

        //3.Way:
        int m = 223878;
        String l = String.valueOf(m);
        String x = "";
        int k = 0;

        do {
            String digit = l.substring(k, k + 1);
            if (l.indexOf(digit) == l.lastIndexOf(digit)) {
                x = x + digit;
            }
            k++;
        } while (k < l.length());
        System.out.println(x);


    }
}
