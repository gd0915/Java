package day24_practicesession_arraysinheritancepolymorphism;

import day24_practicesession_arraysinheritancepolymorphism.Q04_Animal;

public class Q04_Bird extends Q04_Animal {

    public void tweet(){

        System.out.println("Birds tweet...");
    }

    @Override
    public void weight() {
        System.out.println("Birds are very light animals...");
    }


}
