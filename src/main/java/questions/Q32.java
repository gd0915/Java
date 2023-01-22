package questions;

public class Q32 {

    public static void main(String[] args) {

        //Type a program to reverse a String

        String str = "Learn Java";

        String reversed ="";
        for(int i=str.length()-1; i>-1; i--){
            String ch= str.substring(i, i+1);
            reversed += ch;

        }
        System.out.println(reversed);
    }
}
