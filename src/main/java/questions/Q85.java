package questions;

import java.util.LinkedList;

public class Q85 {

    public static void main(String[] args) {

        //Q02: If the number of characters is more than 4 and starts with "M", remove them from the LinkedList
        //Interview Question


        LinkedList<String> name = new LinkedList<>();
        name.add("Tom");
        name.add("Jane");
        name.add("Mary");
        name.add("Madonna");
        name.add("Terje");
        name.add("Emily");
        name.add("Marianne");
        name.add("Einar");
        name.add("Mila");

        printCharacters(name);

    }

    public static void printCharacters(LinkedList<String> list){

        list.removeIf(t-> t.length()>5. && t.startsWith("M"));
        System.out.println(list);

    }


}
