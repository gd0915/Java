package question_bank.loops;

public class Loops_Q11 {

    public static void main(String[] args) {

            /*
            Type code to reverse a String. Example; Mark ==> kraM
             */

        //1.Way:
        String s = "Mark";
        String reversedName= "";

        for(int i= s.length()-1; i>-1; i--) {
            String str = s.substring(i, i + 1);
            reversedName = reversedName + str;
        }
        System.out.println(reversedName);

        System.out.println();

        //2.Way:
        String str= "Mark";
        String revName = "";

        int k = str.length()-1;

        while(k>-1){
            String ch = str.substring(k, k+1);
            revName= revName + ch;
            k--;
        }
        System.out.println(revName);

        System.out.println();

        //3.Way:
        String m = "Mark";
        String newName = "";
        int z = m.length()-1;

        do{
            String s1 = m.substring(z, z+1);
            newName = newName + s1;
            z--;
        }while(z>-1);
        System.out.println(newName);


    }
}
