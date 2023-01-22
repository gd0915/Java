package selfpractices.selfpractice_lists;

import java.util.LinkedList;
import java.util.ListIterator;

public class List04 {

    /*

        LinkedList<Integer> l1 = new LinkedList <> ();
        LinkedList<Integer> l2 = new LinkedList <> ();

        a-5 ve 7'yi eleman olarak ekleyin.
        b-listeyi ekrana yazdirin.
        c-ardindan listeyi bu hale getirelim-->[10, 5, 7,6]
        d-listenin basina 3 ekleyelim
        e-listenin 2 index nolu elemanini remove edelim.
        f-listenin 1 index nolu elemaninin degerini 11 yapalim.
        g-listenin 2 index nolu elemanini ekrana yazdiralim
        h-yeni bir liste olsuturalim adi l2 olsun ve l1 listesindeki tum elemanlari l2 listesine ekleyelim ve ekrana yazdiralim.
        i-l1 listesinin son halini [3,11,3,11,7,6,7,6] haline getirelim.
        j-l1 listesinin elemanlari toplamini bulalim.
        k)l1'i en son su hale getirelim-->//[6,6] ve ekrana yazdrialim
        */

    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList <> ();
        l1.add(5);
        l1.add(7);
        System.out.println(l1);
        l1.add(0, 10);
        l1.addLast(6);
        System.out.println(l1);
        l1.addFirst(3);
        System.out.println(l1);
        l1.remove(2);
        System.out.println(l1);
        l1.set(1, 11);
        System.out.println(l1);
        System.out.println(l1.get(2));

        LinkedList<Integer> l2 = new LinkedList <> ();
        l2.addAll(l1);
        System.out.println(l2);
        l1.addFirst(l1.get(1));
        System.out.println(l1);
        l1.addFirst(l1.get(1));
        System.out.println(l1);
        l1.addLast(l1.get(l1.size()-2));
        l1.addLast(l1.get(l1.size()-2));
        System.out.println(l1);

        int sum=0;
        for(Integer w : l1){

            sum += w;
        }
        System.out.println(sum);

        ListIterator<Integer> itr = l1.listIterator();

        while(itr.hasNext()){

            Integer el = itr.next();
            if(el!=6){
                itr.remove();

            }
        }
        System.out.println(l1);



    }







}
