package self_notes;

import java.util.Arrays;

public class CopyingArrays {

    public static void main(String[] args) {


        //copying Arrays

        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] copyArray = numbers;          // copying arrays

//        for (int number: copyArray) {
//            System.out.print(number + ", ");
//        }

        System.out.println();
        numbers[0] = -1;

        System.out.println(Arrays.toString(copyArray)); // 1, 2, 3, 4, 5, 6
        System.out.println(Arrays.toString(numbers));   // -1, 2,3,4,5,6


        //It's because both arrays refer to the same array object. This is because of the shallow copy.


        //arraycopy(Object src, int srcPos, Object dest, int destPos, int length)


        int[] n1 = {2, 3, 12, 4, 12, -2};

        int[] n3 = new int[5];  // 0 12 4 0 0


        int[] n2 = new int[n1.length];


        System.arraycopy(n1, 0, n2, 0, n1.length);      // copying elements from index 2 on n1 array
        System.out.println("n2 = " + Arrays.toString(n2));


        System.arraycopy(n1, 2, n3, 1, 2);          // copying element to index 1 of n3 array
        System.out.println("n3 = " + Arrays.toString(n3));


        int[] source = {2, 3, 12, 4, 12, -2};


        int[] destination1 = Arrays.copyOfRange(source, 0, source.length);  // copying entire source array to destination
        System.out.println("destination1 = " + Arrays.toString(destination1));


        int[] destination2 = Arrays.copyOfRange(source, 2, 5);          //// copying from index 2 to 5 (5 is not included)
        System.out.println("destination2 = " + Arrays.toString(destination2));

    }
}
