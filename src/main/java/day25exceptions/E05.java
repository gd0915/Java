package day25exceptions;

public class E05 {

    public static void main(String[] args) {


        char r1 = getCharacter("Java", 0);
        System.out.println(r1);//J

        char r2 = getCharacter("Java", 9);
        System.out.println(r1);//StringIndexOutOfBoundsException : If you use non-existing index for a String,
                               // you will get "StringIndexOutOfBoundsException"
    }

    //Create a method to get ant character from a String

    public static char getCharacter(String str, int idx){

        char ch =' ';  //'x' if you want you can put any character instead of ' '
        try {
            ch = str.charAt(idx);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("A problem occurred - " + e.getMessage());  //A problem occurred - String index out of range: 9
    }
        return ch;
}



}
