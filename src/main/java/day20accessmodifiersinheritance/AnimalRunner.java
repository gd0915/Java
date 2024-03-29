package day20accessmodifiersinheritance;

public class AnimalRunner {

    public static void main(String[] args) {

        //Create a "Cat" object and see which methods can be used
        Cat c = new Cat();
        c.eat();
        c.drink();
        c.meow();

        //Create a "Dog" object and see which methods can be used
        Dog d = new Dog();
        d.eat();
        d.drink();
        d.bark();

        //Create a "Bird" object and see which methods can be used
        Bird b =new Bird();
        b.eat();
        b.drink();
        b.tweet();

        //Create an object from Animal class
        Animal a = new Animal();
        a.eat();
        a.drink();

        /*
        1)We use "inheritance";
            i)to prevent "repetition"
            ii) to make "maintenance" easy
            iii) to make our classes "atomic"

        2)To make a class child of another class we use "extends" keyword

        3) Child classes can use class members from the parent classes
        however, parent classes cannot use anything from the child classes

        4)Every class except "Object Class" in Java has at least one parent class which is "Object Class"

        5)Inheritance Types in Java
           1)Multilevel Inheritance (The multilevel inheritance is like apartment)
           2)Hierarchical Inheritance
           3)Multiple Inheritance (Java does not use/support it.)
           4) Opposite of "Multiple Inheritance" is "Single Inheritance"
              Java supports "Single Inheritance"
         */


    }
}
