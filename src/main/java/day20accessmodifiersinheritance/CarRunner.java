package day20accessmodifiersinheritance;

public class CarRunner {

    public static void main(String[] args) {

        //Create Civic object and see which method can be used
        Civic c = new Civic();
        c.ecoEngine();
        c.hondaMake();
        c.engine();

        //Create Accord object and see which method can be used
        Accord a = new Accord();
        a.sportDesign();
        a.hondaMake();
        a.engine();

        //Create Honda object and see which method can be used
        Honda h = new Honda();
        h.hondaMake();
        h.engine();

        //Create Car object and see which method can be used
        Car r = new Car();
        r.engine();



    }
}
