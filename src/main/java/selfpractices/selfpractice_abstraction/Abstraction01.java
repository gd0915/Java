package selfpractices.selfpractice_abstraction;

public class Abstraction01 {

    /*
    1) A class can be abstract. What is an abstract class?

    In OOP class, we think all classes are created to create an object in Java. However, some classes are not created to
    create an object; they are created to group the subclasses that have common features and define their general features.
    By creating abstract class, we force child classes to use/implement the methods which we are created in an abstract class.
    Java tells us if we do not create an object from this kind of classes then Java separate these classes from  the regular concrete classes.
    (So this is a result/solving of a problem)
    Only the child classes can create an object, and this object can have all the features that all abstract parent classes have.

     2)A method can be abstract. What is an abstract method?

     A concrete method, have an action. For example,

             protected int calculateSalary(int salaryPerHour, int workHourPerMonth){

                int salary = salaryPerHour * workHourPerMonth;
                return salary

      However, an abstract methods do not have method body.

           protected abstract int calculateSalary(int salaryPerHour, int workHourPerMonth);

      What does it mean? If the parent class have calculateSalary() abstract method, all child classes must have this method, but every
      child class will create their own implementation/method body. Abstract method focuses on "What to do".



     */
}
