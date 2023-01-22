package question_bank.loops;

public class Loops_Q09 {

    public static void main(String[] args) {

            /*  Type code to print all lowercase characters in a String with an asterix.
                For example; 'Ali Can?' ==> l*i*a*n*
             */

        //1.Way:
        String str = "Ali Can?";
        str= str.replaceAll("[^a-z]", "");
        String con="";

        for(int i=0; i<str.length();i++){
            String c = str.substring(i, i+1);
            con= con+ c + '*';
        }
        System.out.println(con);

        System.out.println();

        //2.Way:
        String s = "Tom Hanks!";
        s = s.replaceAll("[^a-z]", "");
        String result = "";

        int i = 0;

        while(i<s.length()){
            String ch = s.substring(i, i+1);
            result = result + ch + '*';
            i++;
        }
        System.out.println(result);

        System.out.println();

        //3.Way:

        String m = "Hatice Sozeri";
        m = m.replaceAll("[^a-z]","");
        String n = "";

        int z = 0;

        do{
            String ch = m.substring(z, z+1);
            n = n + ch + '*';
            z++;

        }while(z<m.length());
        System.out.println(n);


    }
}
