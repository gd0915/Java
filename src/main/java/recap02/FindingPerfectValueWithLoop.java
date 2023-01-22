package recap02;

public class FindingPerfectValueWithLoop {

    /*
                Check perfect number  using for Loop
            A perfect number is a number that is equal to the sum of its positive divisors
            (excluding the number itself). For example, 6, 28, 496 etc. are perfect number
     */

    public static void main(String[] args) {
    int num = 6;
    int sum = 0;

    for(int i = 1; i<=num/2; i++) {

        if (num % i == 0)
            sum = sum + i;
    }
        if(sum==num){
            System.out.println("It's a perfect number");
    }
        else{
            System.out.println("It's not a perfect number");
        }









}
}