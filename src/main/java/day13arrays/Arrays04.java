package day13arrays;

import java.util.Arrays;

public class Arrays04 {

    public static void main(String[] args) {

        // Example: [0, 2, 3, 0, 12, 0] put the zeros to the end

        int num [] = {0, 2, 3, 0, 12, 0};

        int newNum [] = new int[num.length];

        int firstIdx = 0;
        int lastIdx = num.length-1;


        for (int i = 0; i < num.length; i++) {

            if (num[i] != 0) {

                newNum[firstIdx] = num[i];
                firstIdx++;

            } else {

                newNum[lastIdx] = 0;
                lastIdx--;
            }
        }
            System.out.println(Arrays.toString(newNum));










    }
}
