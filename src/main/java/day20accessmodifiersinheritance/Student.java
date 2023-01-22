package day20accessmodifiersinheritance;

public class Student {

    //It is accessible from entire the project, there is no restriction
    public String stdName = "Tom Hanks";

    //It can be used just inside the "Student" class.
    //It can be used just inside the class it was created
    private String stdID = "TH202217007";

    //It can be used just inside the "day20accessmodifiersinheritance" package
    //It can be used just inside the package it was created
    double stdGpa = 3.83;//If you do not type any access modifier it will be "default"

    // It can be used inside the "day20accessmodifiersinheritance" package, and from the child classes in other packages
    protected String stdAddress = "Miami, FL USA";


    //private class members can be reached only within the class where they created are. They are not visible from the Runner class through the object name.
    //Whatever you have inside the class, the object will have them.

    //Following ones are "static", to access static things do not use "object", use class name
    public static String Name = "Tom Hanks";
    private static String ID = "TH202217007";

    static double gpa = 3.83;//If you do not type any access modifier it will be "default"
    static String address = "Miami, FL USA";

    //ID is still not accessible even if it is static because ID variable is private. It is not visible.


    //If we create a class in another package in the same project :
    //Student std3 = new Student();
    //Student class is in different package. We should first import from the day20 package.

    //System.out.println(std3.stdName); //just name is visible because it is public; it is accessible from any package
    //"default" variable is only open for the day20 package; it cannot be accessible from outside day20 package
    //"protected" variable is just visible for the same package and the child classes in different package,
    //     but if the class we created in different package is not a child class of the class
    //     where we are declaring the variable in, then it will be not visible/ accessible for that class


    /* Interview question:
    1)What is the difference between "default" and "protected" access modifiers?
        i) Protected access modifier is wider than default access modifier because both are open to the package but protected is open to the child classes from the other packages well
        ii) Default ones cannot be used from outside the package. Therefore, it's other name is "package private"
        iii)Protected ones can be used from the classes in other packages if the classes are "child classes" .

    2)Could you please tell name of the access modifiers from the narrowest to the widest?
        private < default < protected < public

    3)Could you please explain all access modifiers?

     */

    //A class cannot be "private" and cannot be "protected"
    //A class can be "default" or "public"

    //Default access modifier : When we do not mention any access modifier, it is called default access modifier
    //Public access modifier: can be accessed from anywhere, there is no restriction
    //Private class members can be accessible only inside the class

}
