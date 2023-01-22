package day30maps;

import java.util.Hashtable;

public class HashTable01Review {

    public static void main(String[] args) {

        Hashtable<String, Candidates> candidates = new Hashtable();

        candidates.put("Ayse", new Candidates(19, "aa@gmail.com"));
        candidates.put("Ali", new Candidates(20, "bb@gmail.com"));

        System.out.println(candidates);
        System.out.println(candidates.size());
        System.out.println(candidates.get("Ayse"));
        System.out.println(candidates.keySet());
        System.out.println(candidates.values());
        System.out.println(candidates.get("Ayse").age);
        System.out.println(candidates.get("Ali").email);
        candidates.replace("Ayse", new Candidates(25, "ma@gmail.com"));
        System.out.println(candidates);

        System.out.println(candidates.containsKey("Ayse"));
        System.out.println(candidates.containsValue(19));

    }
}
