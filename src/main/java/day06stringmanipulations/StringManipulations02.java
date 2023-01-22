package day06stringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        //Example 1: type code to see the order number of the first occurrence character 'a'
        //              "I want to learn java"

        String str = "I want to learn java";

        int idx = str.indexOf('a');//indexOf() method gives you the index of first occurrence of a specific character

        System.out.println(idx + 1);//index num==3, order number== +1 than the index, so we put =1 to find order number


        //Example 2: Type code to see the order number of the first occurrence of "Java"
        //          "I like to study Java, learn Java, earn money, Java is easy."

        String s = "I like to study Java, learn Java, earn money, Java is easy.";


        //Note: indexOf() can be used with both "char" and "String" data types like str.indexOf('a'); and like s.indexOf("Java")
        //Note 2: If you use String inside the indexOf(), it will return the index of the first character. s.indexOf("Java"); returns the index of "J"
        //Note 3: s.indexOf("xyz"); ==> -1 indexOf() method returns "-1" for non - existing characters

        int i = s.indexOf("Java");

        System.out.println(i +1);//order number ==> +1

        int t = s.indexOf('w');
        System.out.println(t);// -1  because there is no 'w'

        //Example 3: Type code to check if a String has 'a' in it or not. Print appropriate messages for the scenarios

        //1.Way:
        String word = "I like to study";

        if(word.indexOf('a')==-1){
            System.out.println("There is no 'a' ");
        }else{
            System.out.println("There is 'a' ");
        }

        //2.Way:

        String result = word.indexOf('a')==-1 ? "There is no 'a' " : "There is 'a' ";


        //Example 4: Type code to find the order number of last occurrence of "Java" in a sentence
        String r = "I like to study Java, learn Java, earn money, Java is easy.";

        int f = r.lastIndexOf("Java");
        System.out.println(f +1);//order number

        //Example 5: Type code to check if a character is unique in a String or not
        //           "Hello" ==> H is unique, e is unique, o is unique

        String m = "Hello";

        //1. Way:
        if(m.indexOf('x')==-1){
            System.out.println("The character does not exist");
        }else if(m.indexOf('H')==m.lastIndexOf('H')){
            System.out.println("The character is unique ");
        }else{
            System.out.println("The character is not unique ");
        }

        //indexOf() and lastIndexOf() will give same index number by unique characters, but not in the repeated characters

        //2.Way:

        String res = m.indexOf('x')==-1 ? "The character does not exist" : m.indexOf('H')==m.lastIndexOf('H') ? "The character is unique " :"The character is not unique ";
        System.out.println(res);




    }
}
