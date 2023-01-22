package selfpractices.selfpractice_loops;

public class PrintingRepeatedChars_LoopExample {

    public static void main(String[] args) {


        String s = "accessories";
        String v= "";
        int i = 0;
        do {
            String c = s.substring(i, i + 1);

            if(s.indexOf(c) != s.lastIndexOf(c) && !v.contains(c)){
                v = v + c;
            }
            i++;

        }
        while (i < s.length());{
            System.out.println(v);
        }
    }
}
