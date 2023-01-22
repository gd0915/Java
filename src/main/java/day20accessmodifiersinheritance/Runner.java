package day20accessmodifiersinheritance;

public class Runner {

    public static void main(String[] args) {

        //to access stdName, stdGpa, StdAddress variable we have to create an object from the Student class
        //stdId is not visible, because it is private and can be used just inside the class where it is created in
        //I accessed data on the object
        Student std1 = new Student();
        System.out.println(std1.stdName);//Tom Hanks

        Student std2 = new Student();
        System.out.println(std2.stdGpa);//3.83

        // If you want to access data inside the class without using any object,
        // the data must be static
        //If something is private we cannot access it even if it is static
        System.out.println(Student.address);

        //Note: Default access modifier ==> package private (synonym)
    }
}
