package question_bank.if_statement;

public class IfStatement_Q10 {
    /*
                Type code to print the messages about the Body Mass Index(BMI) for the given BMI values
         Invalid BMI value < 0
         Underweight = <18.5
         Normal weight = 18.5–24.9
         Overweight = 25–29.9
         Obesity = BMI of 30 or greater
     */

    public static void main(String[] args) {

        double BMI = 24.9;

        if(BMI<0){
            System.out.println("Invalid value!");
        }else if(BMI<18.5){
            System.out.println("Underweight");
        }else if(BMI>=18.5 && BMI<=24.9){
            System.out.println("Normal weight");
        }else if(BMI>=25 && BMI<=29.9){
            System.out.println("Overweight");
        }else if(BMI>=30){
            System.out.println("Obesity");
        }









    }
}
