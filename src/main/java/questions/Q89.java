package questions;

public class Q89 {
    /*
    Question 44- Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string
    on the outside and the longer string on the inside. The strings will not be the same length, but
    they may be empty (length 0).
    comboString("Hello", "hi") → "hiHellohi"
    comboString("hi", "Hello") → "hiHellohi"
    comboString("aaa", "b") → "baaab"

     */
    public static void main(String[] args) {

        String str2 = "Hello";
        String str1 = "hi";

        if(str1.length()==str2.length()){
            System.out.println("The length cannot be the same");
        }else if(str1.length()==0){
            System.out.println(str2);
        }else if(str2.length()==0) {
            System.out.println(str1);
        }else if(str1.length()>str2.length()){
            System.out.println(str2+str1+str2);
        }else if(str1.length()<str2.length()){
            System.out.println(str1+str2+str1);
        }











    }
}
