package selfpractices.selfpractice_lambda;

public class LambdaVariables {
    int eId; //instance var
    String eName; //instance var
    static String company = "Abc ltd."; // static variable

    public static void main(String[] args) {
        final int age = 25; //local variable   --- Local variables cannot be changed in the lambda exp. Only get/read.
        String role = "Developer"; //local variable

        LambdaVariables obj = new LambdaVariables();
        InterfaceVar ref = () -> {
            System.out.println("Lambda exp local variables");
            System.out.println("Emp age " + age);
            System.out.println("Emp role " + role);

            System.out.println("Lambda exp static variable");
            System.out.println("Emp company= " + company);
            obj.eId = 100;
            obj.eName = "I changed name";

            System.out.println("Lambda exp instance variable");
            System.out.println("Emp id =" + obj.eId);
            System.out.println("Emp eName =" + obj.eName);
//
//
        };
        ref.varScope();


    }


}
