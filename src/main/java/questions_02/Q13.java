package questions_02;

public class Q13 {

    public static void main(String[] args) {

        //Type code to find the sum of the digits of an Integer by using loop
        // int n = -3558;   ==> 3+5+5+8=21

        int n = -3558;
        n = Math.abs(n);
        System.out.println(n); //3558

        int sum = 0;
        for(int i = n; i>0; i=i/10){
            int digit = i%10;
            sum = sum +digit;
        }
        System.out.println(sum);








    }
}
