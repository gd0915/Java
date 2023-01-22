package selfpractices.selfpractice_collections;

import java.sql.SQLOutput;
import java.util.*;

public class Questions {

    public static void main(String[] args) {
        //ArrayList
        //Q01) Write a Java program to swap two elements ( Red ==> Black)  in an ArrayList.

        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        Collections.swap(c1, 0, 2);
        System.out.println("After swapping: " + c1);//After swapping: [Black, Green, Red, White, Pink]
        System.out.println();

        //Q02) Write a Java program to join 2 ArrayLists(c1 and c2).

        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        ArrayList<String> c3 = new ArrayList<>();
        c3.addAll(c1);
        c3.addAll(c2);
        System.out.println(c3);//[Black, Green, Red, White, Pink, Red, Green, Black, Pink]
        System.out.println();


        //Q03) Write a Java program to copy/clone an ArrayList to another ArrayList.(clone c1)

        ArrayList<String> clone = (ArrayList<String>)c1.clone();
        System.out.println(clone);//[Black, Green, Red, White, Pink]

        //Q04) Write a Java program to empty an array list. (c1)

        c1.removeAll(c1);
        System.out.println(c1);//[]

        //Q05) Write a Java program to extract first 3 elements of an ArrayList and the result will be a list again.
        //Original list: [Red, Green, Orange, White, Black] ==> List of the first three elements: [Red, Green, Orange]

        List<String> list1 = new ArrayList<String>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Orange");
        list1.add("White");
        list1.add("Black");
        System.out.println("Original list: " + list1);

        List<String> sub_List = list1.subList(0, 3);
        System.out.println("List of the first three elements: " + sub_List);//List of the first three elements: [Red, Green, Orange]

        //LinkedList

        //Q06) Write a Java program to iterate a LinkedList in reverse order.

        LinkedList<String> list2 = new LinkedList<String>();
        // use add() method to add values in the linked list
        list2.add("Red");
        list2.add("Green");
        list2.add("Black");
        list2.add("Pink");
        list2.add("Orange");

        Iterator itr = list2.descendingIterator();

        while(itr.hasNext()){
            System.out.print(itr.next() + " ");     //Orange Pink Black Green Red
        }

        //Q07) Write a Java program to remove and return the first element of a linked list. First print the removed element and
        //then the updated list. (use list2)
        System.out.println();
        System.out.println(list2.pop());//Red
        System.out.println(list2);//[Green, Black, Pink, Orange]

        //Q08) Write a Java program to retrieve but does not remove, the last element of a linked list.
        String lastEl = list2.peekLast();
        System.out.println(lastEl);//Orange
        System.out.println(list2.getLast());//Orange

        //Q9) delete the middle element in a given String
        // input : [2, 3, 4, 5, 6] ==> output: [2, 3, 5, 6]
        //input : [2, 3, 4, 5, 6, 7] ==> output: [2, 3, 4, 5, 6]

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);


        if (l1.size() % 2 != 0) {

            l1.remove(l1.get(l1.size() / 2));
        } else {
            l1.remove(l1.get(l1.size() / 2));
            l1.remove(l1.get(l1.size() / 2));
        }
        System.out.println(l1);

        //SETS

        //Q10)Type the code that shows how many different elements there are in a list, and print those elements.
        LinkedList<Integer> l3 = new LinkedList<>();
        l3.add(2);
        l3.add(3);
        l3.add(4);
        l3.add(5);
        l3.add(6);
        l3.add(7);
        l3.add(4);
        l3.add(3);
        l3.add(2);

        HashSet<Integer> hs = new HashSet<>(l3);
        System.out.println(hs.size());//6
        System.out.println(hs);

        //Q11) Type a program to convert a HashSet to an Array

        HashSet<String> h_set = new HashSet<String>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");

        System.out.println("Original Hash Set: " + h_set);

        // Creating an Array
        String[] brr = new String[h_set.size()];

        // Displaying Array elements
        System.out.println("Array elements: ");
        for(String element : brr) {
            System.out.println(element);
        }

        //Q12) Remove duplicated element from the given array and create an array that have only those unique elements
        //int arr[]= {1,2,3,4,4,5,7,3,4}; ==> { 1,2,3,4,5,7}

        int ar []= {1,2,3,4,4,5,7,3,4};

        Set<Integer> set1= new HashSet<>();

        for (Integer w : ar) {
            set1.add(w);
        }
        System.out.println(set1);//[1, 2, 3, 4, 5, 7]

        int newArray [] = new int[set1.size()];

        int idx = 0;
        for(Integer w : set1){
            newArray[idx]=w;
            idx++;
        }
        System.out.println(Arrays.toString(newArray));//[1, 2, 3, 4, 5, 7]

        //Q13) What is the output of the following?

        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(8);
        queue.add(10);
        queue.add(12);
        queue.add(21);
        queue.add(36);

