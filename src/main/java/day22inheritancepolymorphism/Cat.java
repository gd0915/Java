package day22inheritancepolymorphism;

public class Cat extends Mammal{

    public String name = "Cat";

    public Cat() {
        System.out.println(name);//cat
        System.out.println(super.name); //It takes you just to the parent not to the grandparent, if you cannot find in the parent class,
                                        // then will go to the grandparent class
                                        //Mammal==> if I close name variable in Mammal it will go to the grandparent class
                                       // and will print the value of the name==>Animal
                                       //super.name ==> Java will go to the parent class and check if there is a variable with the same name
        //we can use super inside the constructor repeatedly
    }

    //right click on mouse-->Generate-->Override Methods--> select eat() -->OK-->delete super() in it.  ==>put specific implementation

    @Override  //Do not remove Override annotation here, because it is checking and showing if there is any problem by printing red line
    public void eat(){  //If I do access modifier "protected" it is complaining because access modifier in child class cannot be " Narrower"
        System.out.println("Cats eat...");
    }
    //When we make Method Overriding we make implementation , maintenance, and update easy

    @Override
    public Mammal create() {
        return new Mammal();
    }

    //We cannot use child classes as return type by overriding. It will complain.


    @Override
    public Integer add() {  //If I do short it will complain because short is not the child of the integer class, there is no "IS-A" relationship
        return 23;
    }

    @Override
    public int multiply() {
        return 46;
    }


}
