package day23encapsulationabstraction;

/*
        1)Sometimes no child uses the implementation from the parent class
          Therefore, the body part of the method in Parent class is being unusable.
          If something is unusable, we do not want to type it.
          If you do not type the body of a method you will have "method without body"(Like angels),
          it is called "Abstract Method"

         2)"Concrete (Regular) Methods" (methods with body) focus on 2 things; i)What to do ii)How to do
           But "Abstract Methods" focus on just "What to do"

         3) If you make a method "abstract", it will be mandatory to override for all child classes

         4) Abstract method can be created just in Abstract Classes
            To make a class abstract put "abstract" keyword between "access modifier" and "class keyword"

         5) When you remove method body you have to use "abstract" keyword between "access modifier" and "return type"

         6) It is impossible to create "object" from an "Abstract Class"
            But it does not mean Abstract classes do not have constructors
            They have "constructors" but constructors are not used to create objects. They cannot be instantiated.!!

         7) Abstract classes can have "concrete methods" as well. (Concrete classes cannot have abstract methods.)

         8)"Concrete Methods" may or may not be overridden by child classes(It is optional)

         9) Abstract methods cannot be put into a non-abstract class

         10) Normally child class must override all "abstract methods" from the parent class.
             Even Mammal Class did not override anything from the Animal Class, no complain.

             Because "Overriding abstract methods from parent" is mandatory just for "Concrete Classes"

             "Overriding abstract methods from parent" is NOT mandatory for abstract classes

          11) A method cannot be abstract and static at the same time. (Because they do not have a body)

          12) An abstract method cannot be defined as final because otherwise they cannot be overridden.

     */


public abstract class Animal {

    public abstract void eat();  // click on the "more actions" after waiting on the red line and choose "make abstract"
                                 // It makes the Animal class abstract by putting "Abstract keyword before the class keyword
                                 // because Abstract method can be created just in Abstract Classes


    public abstract void drink();

    public void move(){  // Did not complain when we put concrete method inside the abstract class
                         // because to override move() method from all child classes is not mandatory

        System.out.println("Animals move...");
    }


}
