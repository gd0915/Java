package questions;

public class Q13 {

    public static void main(String[] args) {

        //Create a multiplication table


        for(int i= 1; i<11; i++) {
            for (int k = 1; k < 11; k++) {
                System.out.print(i + "x" + k + "=" + i * k + "\t\t");
            }
            System.out.println();
        }
    }
}
