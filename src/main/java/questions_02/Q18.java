package questions_02;

public class Q18 {

    //Type code to print repeated characters in a String by using do while loop
    //Example: String str = "accessories";   ==>  ces

    public static void main(String[] args) {

        String str = "accessories";

        String repeatedChars = "";
        int i =0;

        do{
            String s = str.substring(i, i+1);
            if(str.indexOf(s) != str.lastIndexOf(s) && !repeatedChars.contains(s)){
               repeatedChars = repeatedChars + s;
            }
            i++;
        }while(i<str.length());
        System.out.println(repeatedChars);//ces











    }
}
