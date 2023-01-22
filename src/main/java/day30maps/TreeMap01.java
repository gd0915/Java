package day30maps;

import java.util.*;

public class TreeMap01 {

    /*
    1)TreeMap puts the entries in "Natural Order" according to the "Keys"
    2)TreeMap is the slowest Map
    3)TreeMap is not "thread-safe" and not "synchronized"

    Note:In HashTable and TreeMaps we cannot use "null"
     */

    public static void main(String[] args) {

        TreeMap<String, Integer> countryPopulations = new TreeMap<>();

        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 85000000);
        countryPopulations.put("Turkey", 81000000);
        countryPopulations.put("Afghanistan", 30000000);
        System.out.println(countryPopulations); //{Afghanistan=30000000, Germany=85000000, Turkey=81000000, USA=400000000}

        //ceilingEntry() : Returns the next element (Ceiling means next element)(Java will put the entries in Natural Order(alphabetic in String) and gives the next element
        //If the "Key" inside the ceilingEntry() method parenthesis is the same with any key inside the treeMap, you will get the entry itself
        Map.Entry<String,Integer> abc = countryPopulations.ceilingEntry("Turkey");
        System.out.println(abc);//Turkey=81000000

        //If the "Key" inside the ceilingEntry() method parenthesis is before any key, it returns the next entry
        Map.Entry<String,Integer> abcd = countryPopulations.ceilingEntry("T");
        System.out.println(abcd);//Turkey=81000000
        //Note: If I add ("s") lowercase, its Ascii value greater than upper cases, so it will come after the upper cases

        System.out.println(countryPopulations.ceilingKey("B")); //Germany (It gives only the next Key)

        NavigableSet<String> keysInDescendingOrder =  countryPopulations.descendingKeySet();
        System.out.println(keysInDescendingOrder); //[USA, Turkey, Germany, Afghanistan]

        NavigableMap<String, Integer> mapInDescendingOrder = countryPopulations.descendingMap();
        System.out.println(mapInDescendingOrder); //{USA=400000000, Turkey=81000000, Germany=85000000, Afghanistan=30000000}

//        Map.Entry<String, Integer> def =  countryPopulations.floorEntry("S");
//        System.out.println(def);//Germany=85000000
//
//        Map.Entry<String, Integer> ghi = countryPopulations.lowerEntry("S");
//        System.out.println(ghi);//Germany=85000000

        Map.Entry<String, Integer> def =  countryPopulations.floorEntry("Germany");
        System.out.println(def);//Germany=85000000
        System.out.println(countryPopulations.floorKey("S"));//It gives just the previous Key if the key does not exist

        //lowerEntry() method gives the previous entry under every condition
        //floorEntry() method gives the same entry for the existing keys
        //lowerEntry() method is like "<"
        //floorEntry() method is like "<="
        Map.Entry<String, Integer> ghi = countryPopulations.lowerEntry("Germany");
        System.out.println(ghi);//Afghanistan=30000000

        SortedMap<String,Integer> subMap1 = countryPopulations.subMap("Afghanistan", "Turkey");// second parameter is excluded ==> return the part of the Map
        System.out.println(subMap1);//{Afghanistan=30000000, Germany=85000000}

        //It is possible to set which part will be excluded and which part will be included by typing true(included) and false(excluded) as parameter
        NavigableMap<String , Integer> subMap2 = countryPopulations.subMap("Afghanistan", false, "Turkey", true );
        System.out.println(subMap2);//{Afghanistan=30000000, Germany=85000000}

        //tailMap() method with just "key" parameter will give the entries starting from the parameter(included)
        SortedMap<String, Integer> tailMap1 = countryPopulations.tailMap("Turkey");
        System.out.println(tailMap1);//{Turkey=81000000, USA=400000000}

        //tailMap() method with "key + boolean" parameter, will give the entries starting from the parameter,
        // but in this method we will set if the parameter we typed will be included or excluded by typing true or false
        NavigableMap<String, Integer> tailMap2 =  countryPopulations.tailMap("Turkey", false); //parameter will be  excluded
        System.out.println(tailMap2);//{USA=400000000}










    }
}
