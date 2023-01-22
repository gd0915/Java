package selfpractices.selfpractice_loops;

import java.util.Scanner;

public class Example_Loop_Q05 {

    public static void main(String[] args) {

        /*
         Question 5- Negatif bir deger girilene kadar kullanicidan sayi isteyen ve girilen sayilardan
         tek sayilari toplayip ekrana yazdiran programi yazin. not: Negatif sayi verilmesi durumunda
         ekrana "Negatif sayi verdiniz, programdan ciktiniz" yazdirin.
            */
        Scanner input = new Scanner(System.in);
        int i = 0;
        int sumOfOddNumbers= 0;

        do{
            System.out.println("Enter a number please!");
            int num = input.nextInt();

            if(num<0){
                System.out.println("You entered an odd number and exited the application" );
                break;
            }else{
                if(num%2!=0){
                    sumOfOddNumbers = sumOfOddNumbers + num;
                    num++;
                }
                System.out.println(sumOfOddNumbers);
            }
        }while(i>-1);

    }
}
