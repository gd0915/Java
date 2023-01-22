package day23encapsulationabstraction;

public class StudentRunner {

    public static void main(String[] args) {

        Student std1 = new Student();

        System.out.println(std1.name);//Tom Hanks

        System.out.println(std1.getStdId());//TH123 ==> We are just able to read the stdId method by using get() method

        System.out.println(std1.getStdGpa());//3.8

        std1.setDisease(null);//I updated and changed the value of the variable on the object from "Heart disease" to "null"
                              //I do not update the value of the variable in the Student class
        System.out.println(std1.getDisease()); // null
                                               //If I remove the set(null) method from above I will see "Heart disease" after printing the Disease

        std1.setDisease("Cancer");
        System.out.println(std1.getDisease());//Cancer

        std1.setStdGpa(5.8);
        System.out.println(std1.getStdGpa());//5.8

        std1.setSuccessful(true);
        System.out.println(std1.isSuccessful());//true

    }
}
