package questions;

import java.util.Scanner;

public class Q65 {

    //  Kullanicidan toplanmak uzere sayilar isteyin
    //  sayi adedi 10'u gecerse veya toplam 500 'u gecerse
    //  bu kadar sayi yeter
    //  ".. adet sayi girdin, toplami..." yazdirin


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number= 0;
        int sum=0;
        int counter = 0;

        while (counter < 10 && sum < 500) {
            System.out.println("Please enter numbers to add");
            number = scan.nextInt();
            sum += number;
            counter++;
        }

        if (counter < 10 && sum < 500) {
            System.out.println(counter + " times number have been entered and the sum is :" + sum);
        } else{
            System.out.println("You reached the limit! " + counter + " times number have been entered and the sum is :" + sum);
        }
    }




}
