package day12_practicesession;

public class PracticeDay03_Palindrome_Q04 {

    public static void main(String[] args) {

        //Type code to check if a given String is palindrome or not


        //1.Way
        String s= "Nalan";
        String reversedName = "";

        for(int i = s.length()-1; i>-1; i--) {
            String ch = s.substring(i, i + 1);
            reversedName = reversedName + ch;
        }
            if (s.equals(reversedName)) {
                System.out.println("It is palindrome");
            }
            else{
                System.out.println("Not palindrome");
            }


        //2.Way:
        String str= "Nalan";
        String reverse = "";

        int idx = str.length()-1;

        while(idx>-1) {
            String c = str.substring(idx, idx + 1);
            reverse = reverse + c;
            idx--;
        }
        if (s.equals(reverse)) {
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }


        //3.Way:

        String g = "Nalan";
        String r = "";

        int k = g.length()-1;

        do {
            String c = g.substring(k, k + 1);
            r = r + c;

            if (g.equals(r)) {
                System.out.println("It is palindrome");
                break;
            }

            else {
                System.out.println("Not palindrome");
                break;
            }

        } while(true);


        System.out.println("=========================================================");

        String strI2= "ey edip adanada pide ye";
        String reversed2= "";

        int idx2=strI2.length()-1;
        while(idx2>-1){
            reversed2=reversed2+ strI2.charAt(idx2);
            idx2 --;
        }
        if (strI2.equals(reversed2)){

            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }






    }
}
