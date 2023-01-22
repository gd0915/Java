package day12variabletypesstaticblockarrays;

public class VariableTypes01 {

    //"name" is "non-static" or "object" or "instance" variable
    public String name = "Tom Hanks";


    //"age" is "static" or "class" variable
    public static int age =13;

    //local variable
    //If you create variable inside a method it is called "local variable"
    //Note: When you create a local variable, it is mandatory to assign a value
    //      If you try to use a local variable without assigning a value it complains

    //Note: If the return type is different from "void"
    // you have to use "return" keyword inside the method

    //Note: When you create a method, use the "return keyword" in the last line.
    //  After using "return" keyword you cannot type any code after return keyword
    // Note: Local variables cannot be used outside  the method, otherwise it will give error
    //       They can be used just inside the method
    public int add(int a, int b) {

        int x = 13;//local variable
        //int x;
        //System.out.println(x);//without assigning any variable like that int x; we can not use the local variable
        System.out.println(name);//If I type "name" inside the variable, I can use it because we assigned a value at the beginning to the name variable

        return a+b;
    }
       //after finding the result, return keyword gives the result to someone


    //Example: Create method to do multiplication

    public int multiplication(int c, int d){

        String s = "Java";//local variable

        return c*d;
    }




}
