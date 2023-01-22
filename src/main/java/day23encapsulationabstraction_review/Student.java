package day23encapsulationabstraction_review;

public class Student {

    public String name = "Tom Hanks";
    private String stdId = "TH123";
    private double StdGpa = 3.8;

    private boolean successful = false;

    private String disease = "Heart Disease";

    public static void main(String[] args) {


    }

    public String getStdId() {
        return stdId;//go to the stdId variable and give it to the user
    }

    public double getStdGpa(){
        return StdGpa;
    }

    public String getDisease(){
        return disease;
    }

    public boolean isSuccessful(){
        return successful;
    }

    public void setStdGpa(double stdGpa) {
        this.StdGpa = stdGpa;
    }

    public void setDisease(String disease){
        this.disease = disease;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}
