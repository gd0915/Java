package question_bank.loops;

public class Loops_Q16 {

    public static void main(String[] args) {

        //Type all characters before the first occurrence of 'm' in a String

        //1.Way:
        String str = "I love to earn money!";
        String res= "";

        for(int i  = 0; i< str.length(); i++) {
            String s = str.substring(i, i + 1);

            if (s.equals("m")) {
                break;
            }
            res=res+s;
        }
        System.out.println(res);

        //2.Way

        String s = "Christmas";
        String result = "";

        int k = 0;

        while(k<s.length()){
            String c = s.substring(k, k+1);

            if(c.equals("m")){
                break;
            }
            result = result + c;
            k++;
        }
        System.out.println(result);



        //3.Way:

        String d= "Happy Christmas";
        String v = "";

        int j=0;

        do {
            String n = d.substring(j, j+1);
            if(n.equals("m")){
                break;
            }
            v=v+n;
            j++;
        }while(j<d.length());
        System.out.println(v);

    }
}
