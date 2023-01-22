package day24interfaces;

    /*
    1)An interface cannot have "concrete method"
    2)All methods in an interface are "public" and "abstract" as default
      Because of that, even you do not declare the methods public and abstract they will be public and abstract
      public abstract void digital(); and void digital(); are same
    3) If parent interfaces have method with the same name overriding just one of them will be enough.
      Note: If you have same method in parent interfaces you can override just one of them, that  method can calculate/do action for all the interfaces
    4)"parent interfaces" cannot have methods with the same name and the different return types.
      If you do that, Java will give you compile time error
    5)Variables in an interface are "public", "static", and "final"
    "public static final int price = 2300";  and  "int price = 2300;"
    Note: In variables Java will not confuse if I assign different value to the variable in each interface
    6)Variables in interface are "static" default, therefore no need to create object to access variables in interfaces
    7)Whenever you need to call any variable use "InterfaceName" to call
    8)All method normally abstract in an interface, but by using some keywords it is possible to create concrete method in an interface
      i) "Default keyword", ii)"static keyword"
    9)By using "extends" we can do an interface the child of another interface

      "Interface" parent of another "Interface" ==> extends
      "Class" parent of another "Class" ==> extends

      "Interface" parent of "Class" ==> implements
      "Class" parent of "Interface" ==> impossible. ==> An "Interface" can have "just" Interface as parent
     */

public interface Ac extends  BigAc {

    void digital();

    void price();

    public int price = 2300;

    String name = "Perfect AC";

    // To create concrete method in an interface you have 2 options
    // i) Use "default" keyword           ii) Use "static" keyword

    //Use "default" keyword
    public default int calculate(){ // calculate method concrete method because it has body
        return 1200;                //default methods are non-static
    }

    //Use "static" keyword
    public static boolean climate(){   //climate method concrete method because it has body
        return true;                   //static method ==> no need to create an object
    }





}

