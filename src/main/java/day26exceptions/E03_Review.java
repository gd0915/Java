package day26exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E03_Review {

    public static void main(String[] args) throws IOException {

        readTheText(); //It gives red line because the method throws IOException
                       //Therefore, click on the right button and select "add exception to method signature" from "more actions"

        System.out.println();
        System.out.println();

        readTheTextFromTheFile();

    }


    public static void readTheText() throws IOException {

        FileInputStream fis = new FileInputStream("src\\main\\java\\day26exceptions\\File02.txt");

        int k=0;
        while((k= fis.read()) != -1){   //read() method turns integer, therefore we did "type casting" to char
            System.out.print((char)k);
        }

    }


    public static void readTheTextFromTheFile(){


        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\day26exceptions\\File02.txt");

            int k=0;
            while((k= fis.read()) != -1) {   //read() method turns integer, therefore we did type casting to char
                                             //"surround with try catch" ==> adding try-catch block inside the while loop, we do not prefer this one.
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("There is an issue in path or in the file - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("There is an issue in reading the text - " + e.getMessage());
        }
        System.out.println("Execution did not stop");
    }


    }
