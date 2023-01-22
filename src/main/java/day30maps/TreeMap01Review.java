package day30maps;

import java.util.*;

public class TreeMap01Review {

    public static void main(String[] args) {

        TreeMap<String, Integer> countryPopulations = new TreeMap<>();

        countryPopulations.put("Turkey", 80000000);
        countryPopulations.put("Germany", 81000000);
        countryPopulations.put("Canada", 35000000);
        countryPopulations.put("USA", 400000000);
        System.out.println(countryPopulations);//{Canada=35000000, Germany=81000000, Turkey=80000000, USA=400000000}

        Map.Entry<String, Integer> abc = countryPopulations.ceilingEntry("Turkey");
        System.out.println(abc);//Turkey=80000000

        Map.Entry<String, Integer> abc1 = countryPopulations.ceilingEntry("H");
        System.out.println(abc1);//Turkey=80000000

        Map.Entry<String, Integer> abc2 = countryPopulations.ceilingEntry("s");
        System.out.println(abc2); //null (according to the Ascii  value after "s" there is no any element

        NavigableSet<String> abc3 =  countryPopulations.descendingKeySet();
        System.out.println(abc3);//[USA, Turkey, Germany, Canada]

        NavigableMap<String, Integer> abc4 =  countryPopulations.descendingMap();
        System.out.println(abc4);//{USA=400000000, Turkey=80000000, Germany=81000000, Canada=35000000}

        Map.Entry<String, Integer> abc5 = countryPopulations.floorEntry("Y");
        System.out.println(abc5);//USA=400000000

        Map.Entry<String, Integer> abc6 = countryPopulations.floorEntry("Germany");
        System.out.println(abc6);//Germany=81000000

        Map.Entry<String, Integer> abc7 = countryPopulations.lowerEntry("Y");
        System.out.println(abc7);//USA=400000000

        Map.Entry<String, Integer> abc8 = countryPopulations.lowerEntry("USA");
        System.out.println(abc8);//Turkey=80000000

        SortedMap<String, Integer> abc9 =  countryPopulations.subMap("Canada", "USA"); //second parameter is excluded
        System.out.println(abc9);

        SortedMap<String, Integer> abc10 = countryPopulations.subMap("Canada", true, "Turkey", false);
        System.out.println(abc10);//{Canada=35000000, Germany=81000000}


        SortedMap<String, Integer> abc11 = countryPopulations.tailMap("Germany");
        System.out.println(abc11);//{Germany=81000000, Turkey=80000000, USA=400000000}

        NavigableMap<String, Integer> abc12 =  countryPopulations.tailMap("Canada", true);
        System.out.println(abc12);//{Canada=35000000, Germany=81000000, Turkey=80000000, USA=400000000}


//        countryPopulations.put(null, 35000000);  //NullPointerException:TreeMap does not accept "null" key, but accept "null" values
//        System.out.println(countryPopulations);




    }
}
