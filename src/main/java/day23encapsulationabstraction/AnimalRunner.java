package day23encapsulationabstraction;

public class AnimalRunner {

    public static void main(String[] args) {


        Cat c = new Cat();
        c.eat();//Cats eat...
        c.drink();//Cats drink...
        c.meow();//Cats meow...

        //Animal a = new Animal(); //It is impossible to create object from an "Abstract Class"
                                 // because inside the Abstract class there is a constructor, but it is not to create an object



    }
}