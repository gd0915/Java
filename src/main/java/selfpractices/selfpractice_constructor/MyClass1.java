package selfpractices.selfpractice_constructor;

public class MyClass1 {


        int num1;
        String name = "Ali";
        MyClass1(){
            char letter = 'c';
        }
        MyClass1(int num1){
            this();
            this.num1 = num1;
        }
        void MyClass1(){
            num1++;
        }
//        increase(int num1){   //return type required
//            name++;             //"++"cannot be used with String
//        }

}
