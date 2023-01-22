package selfpractices.selfpractice_inheritance02;

public class
ChildOfBaseClass1 extends BaseClass{

    public static void main(String[] args) {

        num = 20;
        method1();

        //Static variables or static methods can be accessed directly from the parent class In this example, Java does not complain and
        // go to the parent class and run the method1() and assign a value into the num variable.

        ChildOfBaseClass1 obj = new ChildOfBaseClass1();
        obj.str = "Can";
        obj.method2();




    }

}
