package day19stringbuilder;

public class StringBuilder02 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Mississippi");

        //toString() method is used to change StringBuilders to Strings
        String test = sb1.toString();
        System.out.println(test);//Mississippi

        StringBuilder revSb1 = sb1.reverse();
        System.out.println(revSb1);//ippississiM

        // Reverse() is used to reverse a String.
        // If you get a question like "How to reverse a String" tell them;
        // i)I can reverse a String by using reverse() method from StringBuilder Class
        // ii)I can reverse a String by using loops
        // Interviewer will tell you use the loops

        //deleteCharAt() is used to delete a character at a specific index
        sb1.deleteCharAt(0);  //delete first Character ==> We converted the StringBuilder into the String at the beginning and
                                    // how can we use these methods
        System.out.println(sb1); // ppississiM


        //Note: When you use a method for StringBuilders, if it is "bold" and "not coming from String Class" it changes the original value
        //"Unbold Methods" comes from String Class, and they cannot change the original value
        //bold methods do not come String Class, and they change the original value

        // delete(starting index, ending index) is used to delete characters from "starting index" to "ending index"
        // "starting index" is inclusive, "ending index" is exclusive
        sb1.delete(2, 5); // delete(int start int end)
        System.out.println(sb1);//ppissiM

//        sb1.delete(0, sb1.length());//delete all characters
//        System.out.println(sb1);// empty line

        //replace((starting index, ending index, new value) is used to change characters from "starting index" to "ending index" to a new value
        //replace() method is used to update multiple characters
        sb1.replace(2,4,"IS");// to uppercase
        System.out.println(sb1);//ppISsiM


        //insert(number of characters from the beginning, new value) method will insert "new value" after skipping
        sb1.insert(3,"xxx"); //offset 3 means skip first 3 characters  put "xxx"
        System.out.println(sb1);//ppIxxxSsiM

        StringBuilder sb2 = new StringBuilder("Java is Love");
        StringBuilder sb3 = new StringBuilder("Java is Love");

        /*
        The value 0 if this StringBuilder contains the same character sequence as that of the argument StringBuilder;
        a negative integer if the first  StringBuilder is lexicographically less than the second
        StringBuilder argument;  a positive integer if this  StringBuilder
        is lexicographically greater than the StringBuilder argument.

        Note: compareTo() method does not ignore cases, it checks alphabetical order by using ASCII Values
         */
        int result = sb2.compareTo(sb3);// Java will compare first String with the second one, if they are on the same alphabetical order we will get "0"
        System.out.println(result);//0

        //setCharAt(index, new char value) is used to update a specific character in a specific index
        sb3.setCharAt(8, 'm');
        System.out.println(sb3);//Java is move

        /*
        1) Mechanism behind the "immutability"
        2) Benefits of "immutability"
        3) Difference between "immutability" and "mutability"
        4) Features of the StringBuilder
         */

        //Why did Java create StringBuilder? ==> Interview Question

    }
}
