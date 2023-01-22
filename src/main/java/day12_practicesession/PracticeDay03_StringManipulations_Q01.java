package day12_practicesession;

public class PracticeDay03_StringManipulations_Q01 {

    public static void main(String[] args) {

        //Example 1:
        //Type code to reverse a String.
            //Tom Hanks ==> sknaH moT

        String name = "Tommy";
        String reversedName = "";

        for(int i = name.length()-1; i>-1; i--){
            String ch= name.substring(i,i+1);
            reversedName = reversedName + ch;
        }
        System.out.println(reversedName);

        System.out.println();

        //Example 2:
        //Get the initial from full name (Middle name is out of scope )
        //Tom Hanks==> TH

        String name2 = "          Tom Hanks       ";

        String initialOfFirstName= name2.trim().substring(0,1).toUpperCase();
        System.out.println("The initial of the first name is " + initialOfFirstName);
        String initialOfLastName= name2.trim().split(" ")[1].substring(0,1).toUpperCase();
        System.out.println("The initial of the last name is " + initialOfLastName);

        System.out.println(initialOfFirstName + initialOfLastName);









    }
}
