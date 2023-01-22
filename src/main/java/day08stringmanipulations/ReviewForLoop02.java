package day08stringmanipulations;

public class ReviewForLoop02 {

    public static void main(String[] args) {

        //Put * between 2 consecutive characters and to the end in a String. For example; Java ==> J*a*v*a*

        String str = "Java";// Make the starting value "0" because the index number of the first character is "0"
                            //When you are working with Strings make the starting value index number "0"

        for(int i = 0; i<str.length() ; i++ ){
            System.out.print(str.charAt(i) + "*");
        }

        System.out.println();

        //2.Example:Type code to print unique characters in a String. Hello ==> Heo   ==>Interview question by Ebay

        String s = "Hello";

        for(int i = 0 ; i<s.length() ; i++){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                System.out.print(s.charAt(i));
            }
        }




    }
}