        int count = 0;

        while (queue.isEmpty() == false) {
            queue.remove();
            count++;
            if(count == 3) {
                break;
            }
        }
        System.out.println(queue);//?

        while (queue.isEmpty() == false) {
            queue.remove();
            if(count == 3) {
                break;
            }
            count++;
        }
        System.out.println(queue);//?


        //Q14) What is the output of the following?

        TreeSet<String> tSet = new TreeSet<>();
        tSet.add("Java");
        tSet.add("my love!");
        tSet.add("Java");
        tSet.add("is");

        for (String w : tSet){
        System.out.print(w + " ");
        }

        //Q15) Create an Array List. Add the following as an element. ==> "Computer", "Science"
        // Create TreeSet and copy the list into the TreeSet and then add the followings as well. "Portal", "GFG"
        // Use Iterator to print the elements of the TreeSet and guess what the output is before printing.
        // And then print the elements of the TreeSet.

        ArrayList<String> ll = new ArrayList<String>();

        ll.add("Computer");
        ll.add("Science");

        // Creating TreeSet object of string type
        TreeSet<String> ts = new TreeSet(ll);

        // Adding elements to above TreeSet
        ts.add("Portal");
        ts.add("GFG");

        // Iterating via iterators
        Iterator<String> iter = ts.iterator();

        // Condition that holds true till
        // there is single element in th List
        while (iter.hasNext()) {

            // Printing all elements inside objects
            System.out.print(iter.next() + " "); //Computer GFG Portal Science
        }
        System.out.println();

        //Q16:
        // Write code to find the maximum and minimum in HashSet


        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(20);
        set.add(10);
        set.add(50);
        set.add(40);

        System.out.println("The maximum element is " + Collections.max(set));
        System.out.println("The minimum element is " + Collections.min(set));


        System.out.println();

        //Q17:convert this HashSet to an Array

            HashSet<String> hashSet = new HashSet<String>();

            hashSet.add("Welcome");
            hashSet.add("To");
            hashSet.add("Geeks");
            hashSet.add("For");
            hashSet.add("Geeks");

            Object arr1 [] = hashSet.toArray();
            System.out.println(Arrays.toString(arr1));

        //Q18: What is the size of set?

        HashSet<ArrayList> setS = new HashSet<>();


        ArrayList<Integer> li1 = new ArrayList<>();

        ArrayList<Integer> li2 = new ArrayList<>();
        ArrayList<Integer> li3 = new ArrayList<>();



        li1.add(1);
        li1.add(2);
        li1.add(3);

        li2.add(1);
        li2.add(2);

        li3.add(2);
        li3.add(1);

        setS.add(li1);
        setS.add(li2);
        setS.add(null);
        setS.add(li3);

        System.out.println();
        System.out.println("Result:" + setS.size());//4

        //Q19: Create an array list with these ages:10,12,15,16,19,23,34
        //  a)Write all ages which are less than 18 on the console
        //  b)Write all ages which are greater than 18 on the console

        ArrayList<Integer> l6 = new ArrayList<>();
        l6.add(10);
        l6.add(12);
        l6.add(15);
        l6.add(16);
        l6.add(19);
        l6.add(23);
        l6.add(34);

        //1.Way
        for(Integer w : l6){
            if(w<18){
                System.out.print(w + " ");
            }
        }
        System.out.println();

        for(Integer w : l6){
            if(w>18){
                System.out.print(w + " ");
            }
        }
        System.out.println();

        //2.Way:

        System.out.println(l6.subList(0, 4));
        System.out.println(l6.subList(4, l6.size()));

        /*Q20:
        Create a  HashSet1 which name is primeNumbers with this numbers:2,3,5,7,11,13,17
        Create a second HashSet2 which name is oddNumbers with these numbers:3,5,11,17,19,27
        Create a third   HashSet3 which name is numbers with these numbers:3,5,13

        a)Write common elements for HashSet1 and HashSet2 (Intersection) on the console
        b)Check if numbers is a subset of primeNumbers
        c)Find HashSet1's elements whose are different from HashSet2

         */

        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        primeNumbers.add(7);
        primeNumbers.add(11);
        primeNumbers.add(13);
        primeNumbers.add(17);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(3);
        oddNumbers.add(5);
        oddNumbers.add(11);
        oddNumbers.add(17);
        oddNumbers.add(19);
        oddNumbers.add(27);
        System.out.println("HashSet2: " + oddNumbers);

        //a) retainAll() :
        oddNumbers.retainAll(primeNumbers);
        System.out.println("The intersection of oddNumbers is : " + oddNumbers);//[17, 3, 5, 11]

        //b) containsAll() :

        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(13);

        System.out.println(primeNumbers.containsAll(numbers));//true

        //c) removeAll() :

        primeNumbers.removeAll(oddNumbers);
        System.out.println(primeNumbers);//[2, 7, 13]





    }
}
