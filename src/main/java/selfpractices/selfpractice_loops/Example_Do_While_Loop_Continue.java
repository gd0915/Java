package selfpractices.selfpractice_loops;

public class Example_Do_While_Loop_Continue {

    public static void main(String[] args) {

        //Type code to print numbers from 3 to 9 except 5

//        int i = 3;
//
//        String str = "";
//
//        do{
//            if(i!=5) {
//                str= str.concat(String.valueOf(i)) + " ";
//            }
//
//            i++;
//        }while(i<10);
//        System.out.print(str);


        System.out.println();
        int a =3;

        do {
            if( a!= 5 ) {
                System.out.print(a + " ");
            }
            a++;

        }    while(a <10);

    }
}
