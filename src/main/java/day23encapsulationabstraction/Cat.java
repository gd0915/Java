package day23encapsulationabstraction;

public class Cat extends Mammal {

    public void meow(){

        System.out.println("Cats meow...");
    }

    @Override
    public void eat() {  //to implement abstract it will be mandatory to override for all child classes

        System.out.println("Cats eat...");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink...");
    }

    //public abstract void hunt();//Abstract methods cannot be put into a non-abstract class ==>red underline



}
