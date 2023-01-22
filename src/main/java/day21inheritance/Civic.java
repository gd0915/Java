package day21inheritance;


public class Civic extends Honda {

    public void ecoEngine(){

        System.out.println("Civic uses eco engine");
    }

    public Civic(){

        System.out.println("Civic Class constructor 1" );
    }

    public Civic(int year){
        super(true); //super() must be in the first line in the constructor body //super can be used with parameters
        System.out.println(year);
    }




}
