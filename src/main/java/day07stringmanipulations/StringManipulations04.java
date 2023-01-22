package day07stringmanipulations;

public class StringManipulations04 {

    public static void main(String[] args) {

        String str = "String is a non-primitive data type in Java";

        //isEmpty(): This method returns true,  if the String does not have any character, returns false if the String has any character

        boolean result1 = str.isEmpty();//Java will check if there is any character in the String
                                        //str.length()==0 and isEmpty() have same meaning but to check if a String is empty using isEmpty is preferable

        System.out.println(result1);//false

        //isBlank(): They are very similar but isBlank will give you true if you use space character
                    //isEmpty() ==> true, isEmpty(" ")==> false
                    //isBlank("") ==> true, isBlank(" ") ==>true

        boolean result2 = str.isBlank();
        System.out.println(result2);//true

        //Example 1) Check if a String has just letters and spaces in it

        String s = "Learn Java earn money!";

        boolean res = s.replaceAll("[A-Za-z ]","").isEmpty();
        System.out.println(res);//false because there is "!" character other than letters and space

        /*Example 2:Check SSN for the following rules
                    1)It must have just digits
                    2)It must have 9 digits
                    */

          String ssn = "123A45678";

          //1)It must have just digits
          boolean firstRule = ssn.replaceAll("[0-9]","").isEmpty();
          //2)It must have 9 digits
          boolean secondRule = ssn.replaceAll("\\s","").length()==9;

          if(firstRule && secondRule){
              System.out.println("Valid ssn");
          }else{
              System.out.println("Invalid ssn");
          }









    }
}
