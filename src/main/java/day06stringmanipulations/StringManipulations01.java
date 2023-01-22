package day06stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    ////1.Example: Print the first and last character of the given String on the console. "Java is easy" ==> Jy

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Please enter a Sentence");
        String str = input.nextLine();



        //1.Way: By using charAt()

        char firstChar = str.charAt(0); // How to find first character in a string

        char lastChar = str.charAt(str.length()-1); // How to find last character in a String

        System.out.println(firstChar + lastChar);//162=> 65+97 note: If you use "char" data type in a math operation, Java uses Ascii values.

        System.out.println("" + firstChar + lastChar); // By putting empty String at the beginning we will let Java do concatenation, and we will get String
                                                       //Concatenation puts the data together(side by side)



       //2.Way: By using substring()
        // first index is exclusive the given second data
        // last index is inclusive the given data

        String firstCharacter = str.substring(0,1);//substring(0,1) gives you first character everytime==>substring(beginIndex , lastIndex)
                                                    //Substring() returns String

        String lastCharacter = str.substring(str.length()-1);//substring(begin index) gives you the characters from a specific index to the last index

        System.out.println(firstCharacter + lastCharacter);

        //You will get the characters from 3 to 8(8 inclusive)

        //2.Example: Print just the animal names from the String; "I like lion, horse, laptop and cat"

        String animals = "I like lion, horse, laptop and cat";

        String lion = animals.substring(7,11);
        String horse = animals.substring(13,18);
        String cat = animals.substring(31);
        System.out.println(lion + horse + cat);


        //3.Example: Type code to get initials of the first name and the last name of a given name. Ali Can ==> AC, Mary Star ==> MS etc.

        String name = "Ali Can";

         //How to split a string? We will cut the String.

        String initialOfFirstName = name.substring(0,1);

        String  initialOfTheLastName = name.split(" ")[1].substring(0,1);

        System.out.println(initialOfFirstName + initialOfTheLastName);


        //4. Example: Type code to find the number of words in a String; "I like to move it, move it" ==> 7

        String word = "I like to move it, move it";

        //Note: If you use "length" after split() do not use parenthesis, when you use it for Strings put parenthesis after the "length"
        int numOfWords = word.split(" ").length;

        System.out.println(numOfWords);




    }




}
