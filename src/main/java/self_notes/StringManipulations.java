package self_notes;

public class StringManipulations {


    public static void main(String[] args) {

        // 1. equals() method: Compares two Strings, returns "boolean".
        "Tom".equals("tom");  // ==> false

        // 2. equalsIgnoreCase() method: Compares two Strings by ignoring cases, returns "boolean".
        "Tom".equalsIgnoreCase("tom");  // ==> true

        // 3. toLowerCase() method: Converts all characters in a String to lower cases, returns "String".
        "AuGuSt".toLowerCase(); // ==> "august"

        // 4. toUpperCase() method: Converts all characters in a String to upper cases, returns "String".
        "AuGuSt".toUpperCase(); // ==> "AUGUST"

        // 5. charAt() method: Gives you 'a character' in the String by using index, returns "char".
        "Java is my love".charAt(6); // ==> 's'
        //  0123456

        // 6. length() method: Counts the characters in a String, returns "integer".
        // Note: For last character ==> lastChar=   .length()-1
        "Learn Java earn money".length(); // ==> 21
        //  12345678910...21

        // 7. replaceAll() method: Replaces if different characters all together (all the spaces, numeric values, alphabetical characters, symbols) in a String.
        String name = "        Tom12      Hanks!....      ";
        System.out.println(name.replaceAll("[^A-Za-z]", "")); // ==> TomHanks
        //                                   (remove "[^Other than]", put nothing "" instead of removed characters)
        //                                        alphabetical characters

        System.out.println(name.replaceAll("[^0-9]", "")); // ==> 12
        //                                   (remove "[^Other than]" , put nothing "" instead of removed characters)
        //                                          numeric characters

        // 8. replace() method: Replaces just one or two values in a String (just the letters, just the numbers)
        String shirtPrice = "$ 12.99";
        String shirt = shirtPrice.replace("$", "");  // ==> "12.99"
        //                                 (just remove "$", put nothing "" instead of dollar sign)

        // 9. valueOf() method: Converts "String to double" or "double to String".
        String bookPrice = "$ 35.99";
        String book = bookPrice.replace("$", ""); // ==> "35.99"

        double bd = Double.valueOf(book); // ==> 35.99 // It is possible to operate math operation with this numeric value now.

        /* 10. substring() method:
         substring(0, 1) gives you first character everytime (like charAt(0))
         substring(beginning index) gives you the characters from a specific index to the last index

         Ali Baba        str.substring(0,1); ==> A
         01234...        str.substring(4);   ==> Baba
         */

        String s = "I like Lion, Horse, laptop and Cat";
        //  index   01234567  11 13   18           31
        String lion = s.substring(7, 11); // Lion
        String horse = s.substring(13, 18); // Horse
        String cat = s.substring(31); // Cat

        // 11. split() method:

        String names = "Tom Hanks ";

        System.out.println(names.split(" ")[1]); // Hanks
        //                 split and print the name after 1.space
        System.out.println(names.split("o")[1]); // m Hanks
        //                 split and print the name after 1. "o"

        /* 12. indexOf() method: Gives you the index of first occurrence of a specific character (just focuses first character).

        Note 1: indexOf() method can be used with "char" and "String" data types
        str.indexOf('a') or s.indexOf("Java");

        Note 2: If you use String inside the indexOf(), it will return the index of the first character.
        s.indexOf("Java"); ==> "J"

        Note 3: indexOf() method returns "-1" for non-existing character
        s.indexOf('x')==-1   ==>  There is no 'x'
         */

        String str = "I want to learn Java";
        //      index 0123  (just focus first 'a')
        int idx = str.indexOf('a');
        System.out.println(idx + 1); //4
        //       order of the number= index+1


        // 13. lastIndexOf() method: index of first character of the last occurrence

        String r = "I like to study Java, learn Java, earn money, Java is easy.";
        // index    01234........................................46
        int f = r.lastIndexOf("Java"); // 46

        String m = "Hello";
        /*          01234
                     indexOf()           lastIndexOf()
                H       0                       0
                e       1                       1
                l       2                       3
                o       4                       4

                m.indexOf('l')==-1                  ==>  The character does not exist
                m.indexOf('l')==m.lastIndexOf('l')   ==>  The character is unique
                m.indexOf('l')!=m.lastIndexOf('l')   ==>  The character is not unique
         */

    }
}
