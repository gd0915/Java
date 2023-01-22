package day24interfaces;

public class CarRunner {

    public static void main(String[] args) {

        Honda h = new Honda();

        System.out.println(Ac.price);//Use interface name to access to the variable such as  static variables

        System.out.println(Brake.price);

        System.out.println(Engine.price);

        System.out.println(Brake.luxury);

        Honda h1 = new Honda();
        System.out.println(h.calculate());//1200

        System.out.println(Ac.climate()); //true

    }
}
