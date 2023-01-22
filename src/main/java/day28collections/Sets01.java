package day28collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets01 {

    /*
        1)Sets are storing multiple non-primitive data in the same data type
        2)Sets are for storing unique data like email addresses, SSN, Phone Numbers in a country, ...
        3)There are 3 different Sets:   i)HashSet : Uses "Hashing Technique".(creating unique addresses)
                                                    (the fastest data structure among the sets)
                                                    It does not put the elements in any order.
                                                    HashSet accepts just a single "null" as element
                                        ii)LinkedHashSet : Puts the elements in "Insertion Order"
                                        iii)TreeSet: Puts the elements in "Natural Order"(Ascending Order in numbers, Alphabetical Order in Strings)
                                            TreeSet is so slow in adding elements

         Interview Question : If you need to store "unique elements" in "natural order"(ascending order), which collection do you use?
                             Answer : TreeSet
         Question           : As you know, TreeSet is so slow in adding elements, how can you improve your code?
                             Answer:  i) I create HashSet
                                     ii) and I add elements into the HashSet,
                                     iii) and then I convert HashSet into TreeSet

        Note: HashSets are data structure.
        Note: .size();-->returns the number of elements of the set
        Note: .clear();-->Delete all elements in set
        Note: If you want to add an element back to the HashSet, the old one is deleted and the new one is overwritten.
     */

    public static void main(String[] args) {

        //HashSet:

        HashSet<String> emails = new HashSet<>(); //empty
        System.out.println(emails);// [] ==>empty (for collections Java use [] )

        emails.add("Apple") ;  //In LinkedLists, there were many add() methods because LinkedLists were focussing on add() method
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        emails.add("Mango");//If you try to add repeated data, Java does not give any error, and  last data will be overwritten to the previous data
        emails.add(null);
        emails.add(null); // If you try to add one more null, Java will allow to use one.

        System.out.println(emails); // If you use many elements, the order can be different in everyone because there is no rule to order the elements.
                                    // It is a random order.
                                    // [Apple, Fig, Mango, Apricot, Orange]
                                    //[null, Apple, Fig, Mango, Apricot, Orange]

        emails.remove("Fig");
        System.out.println(emails); // [Apple, Mango, Apricot, Orange]

//        emails.clear(); // delete all elements from the HashSet
//        System.out.println(emails); // []

        //When you use clone(0) method, you can make data type "Object"
        Object emails2 = emails.clone(); //if you want to get same HashSet in different container we use clone() method
        System.out.println(emails2);// [null, Mango, Apricot, Apple, Orange]

        //2. option ==> (better)
        HashSet<String> emails3 = (HashSet<String>) emails.clone(); //TypeCasting ==> explicit narrowing
                                                                    // HashSet is the child of the object class
        System.out.println(emails3);//[null, Mango, Apricot, Apple, Orange]


        //LinkedHashSet:

        LinkedHashSet<Integer> ssn = new LinkedHashSet<>();

        ssn.add(123456789);
        ssn.add(234567891);
        ssn.add(345678912);
        ssn.add(456789123);
        ssn.add(null);// accept null only once



        System.out.println(ssn);//[123456789, 234567891, 345678912, 456789123]
                                //HashSet is faster than LinkedHashSet because it will take time to put elements into insertion order


        //TreeSet:

        //1. Way: Slower
//        TreeSet<Integer> nums = new TreeSet<>();
//
//        Long starting = LocalTime.now().toNanoOfDay();
//
//        nums.add(23);
//        nums.add(5);
//        nums.add(17);
//        nums.add(67);
//        nums.add(41);
//        nums.add(-5);
//        System.out.println(nums);// [-5, 5, 17, 23, 41, 67] ==> Ascending order
//
//        Long middle = LocalTime.now().toNanoOfDay();
//
//        //2.Way: I will first create a HashSet
//        HashSet<Integer> nums2 = new HashSet<>();
//
//        nums2.add(23);
//        nums2.add(5);
//        nums2.add(17);
//        nums2.add(67);
//        nums2.add(41);
//        nums2.add(-5);
//        //System.out.println(nums2); // [17, 67, -5, 5, 23, 41] ==> Random order
//
//        TreeSet<Integer> perfectNums = new TreeSet<>(nums2);
//        System.out.println(perfectNums); // [-5, 5, 17, 23, 41, 67] ==> Ascending order
//
//        //Set<Integer> perfectNums = new TreeSet<>(nums2); //We can use the data type from the Set Parent Class
//
//        Long ending = LocalTime.now().toNanoOfDay(); //We check duration by using currentTimeMillis() method ==> System.currentTimeMillis();
//
//        System.out.println("1. Way: " + (middle-starting));
//        System.out.println("2. Way: " + (ending-middle));

        Long starting = LocalTime.now().toNanoOfDay();
        TreeSet<Integer> nums1 = new TreeSet<>();
        nums1.add(23);
        nums1.add(5);
        nums1.add(17);
        nums1.add(67);
        nums1.add(41);
        nums1.add(-5);
        //nums1.add(null);//TreeSet does not accept "null" as element ==> gives exception
        System.out.println(nums1);//[ -5, 5, 17, 23, 41, 67]

        Long middle = LocalTime.now().toNanoOfDay();

        //2.Way: Faster
        HashSet<Integer> nums2 = new HashSet<>();
        nums2.add(5);
        nums2.add(17);
        nums2.add(67);
        nums2.add(41);
        nums2.add(-5);

        Set<Integer> perfectNums = new TreeSet<>(nums2); //This constructor is  taking HashSet and converting it to TreeSet
        System.out.println(perfectNums);//[ -5, 5, 17, 23, 41, 67]

        Long ending = LocalTime.now().toNanoOfDay();

        System.out.println("1.Way: " + (middle-starting));
        System.out.println("2.Way: " + (ending-middle));





    }
}
