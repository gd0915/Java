package question_bank.loops;

public class Loops_Q06 {

    public static void main(String[] args) {
           /*
           Type code to draw the following image by using a for loop.
                    A
                    A A
                    A A A
                    A A A A
            */

        int rows=4;
        for(int i = 1; i<=rows; i++){
            String s="";
            for(int k=1; k<=i;k++){
                s= s +"A";
            }
            System.out.println(s);
        }

        System.out.println();

        int r = 4;
        int i = 1;

        while(i<=r){
            String s="";
            for(int k=1; k<=i; k++){
                s=s+"A";
            }
            System.out.println(s);
            i++;
        }


        System.out.println();

        int r1 = 4;
        int l= 1;
        do{
            String s ="";
            for(int m=1; m<=l; m++){
                s=s+"A";
            }
            System.out.println(s);
            l++;
        }while(l<=r1);



    }
}
