package questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q84 {

    ////Example 1: Type code to print repeated character in a String
    ////"HelloEveryone" ==> l

    public static void main(String[] args) {
        String str = "HelloEveryone";

        String result = "";

        for(int i=0; i<str.length(); i++){
            String ch = str.substring(i, i+1);

            if(str.indexOf(ch) != str.lastIndexOf(ch) && !result.contains(ch)){
                result += ch + " ";
            }
        }
        System.out.println(result);




    }


}
