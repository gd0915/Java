package questions_02;

public class Q22 {

    public static void main(String[] args) {

        boolean keepGoing = true;
        int result = 15, i = 10;

        do {
            i--;

            if (i == 8) keepGoing = false;

            result -= 2;

        }while(keepGoing); //keepGoing true oldugu surece devam et ==>11

        System.out.println(result);





    }
}
