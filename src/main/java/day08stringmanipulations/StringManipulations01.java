package day08stringmanipulations;

public class StringManipulations01 {


    public static void main(String[] args) {

        //replaceFirst(): It will change just the first character or String in a String, does not touch the second one.

                String str = "Java is easy. Java is OOP.";

                String result1 = str.replaceFirst("Java","Apex");

                System.out.println(result1);//Apex is easy. Java is OOP.
                String result2 = str.replace("Java","Apex");//replace(charSequence....)
                System.out.println(result2);//Apex is easy. Apex is OOP.

        /*
            Example 1:
            String shirtPrice = ‘$12.99’;
            String bookPrice = ‘$35.99’;
            Type code to find the sum of the shirt and book prices.*/

        String shirtPrice ="$12.99";
        String bookPrice ="$35.99";

        String shirt = shirtPrice.replace("$","");
        System.out.println(shirt);//12.99

        String book = bookPrice.replace("$","");
        System.out.println(book);//35.99

        //valueOf() method converts Strings to numeric values
        //Note: To be able to use valueOf() method String must be in numeric format(cannot be used with String values of letters or special characters)
        Double shirtInDouble = Double.valueOf(shirt);
        Double bookInDouble = Double.valueOf(book);

        double shirtInDouble1 = Double.valueOf(shirt);//Both works with double primitive and Double wrapper class since wrapper class contains both
        double bookInDouble1 = Double.valueOf(book);

        System.out.println("Total price is " + (shirtInDouble+bookInDouble));
        System.out.println("Total price is " + (shirtInDouble1+bookInDouble1));

        /*
            Example 2:
            Swap the integers  ==>Very common interview question
                a=12    b=23    ==> a=23    b=12
                 */
        int a = 12, b = 23;

        //1.Way:We used 3rd Variable
        int temp = 0;

        temp = b;
        b = a;
        a = temp;

        System.out.println(a);//23
        System.out.println(b);//12

        //2.Way:Without using 3rd variable
        int x = 14, y = 25;
        y = y-x;//11
        x= x+y;//23
        y= y-x;//12

        System.out.println(x);//25
        System.out.println(y);//14

    }
}