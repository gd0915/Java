package questions_02;

public class Q14 {

    public static void main(String[] args) {

        //Type code to print characters before the last occurrence of "p" in a String
        // String str = "Mississippi";   Output ==> "Mississip"

        String str = "Mississippi";

        for(int i =0 ; i<str.length(); i++){
            int lastIndexOfP = str.lastIndexOf("p");
            String s = str.substring(i, i+1);
            if(i==lastIndexOfP){
                break;
            }
            System.out.print(s);
        }


    }
}
