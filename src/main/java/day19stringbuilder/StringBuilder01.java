package day19stringbuilder;

public class StringBuilder01 {

    public static void main(String[] args) {

        //What is "StringBuilder Class"?
        //"StringBuilder Class" is for creating "Mutable Strings" (changeable)

        //We use "String Class" create a String, why or when we will  need "StringBuilder Class"?
        //String class is "immutable",  "StringBuilder Class" is mutable.
        //String class is "immutable", because of that it does not change existing value.
        //If you want to assign a new value to a variable, Java will create a new container inside the "String Pool"
        //(  String Pool contains all Strings)
        // then will put new value in it, then changes the address pointer to the new container.

        String name = "Tom";
        name = "Mark";//Java will not change the value, Java will create another container in the String Pool for the new value
                      //immutable means existing value will not change

        //If any container does not have any address pointer "Garbage Collector" throws/removes the container
        //from the memory. Before removing things from memory, Java "finalize" them, without finalizing, Java
        //does not remove anything from memory.

        //If we create two String variables with the same value: To save memory Java will put these 2 values into the same container
        String s = "Jhon";//Java first will create a new container and named it "s" and put the address in stack memory and create an address pointer.
        String r = "Jhon";//Java does not create a new container, put the new value in the existing container, and named it "r" and then create another address pointer

        r = "Sam";// If we change the value, because of immutability Java will create a new container and put the address pointer into the new container.

        //I want a separate container whose value is "Jhon"
        String u = new String("Jhon");

        //Other benefit of immutability is "security" ==> If the class is mutable the original value will change and the method will be executed for the new  value


        //If you want to change the value directly, without creating new container in memory we can use "StringBuilder Class"

        StringBuilder sb = new StringBuilder("Clara");
        sb = new StringBuilder("Jim");//Java will not create a new container and will not change the pointer into the new container

        //We cannot put String data into the StringBuilder container. It must be StringBuilder data type.

        //How to create a string builder Object
        //1.Way:
        StringBuilder sb1 = new StringBuilder("Clara");//creating StringBuilder with value
        System.out.println(sb1);//Clara

        //2.Way:
        StringBuilder sb2 = new StringBuilder();//creating StringBuilder without any  value,"Empty StringBuilder"
        System.out.println(sb2);//Empty

        //append() method: append() method can be used repeatedly, so we can assign more than one value

        sb2.append("Clara"); //append() is adding for new value
                             //Before using append() we will see "nothing" on the console ==> Empty
        System.out.println(sb2);//Clara

        sb2.append("Ocean");
        System.out.println(sb2);//ClaraOcean

        sb2.append("Miami").append("FL").append("USA");
        System.out.println(sb2);//ClaraOceanMiamiFLUSA

        //How to learn the capacity in a StringBuilder
        StringBuilder sb3 = new StringBuilder();//When you create an empty StringBuilder we will have 16 empty boxes, so the capacity of sb3 is 16

        sb3.append("Jackson");
        sb3.append("Mexico");
        sb3.append("The USA");//When we add values into the StringBuilder and if the length is more than 16,
                              // Java will add "2 * existing capacity (16) + 2" more empty boxes as capacity ==> 34
        sb3.append("....................");

        int numOfChars = sb3.length();//to get number of characters
        System.out.println(numOfChars);//40

        int cap = sb3.capacity();//In String class there is no capacity() method // we use capacity() to get number of the boxes available
        System.out.println(cap);//70

        //If you exceed the existing capacity Java will increase the capacity
        // like; 2*Existing Capacity + 2







    }
}
