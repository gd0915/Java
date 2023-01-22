package questions_02;

public class Q25 {

    public static void main(String[] args) {

        //Example 01:
        StringBuilder strBld = new StringBuilder("MyLoveJava");

        String str = strBld.substring(3);
        System.out.println(str);
        System.out.println(strBld); //Output?


        System.out.println(strBld.substring(3)); //Output?


        //Example 02:
        StringBuilder strBld1 = new StringBuilder("Java is easy");
        strBld1.delete(5, 9);
        System.out.println(strBld1);// Output?


        //Example 03:
        StringBuilder strBld2 = new StringBuilder(6);
        System.out.println(strBld2.capacity()); // ?
        strBld2.append("StringBuilder");
        System.out.println(strBld2.capacity()); //?
        System.out.println(strBld2.length()); //?

        StringBuilder strBld3 = new StringBuilder();
        System.out.println(strBld3.capacity());


        //Example 04:
        StringBuilder strBld4 = new StringBuilder("LearnJavaEarnMoney");
        int idx = strBld4.indexOf("a", 11);
        System.out.println(idx); // Output?

        int idx1 = strBld4.indexOf("a", 10);
        System.out.println(idx1); // Output?



        //Example 05:
        StringBuilder strBld5 = new StringBuilder("I like Java");
        int idx2 = strBld5.indexOf("a", 6);
        System.out.println(idx2); // ?


        //Example 06:
        StringBuilder strBld6 = new StringBuilder("I like Java");
        int idx3 = strBld6.indexOf("e", 6);
        System.out.println(idx3); // ?

        int idx4 = strBld6.indexOf("like");
        System.out.println(idx4); // ?


        //Example 07:
        StringBuilder strBld7 = new StringBuilder("Welcome to the ");
        char [] arr = new char[]{'W', 'O', 'R', 'L', 'D'};

        strBld7.append(arr);
        System.out.println(strBld7);


        //Example 08:
        int number = 4;
        int result = 2 ;
        for(int i = 0; i<4; i++){

            result *= number;
        }
        System.out.println(result);//?

        System.out.println("============");



        //Example 09:


        for(int x=1; x<6; x++){

            int y = x<3 ? x : ++x;
            System.out.print(y);//? 1246
        }
        System.out.println();
        System.out.println("==============");


        //Example 10:

        int y =3; //135
        for(int x=1; x<6; x++){

            y = x<y ? x : ++x;
            System.out.print(y);//?
        }

        System.out.println();

        //Example 11:

        int z = 5;
        int l = 1;

        while(z>0){
            z = --z;
            l = l*z;
        }
        System.out.println(l); //?

        System.out.println("================");


        //Example 11 :

        try{
            int num = 10;
            for(int i = -1; i<2; i++){
                System.out.print(num / i);
            }

        }catch(ArithmeticException e){
            System.out.print("0");
        }finally{
            System.out.print(" Done!");
        }  // Output= ?


    }
}
