package day12_practicesession;

public class PracticeDay03_StringManipulations_Q03 {

    public static void main(String[] args) {

        //Type code to check if a given integer is palindrome or not

        String str ="Nalan";
        String reversed = "";

        //1.Way:
        for(int i=str.length()-1; i>-1; i--){
            String ch = str.substring(i, i + 1);
            reversed = reversed + ch;
        }
            if(str.equals(reversed)){
                System.out.println("It is palindrome");
            }else{
                System.out.println("It is not palindrome");
            }

        System.out.println();


            //2.Way:
        String str1 ="Nalan";
        String reversed1 = "";

        int idx=str1.length()-1;

        while (idx>-1){

            reversed= reversed+str1.charAt(idx);

            idx--;
        }
        if (str1.equals(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }




        System.out.println("================================================================");


        String strI2= "ey edip adanada pide ye";
        String reversed2= "";

        int idx2=strI2.length()-1;
        while(idx2>-1){
            reversed2=reversed2+ strI2.charAt(idx2);
            idx2 --;
        }
        if (strI2.equals(reversed2)){

            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }










    }
}
