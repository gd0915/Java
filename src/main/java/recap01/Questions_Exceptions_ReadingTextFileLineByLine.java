package recap01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Questions_Exceptions_ReadingTextFileLineByLine {

    /*
    Exceptions:
    "Exception" means unexpected issues in code execution

    Exception Hierarchy:
    All exception and error types are subclasses of class Throwable, which is the base class of the hierarchy.
    One branch is headed by Exception. This class is used for unexpected/exceptional conditions that user programs should catch.
    Another branch, Error. Unlike Exceptions, Errors cannot be handled. StackOverflowError is an example of such an error.

    Under the Exceptions there are two Exceptions categories.
    1- Checked Exceptions:   Checked exceptions are called "compile-time exceptions" because these exceptions are checked at compile-time by the compiler.
                             They must be handled because if you have compile-time exception it will have red underline. We cannot run our code.
    2- Unchecked Exceptions: The unchecked exceptions are just opposite to the checked exceptions.
                             The compiler will not check these exceptions at compile time.
                             In simple words, if a program throws an unchecked exception, and even if we did not handle or declare it,
                             the program would not give a compilation error.
                             We have to handle run-time exception as well, otherwise our code will be blocked because Java stop execution after finding exception

    To handel an Exception we have 2 options:
    1- Throws Keyword in the method signature line
    2- Try-Catch Block
    //In depends on the requirement when will we use which method but most of the time we use Try-Catch block

    To Read Text File by typing Java Code: ==> throws Compile Time Exception
    1- Reading Character by Character ==> We create an object from the FileInputStream class to access the text file
        A) (When we type/create FileInputStream object Java will have 2 concerns)
            i)  If the path is true //FileNotFoundException
            ii) If the file exists //FileNotFoundException
                to handle FileNotFoundException  ==> We use Try-Catch Block with FileNotFoundException class(more actions ==> surround with try-catch)
        B) (When we use read() method to read the text Java will have concern ==> Java cannot read the text
                to handle that concern ==> We use Try-Catch Block with IOException class(more actions ==> add catch clause)
                IO Exception class is the parent of FileNotFoundException class (IO covers everything that FNFException cannot do)
                If there is a parent-child relationship between the exception classes,
                in Try-Catch block parent class should come after the child classes (otherwise CTE)

    2-Reading Line by Line ==>
        How to access text file:
        A) We create an object from BufferedReader class to read a text line by line
           (Buffered Reader class has method to read a text)
           When we create Buffered Reader object Java "FileReader" will have concerns(red line)
                click on "More Actions" ==> There are 2 options
                i)  Use Throws Keyword => Add exception to method signature (Java stop execution for the next/coming codes)
                ii) Surround with try-catch (We use try-catch) (Java will not stop execution for the coming codes)

                    After using try-catch block==>
                    Java throws "FileNotFoundException" and gives technical message "e.printStackTrace()"
                     If we want we can remove it and type our message
                     --If the path is true //FileNotFoundException
                     --If the file exists //FileNotFoundException

         How to read the text:
         B) After accessing the text we use readLine() method from the reader object inside the try block to read the text line by line
            But readLine() method is complaining again ==> click on "more actions" There are 4 options
                  i)   Add exception to method signature (Use Throws Keyword )
                  ii)  Surround with try-catch (It provides nested try we do not want it)
                  iii) Add catch clause (use multiple catch blocks) ==>We use add catch clause!!!!!!
                  iv)  Replace with (parent)IOException (if we want we can do it)
            After handling the exception we use while loop to read the text line by line

     */

    public static void main(String[] args) {


    readFileLineByLine();


    }


    public static void readFileLineByLine(){
        //Buffered Reader Constructor uses parameter ==>  FileReader object (File reader is a class in Java)
        //This part allows us to access the text
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src\\main\\java\\interview\\File01.txt"));

            String line= reader.readLine(); //We are choosing readLine() method because we will read the text line by line ==> returns String

            while(line!=null){
                System.out.println(line); //printing line
                line = reader.readLine(); //that one will give me the next line ==> it gives direction
            }

        } catch (FileNotFoundException e) {
            System.out.println("There is an issue about the path or about the file - " + e.getMessage());;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }






}
