package day23encapsulationabstraction;

public class Student {


    public String name = "Tom Hanks";
    private String stdId = "TH123";
    private double stdGpa = 3.8;
    private String disease = "Heart Disease";
    private boolean successful = false;

    public String getStdId() {   //Getters will be public everytime. It will be readable from the entire project.
        return stdId;            //Return type of get() method must match with the data type of the variable ==> String
    }                            //The name of the get() method ==> Naming Convention ==> When you create a get() method we put first "get" and then
                                 //  we put the name of the variable by starting to type with Uppercase

    public double getStdGpa() {
        return stdGpa;
    }

    public String getDisease(){
        return disease;
    }

    //If the data type is "boolean" get() method name start with "is" (Java will do it automatically)
    public boolean isSuccessful() {
        return successful;
    }

    public void setDisease(String disease) {//Everytime set() method return type will be "void" because set() method will do just an action. Tt will change the data.
        this.disease = disease;             //Normally disease was "heart disease" but I will update it and for example make it "null"
    }

    public void setStdGpa(double stdGpa){
        this.stdGpa = stdGpa ;
    }

    //Even the data type is boolean we used "set" at the beginning of the name
    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public static void main(String[] args) {
        /*
                Encapsulation
                Encapsulation is "data hiding"
                To hide a data we make the access modifier "private"
                After "hiding data", you may need to "read" or "update" data .
                To "read" or "update" the data we will create some methods
                To "read" "encapsulated data" you should create "get()" methods, we name it "getters"
                To "update" "encapsulated data" you should create "set()" methods, we name it "setters"

                "get()" nad "set()" methods are called "Java Beans"

                If a class is "immutable", it is impossible to change the value of the existing variable.
                If you want to make a class "immutable" do not create any "setter" method


                Note: By using set() method we prevent confusion and save memory by creating just 1 object.
                      If we use less code there will be less distraction.
                      After encapsulation Java let us access and update the data by using get() and set() methods
         */
    }
}
