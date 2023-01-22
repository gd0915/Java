package question_bank.loops;

public class Loops_Q02 {

    public static void main(String[] args) {

        //Example 2: Type code to print repeated characters in a String. For example; accessories ⇒ ces

        //1.Way:
        String str = "accessories";
        String x = "";

        for (Integer i = 0; i < str.length(); i++) {

            String c = str.substring(i, i + 1);
            if (str.indexOf(c) != str.lastIndexOf(c)){
                if (!x.contains(c)) {
                    x = x + c;
                }
            }
        }
        System.out.println(x);


        System.out.println();

        //2.Way:
        String s = "accessories";
        String d = "";
        int i = 0;

        while (i < s.length()) {
            String y = s.substring(i, i + 1);
            if (str.indexOf(y) != str.lastIndexOf(y)) {
                if (!d.contains(y)) {
                    d = d + y;
                }
            }
            i++;
        }
        System.out.println(d);

        System.out.println();


        //3.Way:

        String k = "accessories";
        String l = "";
        int m = 0;

        do {
            String p = s.substring(m, m + 1);
            if (k.indexOf(p) != k.lastIndexOf(p)) {
                if (!l.contains(p)) {
                    l = l + p;
                }
            }
            m++;
        } while (m < k.length());
        System.out.println(l);


        System.out.println();





    }
}
