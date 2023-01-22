package selfpractices.selfpractice_maps;

import java.util.*;

public class Q06 {

    public static void main(String[] args) {

        // Q06: Find the all distinct letters in string
        System.out.println("===Q06===");
        String queen ="We are the champions, my friends, And we'll keep on fighting till the end";

        String [] chars = queen.toLowerCase().
                replaceAll("\\p{Punct}", "").
                replaceAll("\\s", "").
                split("");

        System.out.println(Arrays.toString(chars));

        HashMap<String, Integer> myMap = new HashMap<>();

        for(String w : chars){

            Integer numOfOcc = myMap.get(w);

            if(numOfOcc==null){
                myMap.put(w,1);
            }else{
                myMap.put(w, numOfOcc +1);
            }
        }
        System.out.println(myMap);

        Set<String> findLetters = myMap.keySet();
        System.out.println(findLetters);

        System.out.println("===Q07===");

        //Q07: sort the letters in descending order

        TreeMap<String, Integer> treeMap = new TreeMap<>(myMap);
        Collection<String> listOfKeys = treeMap.keySet();
        List<String> list = new ArrayList<>(listOfKeys);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        System.out.println("===Q08===");

        //Q08: Find entry which has the maximum value

        Integer max = treeMap.values().stream().reduce(Integer.MIN_VALUE, Math::max);
        System.out.println(max);


        System.out.println("===Q09===");

       //Q09: Change all value to uppercase in the given HashMap

        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "java");
        languages.put(2, "javascript");
        languages.put(3, "python");
        System.out.println(languages);

        //System.out.println(languages.values().toString().toUpperCase());

        for (Integer a : languages.keySet()) {

            for (String w : languages.values()) {
                languages.replace(a,w,w.toUpperCase());
            }
        }
        System.out.println(languages);


    }




}
