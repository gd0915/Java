package day24interfaces;

public class Honda implements Ac, Brake, Engine {

    @Override
    public void secureBreak() {
        System.out.println("It stops securely");
    }

    @Override
    public void ecoEngine() {
        System.out.println("This is eco engine");
    }

    @Override
    public void price() {
        System.out.println("Brake price");
    }

    @Override
    public void digital() {
        System.out.println("This is digital AC");



    }
}
