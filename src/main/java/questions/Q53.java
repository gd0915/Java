package questions;

import java.util.*;

public class Q53 {

    // Create a hashSet with this integer values {25,62, 49, 87} and
    // then print the value of each element to the screen by increasing it by 3. -->{28,65,52,90}

    public static void main(String[] args) {

        //1.Way:
        List<Integer> hs = new ArrayList<>();
        hs.add(25);
        hs.add(62);
        hs.add(49);
        hs.add(87);

        TreeSet<Integer> h = new TreeSet<>();

        ListIterator<Integer> a = hs.listIterator();
        while (a.hasNext()){
            int i = a.next();
            i+=3;
            h.add(i);
        }
        System.out.println(h);

        //2.Way
        HashSet<Integer> increasingInteger=new HashSet<>();
        increasingInteger.add(25);
        increasingInteger.add(62);
        increasingInteger.add(49);
        increasingInteger.add(87);

        Iterator<Integer> newList=increasingInteger.iterator();

        TreeSet<Integer> sorted=new TreeSet<>();
        System.out.println();

        while (newList.hasNext()){
            sorted.add(newList.next()+3);

        }
        System.out.println("==>"+sorted);


        //3.Way
        HashSet<Integer> Numbers = new HashSet<Integer>();

        Numbers.add(25);
        Numbers.add(62);
        Numbers.add(49);
        Numbers.add(87);

        int arry [] = new int[Numbers.size()];

        Iterator<Integer> itr = Numbers.iterator();

        int mm=0;

        while(itr.hasNext()) {

            arry[mm] =itr.next()+3;
            mm++;

        }

        Arrays.sort(arry);
        System.out.println(Arrays.toString(arry));






    }
}
