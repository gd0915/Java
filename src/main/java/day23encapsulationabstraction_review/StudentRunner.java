package day23encapsulationabstraction_review;

public class StudentRunner {

    public static void main(String[] args) {

        Student std1 = new Student();

        System.out.println(std1.name);

        System.out.println(std1.getStdId());//TH123

        System.out.println(std1.getStdGpa());//3.8

        System.out.println(std1.getDisease());//Heart Disease

        System.out.println(std1.isSuccessful());//false

        std1.setDisease(null);
        System.out.println(std1.getDisease());
        std1.setDisease("Cancer");
        System.out.println(std1.getDisease());

        std1.setStdGpa(5.6);
        System.out.println(std1.getStdGpa());

        std1.setSuccessful(true);
        System.out.println(std1.isSuccessful());



    }
}
