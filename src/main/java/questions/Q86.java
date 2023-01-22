package questions;

import java.util.Arrays;

public class Q86 {

     /*
        Given an integer array, return the array sorted lowest to highest.
        CHALLENGE: Write the Sort algorithm, don't use the .Sort() method provided to an array.
        arraySort([8, 13, 9, 12]) → [8, 9, 12, 13]
*/

    public static void main(String[] args) {

        int a[] = {8, 13, 9, 12};

        for (int i = 0; i < a.length; i++)

            for (int j = 0; j < a.length; j++) {

                if (a[i] < a[j]) {

                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];

                }
            }


        System.out.println("First way by using sorting algorithm");

        System.out.println(Arrays.toString(a));
        System.out.println("maximum element is " + a[a.length - 1]);
        System.out.println("minimum element is " + a[0]);

    }
}
