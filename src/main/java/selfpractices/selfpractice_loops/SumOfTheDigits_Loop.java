package selfpractices.selfpractice_loops;

public class SumOfTheDigits_Loop {
    public static void main(String[] args) {

        String str = "3456";
        int sum = 0;

        for (int i = 0; i<str.length(); i++) {
            String digit = str.substring(i, i+1);
            sum=  sum + Integer.valueOf(digit);

        }
        System.out.println(sum);






    }
}
