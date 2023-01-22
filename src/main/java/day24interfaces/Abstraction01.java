package day24interfaces;

public abstract class Abstraction01 {

        /*
          "final" keyword is very important in Java
          1)"final" keyword can be used for variables
          public final int age = 12;
          If you make a variable "final" you cannot change its value
          "final variables" must be initialized.

          2)"final" keyword can be used for methods
          "final method" body cannot be updated

          3)"final" keyword can be used for classes
          "final classes" cannot have child classes

          Note: "Abstract classes" are like to do list for child classes because there are the methods without method body
                "Abstract classes" have something to do for child classes , if there is no child class, having "to do list" is not sensible.
                "final classes" cannot have child classes, therefore Java does not allow to make an abstract class final

          Note: "final method body" will be under protection by Java because it should not be updated.
                 But  abstract methods do not have body, Java will look for the body to protect when it could not find it will complain

         */

    public int age;
    public static final double pi = 3.14;

    public abstract int add();

    public static void main(String[] args) {

       // pi = pi++;//If you make a variable "final" you cannot change its value, so it will complain when we try to assign a new value to the variable

    }














}