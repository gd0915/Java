package day08stringmanipulations;

public class ReviewForLoop01 {

    public static void main(String[] args) {

        //Example 2: Type all integers from 11 to 44 in the same line with a space between consecutive integers

        for( int i = 11 ; i<45 ; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        //Example 3: Type all integers from 44 to 11 in the same line with a space between consecutive integers

        for(int i = 44 ; i>10 ; i--){
            System.out.print(i + " ");
        }

        System.out.println();

        //4.Example: Type even integers from 11 to 44 in the same line with a space between consecutive integers

        for(int i = 11 ; i<45 ; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //5.Example: Type odd integers from 68 to 13 in the same line with a space between consecutive integers

        for(int i = 68; i>12 ; i--){
            if(i%2 != 0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //6. Example: Type all integers which are divisible by 4 and not divisible by 6 from 120 to 11
        // in the same line with a space between consecutive integers

        for(int i = 120; i>10 ; i--){
            if(i%4==0 && i%6!=0){
                System.out.print(i + " ");
            }
        }










    }
}
