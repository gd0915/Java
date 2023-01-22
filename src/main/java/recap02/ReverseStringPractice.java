package recap02;

public class ReverseStringPractice {

    public static void main(String[] args) {

        //Reverse a String

        String str = "Hatice Sozeri";

        String reversedName= "";

        for(int i = str.length()-1; i>-1; i--){

            String ch = str.substring(i, i+1);

            reversedName = reversedName + ch;

        }
        System.out.println(reversedName);

















    }
}
