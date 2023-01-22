package question_bank.loops;

public class Loops_Q10 {

    public static void main(String[] args) {

           /*
            Type code to print digits just in the decimal part of the given decimal number with an
            'asterix'. For example; 75.4238 Ş *4*2*3*8
            */

        //1.Way:

        double d= 75.4238;
        String s= String.valueOf(d);
        int idxOfComma=s.indexOf(".");
        String decimalPart = s.substring(idxOfComma + 1);
        String str= "";

        for(int i=0; i<decimalPart.length();i++){
            String num = decimalPart.substring(i, i+1);
            str=str+ "*"+num;
        }
        System.out.println(str);

        System.out.println();

        //2.Way:

        double num= 75.4238;
        String s1= String.valueOf(num);
        int idxOfCom = s1.indexOf(".");
        String decPart = s1.substring(idxOfCom + 1);
        String result = "";

        int k = 0;
        while(k<decPart.length()){
            String c = decPart.substring(k, k+1);
            result = result + "*" +c;
            k++;
        }
        System.out.println(result);

        System.out.println();

        //3.Way:
        double n= 75.4238;
        String m=String.valueOf(n);
        int idxComma = m.indexOf(".");
        String decimalP = m.substring(idxComma + 1);

        String res = "";

        int z = 0;

        do{
            String y = decimalP.substring(z, z+1);
            res = res + "*" + y;
            z++;
        }while(z< decimalP.length());
        System.out.println(res);


    }
}
