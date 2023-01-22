package day24_practicesession_arraysinheritancepolymorphism;

import day24_practicesession_arraysinheritancepolymorphism.Q04_Bird;
import day24_practicesession_arraysinheritancepolymorphism.Q04_Cat;
import day24_practicesession_arraysinheritancepolymorphism.Q04_Creatures;
import day24_practicesession_arraysinheritancepolymorphism.Q04_Dog;

public class Q04_RunnerClass {

    public static void main(String[] args) {

        Q04_Cat cat = new Q04_Cat();

        cat.meow();//Cats meow...
        cat.eat();//Animals eat...
        cat.consume();//Cats eat meat...

        Q04_Dog doggy = new Q04_Dog();

        doggy.eat();//Dogs eat many things...

        Q04_Bird birdy = new Q04_Bird();

        birdy.tweet();//Birds tweet...
        birdy.weight();//Birds are very light animals...

        Q04_Creatures bird1 = new Q04_Bird();
        Q04_Creatures bird2 = new Q04_Bird();












    }
}
