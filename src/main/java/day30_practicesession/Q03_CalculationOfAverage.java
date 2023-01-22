package day30_practicesession;

public class Q03_CalculationOfAverage {

    //Create a method to calculate 4 students' 3, 4, 6 and 5 exams' average respectively

    public static void main(String[] args) {

    calculateAverage("Tom", 55, 65, 40, 87);
    calculateAverage("Ali", 67, 90, 100, 45, 69, 90);
    calculateAverage("John", 45, 85, 60, 45, 75);

    }

    public static void calculateAverage(String stdName, double...mark){
        double sum = 0;

        for(double w: mark){

            sum += w;

        }
        System.out.println(stdName + " 's Average of Exams: " + String.format("%.2f", sum/mark.length));
        //By this way I am going to see my data with just 2 digits in the decimal part


    }





}
