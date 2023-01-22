package day07stringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        String str = "Java is OOP";

        //replace(char oldChar, char newChar): Gives you a String value
                                                //It will replace a specific character to an another

        String result1 = str.replace('O','*');
        System.out.println(result1);//"Java is **P"

        //replace(charSequence target, charSequence replacement): It will replace multiple characters to another

        String result2 = str.replace("Java","*");
        System.out.println(result2);//"* is OOP"


        String st = "Ali is 13 years old, I think he seems 15.";

        //Example 1: Change all digits to "*" in the given String


        //1.Way is not recommended because there is repetition
        String result3 = st.replace('0','*').
                            replace('1','*').
                            replace('2','*').
                            replace('3','*').
                            replace('4','*').
                            replace('5','*').
                            replace('6','*').
                            replace('7','*').
                            replace('8','*').
                            replace('9','*');

        System.out.println(result3);
        //Note: If your code does not work for all values, it is called "Hard Coding" cannot be accepted

        //2.Way: Recommended ==> replaceAll()

        String result4 = st.replaceAll("[0-9]","*");
        System.out.println(result4);

                /*
                Regex means "Regular Expressions"
                Regex represent a group of data
                All digits: [0-9]
                All lowercase letters: [a-z]
                All uppercase letters: [A-Z]
                All lowercase  and uppercase letters: [a-zA-Z]
                All lowercase  and uppercase letters and digits: [a-zA-Z0-9]
                Some multiple characters like a,e,i,o,u: [aeiou]

                All characters different from digits:[^0-9]
                All characters different from alphabets: [^a-zA-Z]
                 All characters different from vowels:[^aeiou]

                 Space character: \\s represents space character
                 All characters different from space character: \\S

                 All digits: \\d
                 All characters different from digit: \\D

                 All uppercase and lowercase letters and digits and _: \\w
                 Different from all uppercase, and lowercase letters and digits and _: \\W

                 All punctuations marks: \\p{Punct}
                 Different from all punctuations marks: \\P{Punct}

                 */

        /*
                Example 2: Type code to check if a password is valid or not for the following conditions;
                Password must have at least 8 characters different from space character
                Password must have at least 1 symbol
         */

        String pwd = "!1a23b4?es";

//        boolean firstRule = pwd.replaceAll("\\s","").length()>7;
//        boolean secondRule = pwd.replaceAll("\\s","").replaceAll("\\w","").length()>0;

        boolean firstRule = pwd.replaceAll("\\s","").length()>7;
        //Password must have at least 1 symbol
//        boolean secondRule = pwd.replaceAll("\\s","").replaceAll("[a-zA-Z0-9]","").length()>0;//For readability it is better
        boolean secondRule = pwd.replaceAll("[a-zA-Z0-9 ]","").length()>0;
        //We can put after 9 a space [a-zA-Z0-9 ] to get Java to remove the space as well. No need to type replaceAll two times
        //But it is difficult to notice because of that the secondRule above is better for readability

        System.out.println("Is the password valid? " + (firstRule && secondRule));


















    }
}
