package day24_practicesession_arraysinheritancepolymorphism;

import day24_practicesession_arraysinheritancepolymorphism.Q04_Animal;

public class Q04_Dog extends Q04_Animal {

    public void bark(){

        System.out.println("Dogs bark...");
    }

    @Override
    public void eat() {

        System.out.println("Dogs eat many things...");
    }
}
