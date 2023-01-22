package selfpractices.selfpractice_mixedtopics;

public class Lamp {

    boolean isOn;

    void turnOn(){

        isOn = true;            //true if light is on
        System.out.println("light is on? " + isOn);
    }

    void turnOff(){

        isOn = false;           //false if light is off
        System.out.println("Light is on? " + isOn);
    }

    public static void main(String[] args) {            //we  created objects inside the same class.

        Lamp natrium = new Lamp();
        natrium.turnOff();
    }
}


class Main {            // we can also create objects inside another class and accessed the members from that class.

    public static void main(String[] args) {

        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        led.turnOn();           // calling method turnOn()
        halogen.turnOff();      // calling method turnOff()
    }
}
