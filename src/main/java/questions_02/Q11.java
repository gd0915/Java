package questions_02;

public class Q11 {

    public static void main(String[] args) {

        // Type all characters before the first occurrence of 'm' in a String
         String sd = "Christmas";

        for(int i = 0 ; i<sd.length();i++ ){
            if(!sd.substring(i, i+1).equals("m")){
                System.out.print(sd.substring(i, i+1));
            }else{
                break;
            }
            }


    }
}
