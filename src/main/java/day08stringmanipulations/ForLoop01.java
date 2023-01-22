package day08stringmanipulations;

public class ForLoop01 {

    public static void main(String[] args) {

      //Example 1: Type code to print "Hi!" five times on the console

        //1.Way: Not recommended because there is repetition, difficult to type, maintain and update.

        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");

        //2.Way: To do repeated actions Java created "Loops"
        //There are 4 loops in Java: i)for-loop ii) while-loop iii)do-while-loop iv)for-each-loop

        //i)for-loop
        //  Starting value    Condition    Increment /decrement
        for(   int i = 1    ;   i< 6     ;     i++    ){

            System.out.println("Hi!");

        }

        //Increment means to increase the value
        // 1.Way: int i = 2; ==> i = i + 5; ==> i = 7;
        // 2.Way: int k = 3; ==> k= k*2; ==> k =6;
        // i+ = 5; ==> means (int  i = 2; ==> i = i + 5; ==> i = 7;) ==>They are same
        // k* = 2; ==> means (int k = 3; ==> k= k*2; ==> k =6;) ==> same

        //To increase by 1 has a specific syntax
        //int m = 7;   ==> m++;   ==> m = m+1; ==>   m+ = 1; They are same. That syntax can be used only with plus 1.

        //Decrement means to decrease values of a variable
        //1.Way: int i = 12;  ==> i = i-7;  ==> i=5;
        //2.Way: int k=6; ==> k=k/2;  ==> k=3;
        // i- = 7; same meaning
        // k/ = 2; same meaning

        //To decrease any value by 1 we have a specific syntax
        //int m = 10; ==> m--; ==> m+m-1;  ==> m- =1; ==> They are same. That syntax can be used only with minus 1.


        //Example 2: Type all integers from 11 to 44 in the same line with a space between consecutive integers


        for(int i=11;     i<45;  i++){

            System.out.print(i + " ");//We removed ln after print to be able to type the numbers side by side

        }

        System.out.println();


        //Example 3: Type all integers from 44 to 11 in the same line with a space between consecutive integers

        for(int i=44; i>10; i--){
            System.out.print(i + " ");
        }

        System.out.println();

        //4.Example: Type even integers from 11 to 44 in the same line with a space between consecutive integers

        for(int i=11;  i<45;  i++){
            if(i%2==0){
                System.out.print(i + " ");
            }


        //5.Example: Type odd integers from 68 to 13 in the same line with a space between consecutive integers

            for( int i1 = 68; i1>12; i1-- ){
                if(i1%2!=0){
                    System.out.print(i1 + " ");
                }
            }

        //6. Example: Type all integers which are divisible by 4 and not divisible by 6 from 120 to 11
                       // in the same line with a space between consecutive integers

        for(int x = 120 ; x>10; x--){
            if(x%4==0 && x%6!=0){
                System.out.print(x + " ");
            }
        }







        }



    }
}
