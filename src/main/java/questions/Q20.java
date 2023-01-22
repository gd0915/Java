package questions;

import java.util.Arrays;

public class Q20 {
    /*
     * create a method accepts a name as parameter
     * and prints the name as a char array
     *
     * (do not use toCharArray() method)
     *
     * Input : John
     * Output : [J, o, h, n]
     */


    public static void main(String[] args) {

        String name ="John";

        System.out.println(Arrays.toString(getNameAsAChar(name)));

    }
    public static char[] getNameAsAChar(String name){

        char c[]=new char[name.length()];

        for(int i=0;i<name.length();i++){
            c[i]=name.charAt(i);

        }
        //System.out.println(Arrays.toString(c));
        return c;

    }

}
