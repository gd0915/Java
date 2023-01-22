package questions;

import java.util.Arrays;

public class Q30 {

    /*
    Write a code that returns the duplicate chars in a String array.(interview Question)
    Input :

    String str=“Javaisalsoeasy”
    Output: [a, s]
     */

    public static void main(String[] args) {

        String str="Java is also easy";

        String arr []  = str.replaceAll("\\s", "").split("");
        System.out.println(Arrays.toString(arr));

        String s = "";
        for(int i = 0; i< arr.length; i++) {
            int counter = 0;
            for (int j = 0; j < arr.length; j++) {

                if (arr[i].equals(arr[j])) {
                    counter++;
                }
            }
            if (counter > 1 && !s.contains(arr[i])){
                s = s + arr[i] + " ";
            }
        }
        System.out.println(s);//a s


    }
}
