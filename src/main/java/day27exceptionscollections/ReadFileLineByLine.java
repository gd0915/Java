package day27exceptionscollections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

    public static void main(String[] args) {

    readFileLineByLine();
    }

    public static void readFileLineByLine(){

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src\\main\\java\\day26exceptions\\File02.txt"));
            //fromIO library ==> you are inputting something into your code
            //read line ==> we chose "surround try-catch block"

            String line = reader.readLine(); //red line ==> to fix it "add catch clause" under more actions // This method will get the first line

            while(line != null){  //when the line is null, it will break the loop
                System.out.println(line);//printing first line
                line = reader.readLine();// Java will go to the next line after printing previous one and get the next line
            }

        } catch (FileNotFoundException e) {  //handling the exception / red line related with "BufferedReader()" in the 18th line
            System.out.println("There is an issue about the path or about the file - " + e.getMessage());
        } catch (IOException e) { //handling the exception / red line related with "reader.readLine()" in the 22nd line
            e.printStackTrace();
        }

    }

}
