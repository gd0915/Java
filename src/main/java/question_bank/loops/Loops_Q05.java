package question_bank.loops;

public class Loops_Q05 {

    public static void main(String[] args) {

            /*
            Type code to draw the following image by using a for loop.
                    A A A A A
                    A A A A A
                    A A A A A
             */

        //1.Way:
        int rows = 3;
        int columns =5;

        for(int i=1; i<=rows; i++){
            String s ="";
            for(int k=1; k<=columns; k++){
                s=s+"A";
            }
            System.out.println(s);
        }

        //2.Way:
        int r = 3;
        int c =5;


        int k=1;
        while(k<=r){
            String str="";
            for(int n=1; n<=c;n++){
                str = str+"A";
            }
            System.out.println(str);
            k++;
        }

        //3.Way:

        int ro=3;
        int col=5;
        int y= 1;

        do {
            String st = "";
            for(int z=1; z<=col; z++){
                st=st+"A";
            }
            System.out.println(st);
            y++;
        }while(y<=ro);

    }
}
