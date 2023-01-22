package day22inheritancepolymorphism;

public class Animal {

    public String name = "Animal";


    //Overridden Method
    public void eat(){
        System.out.println("Animals eat..");
    } //If I get this method from the Cat Class, it will print "Animal eats.." which is not good
      //to update this method into "Cat eats.." I need to update it by creating Overriding
      //We do not touch method name or parameter, we touch just the method body

    public Animal create(){
        return new Mammal();
    }

    public Integer add(){
        return 12;
    }

    public int multiply(){   //cannot be overridden ==> primitive data types are not a class
        return 24;
    }

    public final int divide(){  //it cannot be overridden because its body cannot be updated of a final method
        return 34;
    }

    private boolean isRetired(){ //It cannot be overridden because private class members cannot be accessible from the other classes
        return true;
    }

    public static int counter (){  //static method cannot be overridden because static things are common for all child classes and will affect the other classes as well
        return 5;
    }



}
