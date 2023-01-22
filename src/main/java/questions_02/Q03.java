package questions_02;

public class Q03 {

    public static void main(String[] args) {

        //Question 1- What is the output?

        int x=5;
        System.out.println(x>2 ? x<4 ? 10 : 8 : 7);

        System.out.println(); //8

        //Question-2 : What is the result of a, b, c, d?

        int a = 5;
        int b = 2;
        int c;
        int d;

        c = ++b; //c=3 , b= 3
        d = a++; // d= 5 a =6
        c++;     // c=4
        b = --a; // b=5 a=5
        a = --c; // a= 3 c=3
        d = b--; // d=5 b=4


        System.out.print("a: " + a + "\nb: " + b + "\nc: " + c + "\nd: " + d); // 3, 4 , 3 , 5

        System.out.println();




//Question 3

        int aa = 5;
        int bb = 2;
        int cc;
        int dd;
        cc = ++bb; //cc=3, bb=3
        dd = aa++; //dd=5 aa=6
        cc++;      //cc=4
        dd = bb--; // dd=3 bb=2
        bb= aa++;  // bb=6 aa=7
        cc = --bb+ (--aa); // cc=  5 + 6 ==11

        System.out.println(aa+bb+cc+dd);   //6+5+11+3=25




//Question 4-



        int num1 = 10;
        int num2 = num1 + 1;    //num2=11 num1=10

        num2 += 5;              //num2= 16
        int num3 =  num2++;     //num3=16, num2=17
        int num4 = ++num1;      //num4=11 num1=11


        System.out.println(num1 + num2 + num3 + num4); //11+17+16+11=55

    }
}
