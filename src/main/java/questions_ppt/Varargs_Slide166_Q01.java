package questions_ppt;

public class Varargs_Slide166_Q01 {

    public static void main(String[] args) {

        String a = "";
        a += 2;
        a += 'c';
        a += false;
        System.out.println(a);//2cfalse
        if(a == "2cfalse") System.out.println("==");//null
        if(a.equals("2cfalse")) System.out.println("equals");//equals
    }
}
