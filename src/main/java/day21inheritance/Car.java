package day21inheritance;

public class Car {

    public void engine(){

        System.out.println("All cars have engine");
    }

    public Car(){

        System.out.println("Car class constructor 1");
    }

    public Car(String engineType){
        super(); //optional to type
        System.out.println(engineType);
    }

    public Car(int engineSize){

        System.out.println(engineSize);
    }

    public Car(String engineMake, int enginePrice){
        this(5000);
        System.out.println(engineMake + "-" +  enginePrice);
    }



    /*
    When I create a Car object I have to select;
    1)Engine Type
    2)Engine Size
    3)Engine Make and Price
     */




}
