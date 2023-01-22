package day26exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E03 {

    /*

        1)"FileNotFoundException" is related with the "Path of the file" and the "Existence" of the file
        2)"FileNotFoundException" is "Compile Time Exception"(Checked Exception)
        3)"FileNotFoundException" is the child of "IOException"

        4)"IOException" is related with all possible input output issues
        5)"IOException" is "Compile Time Exception"(Checked Exception)
                            "Run Time Exception"(Unchecked Exception)
        6)When you use parent and child exception classes together in a try-catch,
          child classes must come first otherwise Java gives error.

        7)When you encounter a "Compile Time Exception", you have 2 options
            i)Using "throws" in method signature line
                *Java will throw exception and stop the execution
            ii)Using try-catch block
                *Java will execute whatever you type inside the catch body and does not stop the execution

        8)What is the difference between "throw" and "throws" keyword ====> INTERVIEW QUESTION!!!
        *** i)"throw" keyword is used to throw any Exception in anywhere inside the method body
              "throws" is used in the method signature line
            ii)By using "throws" keyword you can declare multiple exceptions(throws IOException, FileNotFoundException...)
                After using throw keyword you can declare just one exception
            iii)After using "throw" keyword, you have to  create an Exception object(look at the example ==> in the E01)
                After using "throws" keyword, you will tell just the name Exception class

         9)What is the difference between "Exception" and "Error"?
           "Exception" can be handled by typing codes but "Error" cannot.
           OutOfMemory(Heap memory is full), StackOutOfMemory, VirtualMachine, Assertion can be example for errors .
     */

    public static void main(String[] args) throws IOException {


        readTheText();

        System.out.println();

        readTheTextFromTheFile();

    }

    /*
    Note: To get data from a file we are using "FileInputStream"(Whatever you see in the file put them in the code)
          It is coming from Java "IO Library" (input output library)
     */


    // 1.Example: Create a method to read a text from a text file
    //If the path is wrong, if the file does not exist, if the text cannot be read stop execution
    public static void readTheText() throws IOException {

        FileInputStream fis = new FileInputStream("src\\main\\java\\day26exceptions\\File01.txt") ;//remove the part before "src"
                               // This code works with the address of the text file ==>
                               // we went to the text file ==> click on the right button => copy/path reference ==> Absolute Path
                               // We use FileInputStream from Java io library to get data from the text
                               // It will give compile time error: Java has 2 concerns:
                               //      i) If the address is incorrect what Java will do
                               //      ii) If the text file is deleted what Java will do
                               // ==> put the mouse on the "FileInputStream" ==> "more actions" ==> select "add exception to method signature"
                                                        //it means that code will throw exception(FileNotFoundException) and stop execution


        int k =0;

        while((k = fis.read()) != -1){  //put the mouse on the "Read" ==> select "add catch clause"
                                        //"surround with try catch" ==> adding "try-catch block" inside the while loop,
                                        // therefore, we do not prefer this one.
                                        //At the end, for empty char read() method will return "-1". If it is false the loop will be broken.
                                        //That code read the text character by character.
                                        // read() method turns integer, therefore we did "type casting" to char
            System.out.print((char)k);

        }

    }

    // 2. Example: Create a method to read a text from a text file
    // If the path is wrong,(FileNotFoundException) give a message to the user and do not stop execution by using try-catch
    // If the file does not exist,(FileNotFoundException) give a message to the user and do not stop execution by using try-catch
    // If the text cannot be read,(FileNotFoundException) give a message to the user and do not stop execution by using try-catch

    //If I type the path incorrect it throws "FileNotFoundException"

    public static void readTheTextFromTheFile(){

    try {
        FileInputStream fis = new FileInputStream(("src\\main\\java\\day26exceptions\\File01.txt"));
        // put the mouse on the "FileInputStream" ==>"more actions" ==> second option is "surround with try catch"

        int k = 0;
        while ((k = fis.read()) != -1) { // put the mouse on the "Read" ==> select "add catch clause"
                                         //"surround with try catch" ==> adding "try-catch block" inside the while loop again(nested try-catch), we do not prefer this one.
            System.out.print((char) k);

        }
    }catch (FileNotFoundException e) {
        System.out.println("There is an issue in path or in the file - " + e.getMessage());
    }catch (IOException e) {
        System.out.println("There is an issue reading the text - " + e.getMessage());
    }
        System.out.println("Execution did not stop");
    }



}
