package self_notes;

public class ConvertStringToInteger {

    public static void main(String[] args) {


        //How to convert String to integer

        //1.yol:
        String s = "5";

        int k = Integer.valueOf(s);
        System.out.println(k);//5

        //2.yol:
        String str = "5";
        int n = Integer.parseInt(str);
        System.out.println(n);//5

    }
}