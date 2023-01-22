package day25exceptions;

public class E04 {

    public static void main(String[] args) {

        int r1 = convertToInt("123");
        System.out.println(r1 + 1);//124

        int r2 = convertToInt("abc");
        System.out.println(r2 + 1);  //NumberFormatException : When you use valueOf method with a String has non-digit character in it,
                                     // you will get "NumberFormatException".


    }

    //Create a method to convert String to integer

    public static int convertToInt(String str) {

        int i = 0;
        try {
            i = Integer.valueOf(str);
        } catch (NumberFormatException e) {
            System.out.println("A problem occurred while I convert the String to integer - " + e.getMessage());
            //"For input string: "abc""  ==>It is not understandable ==> It is not a good  message. Therefore, I added my message into the message as well.
        }
        return i;
    }


}
