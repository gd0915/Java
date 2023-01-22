package questions;

public class Q68 {

    /*
        There is a lonely monkey in the island
        He needs to eat 4 bananas every day
        there are just 165 bananas in that island
        Create following variables and find how many days
        monkey can survive.
        Use do while loop, increment and decrement and if statements
        int numberOfBananas =165, survivalDays = 1;
        boolean monkeyAlive = true;
*/

    public static void main(String[] args) {

        int numberOfBananas =165, survivalDays = 0;
        boolean monkeyAlive = true;

        do{
           if(numberOfBananas>3){
               survivalDays++;
               numberOfBananas -= 4;
           }else{
               monkeyAlive = false;
               break;
           }

        }while(monkeyAlive);
        System.out.println(survivalDays);



    }
}
