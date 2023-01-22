package recap01;

public class Questions_Test_Collections {


     /*
     Q01) What do you know about "Collections"?

     Collections have 3 interfaces==> 1-Lists==>a-Array lists and b-Linked lists
                                               //LinkedLists have 3 parent classes : List, Queue and Deque
                                     2-Queues===>a- Priority queue (concrete) b-Deque (interface)
                                     3-Sets=>a- HashSet (concrete class)
                                             b- LinkedHashSet (concrete class)
                                             c- Sorted Set/interface
                                             d- TreeSet (concrete class under Sorted Set/interface)

      Q02) When do we use Linked List and ArrayList? Why?
      Structurel Difference: Arrays use indexes. LinkedList do not use indexes. They use pointers.
      Functional Difference:
      i)  ArrayList is successful in "search" operation
          Put elements in insertion order
      ii) LinkedList is successful in "adding" and "removing" operations
          Put elements in insertion order
          Because of that, if we need to keep elements for a long time , in the other words if we do not need to change
          elements in a short period of time(states names in the USA), the best option to use is ArrayList. But for example for a visitors in a museum
          we do not need to keep the elements for a long time, we just add and remove them, so the best option is LinkedList.

      Q03) When do we use HashSet and LinkedHashSet? Why?
           When to use which one?
           When we need to use Set we should use one according to the data structure
           If I want to store unique data in insertion order ==> LinkedHashSet is the best option
           If I want to store unique data in random order ==> HashSet

      Q04) Interview Question : If you need to store "unique elements" in "natural order"(ascending order), which collection do you use?
                             Answer : TreeSet
           Question           : As you know, TreeSet is so slow in adding elements, how can you improve your code?
                             Answer:  i) I create HashSet
                                     ii) and I add elements into the HashSet,
                                     iii) and then I convert HashSet into TreeSet

     */

}
