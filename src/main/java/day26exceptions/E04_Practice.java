package day26exceptions;

public class E04_Practice {

    //Write a program for example of try and catch block. In this check whether the
    //given array size is negative or not.

    public static void main(String[] args) throws InterruptedException {


        try {
            int[] size = new int[-4];

            System.out.println(size.length);

        } catch (NegativeArraySizeException e) {
            System.out.println("Array size cannot be negative");
        }

        Thread.sleep(2000);







        }


    }
