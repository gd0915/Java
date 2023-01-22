package day29maps;

import java.util.*;

public class HashMap01 {

    public static void main(String[] args) {

        //Note: Hashing Technic: Java will create a unique values for every element

        /*
        1)Maps have key - value structure
        2)Key's are unique but Value's are not
        3)Every element in a Map is called as "Entry"
        4)All elements are called "EntrySet"
        5)Key cannot be null in maps except "HashMap", but value can be "null"

        6)HasMap put the entries in random order, because of that it is "super-fast"
        7)You may use any data type for keys and values (no restriction)
         */

        //How to create a HashMap
        HashMap<String, Integer> stdAges = new HashMap<>();

                //There is no restriction in terms of  data types inside <>, you may use any data type for keys and values

        //How to put entries into a HashMap
        stdAges.put("Ali Can", 13);
        stdAges.put("Tom Hanks", 46);
        stdAges.put("Brad Pitt", 55);
        stdAges.put("Angelina Julie", 48);

        System.out.println(stdAges);//{Tom Hanks=46, Brad Pitt=55, Angelina Julie=48, Ali Can=13}
                                    //HasMap does "random ordering"

        //How to get just "Key's" from a Map
        //We want to work sometimes just with keys(names)
        //keySet() ==>
        Set<String> keys = stdAges.keySet();
        System.out.println(keys); //[Tom Hanks, Brad Pitt, Angelina Julie, Ali Can]

        //How to get just "Value's" from a Map
        //Sometimes we want to work just with values(ages)
        //values() ==>
        Collection<Integer> ages = stdAges.values();  //Collection parent interface of List (ages are not unique, we will put them into Collection)
                                                      //Since the values are not unique, we cannot put hem into a set
                                                      //Sometimes values can create a List, then we can put the values into a List instead of Collection
        System.out.println(ages); //[46, 55, 48, 13]

        //Can I put null into key?
        // Yes, you can use null "just" in HashMap Key.
        stdAges.put(null, 23);
        System.out.println(stdAges);

        //Can I put null into value?
        stdAges.put("Ajda Pekkan", null);
        stdAges.put("Someone Unknown", null);
        System.out.println(stdAges);//{null=23, Tom Hanks=46, Brad Pitt=55, Someone Unknown=null, Angelina Julie=48, Ajda Pekkan=null, Ali Can=13}

        //What happens if you use same key repeatedly?
        //Java accept the final value for the key(overwriting)
        stdAges.put("Angelina Julie", 23);
        System.out.println(stdAges);//{null=23, Tom Hanks=46, Brad Pitt=55, Someone Unknown=null, Angelina Julie=23, Ajda Pekkan=null, Ali Can=13}

        //How to get value of a key?
        Integer  tomAge = stdAges.get("Tom Hanks");
        System.out.println(tomAge); //46

        //If the key does not exist when you use get() method what happens?
        //If the key does not exist in the map it returns null(for non-existing keys)
        Integer  unknownAge = stdAges.get("Abc Xyz");
        System.out.println(unknownAge); //null

        //getOrDefault() ==> returns the value of "Abc Xyz" if "Abc Xyz" exist among the keys
        //getOrDefault() ==> returns the value of second parameter if "Abc Xyz" does not exist among the keys
        Integer unknownAge2 = stdAges.getOrDefault("Abc Xyz", 0);
        System.out.println(unknownAge2); //0


        //I want to put an entry if it does not exist, if the entry exists I will not put it.
        stdAges.putIfAbsent("Brad Pitt", 44);
        System.out.println(stdAges); // Brad Pitt will not change
                                     //{null=23, Tom Hanks=46, Brad Pitt=55, Someone Unknown=null, Angelina Julie=23, Ajda Pekkan=null, Ali Can=13}

        stdAges.putIfAbsent("Cuneyt Arkin", 44);
        System.out.println(stdAges);// {null=23, Tom Hanks=46, Brad Pitt=55, Cuneyt Arkin=44, Someone Unknown=null, Angelina Julie=23, Ajda Pekkan=null, Ali Can=13}

        //How to update a value of a key
        stdAges.replace("Tom Hanks", 56);
        System.out.println(stdAges);// {null=23, Tom Hanks=56, Brad Pitt=55, Cuneyt Arkin=44, Someone Unknown=null, Angelina Julie=23, Ajda Pekkan=null, Ali Can=13}

        //How to update the value of a key after checking key and existing value ==> replace() ==> oldValue with the newValue
        stdAges.replace("Tom Hanks", 56, 66);
        System.out.println(stdAges);// {null=23, Tom Hanks=66, Brad Pitt=55, Cuneyt Arkin=44, Someone Unknown=null, Angelina Julie=23, Ajda Pekkan=null, Ali Can=13}

        //How to remove an entry from a map
        stdAges.remove("Someone Unknown");
        System.out.println(stdAges);//{null=23, Tom Hanks=66, Brad Pitt=55, Cuneyt Arkin=44, Angelina Julie=23, Ajda Pekkan=null, Ali Can=13}
        System.out.println(stdAges.remove("Mary"));// returns null if the key does not exist

        stdAges.remove("Ajda Pekkan", null); //If the value is not null Ajda Pekkan will not be removed
        System.out.println(stdAges);//{null=23, Tom Hanks=66, Brad Pitt=55, Cuneyt Arkin=44, Angelina Julie=23, Ali Can=13}


        //How to get entries one by one from a Map ==> entrySet()
        //Keys are unique ==> if something is unique Java will put it into a "Set" ==> because of that if we get entries we should put them into a "Set"
        Set<Map.Entry<String, Integer>> entries = stdAges.entrySet();

        for(Map.Entry<String, Integer > w : entries){

            System.out.println(w + "!");

        }

        //Note: for each loop can be used for all collections!




    }
}
