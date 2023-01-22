package day19stringbuilder;

public class StringBuffer01 {

    public static void main(String[] args) {

        /*
        StringBuffer is another class to create Strings in Java
        StringBuffer is very similar with StringBuilder Class, both are mutable

        What is the difference between StringBuffer and StringBuilder?
         1)StringBuffer was created (at the beginning of Java creation) before StringBuilder in Java
         2)StringBuffer is multi-thread. But StringBuilder is not.
         (In Java thread means task. Doing 2 tasks simultaneously means multi-thread.)
         (If you want to use single object you have to create StringBuffer)
         3)StringBuffer is using "multi-thread" characteristic because of that it is slower than StringBuilder

          Scenarios:
            1)I need immutable String ==> String Class
            2)I need mutable and not multi-thread ==> StringBuilder
            3)I need mutable and multi-thread == > StringBuffer

            When you use multi-thread you need to create an order for the threads, this called "synchronization"
         */


    }
}
