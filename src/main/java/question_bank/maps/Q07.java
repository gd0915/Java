package question_bank.maps;

import java.util.Map;
import java.util.TreeMap;

public class Q07 {

    public static void main(String[] args) {

        TreeMap<String, Double> salaries = new TreeMap<>();
        salaries.put("Tom Hanks", 3000.00);
        salaries.put("Mary Star", 1000.00);
        salaries.put("Jimmy Jones", 5000.00);
        salaries.put("Kevin Bridgeman", 6000.00);


        Map.Entry<String, Double> map5 = salaries.lowerEntry("Paris Hilton");
        System.out.println(map5);//Mary Star=1000.0

        Map.Entry<String, Double> map6 = salaries.higherEntry("Paris Hilton");
        System.out.println(map6);//Tom Hanks=3000.0

        Map.Entry<String, Double> map7 = salaries.higherEntry("Tom Hanks");
        System.out.println(map7);//null
    }
}
