package selfpractices.selfpractice_constructor;

public class MyConstructor {

    int x =5;
    int y;
    int z=6;

    MyConstructor(){
        System.out.println("-x" + x);//Default Constructor does not have a parameter.
                                     //Default Constructor cannot be a code in its body.
    }
    MyConstructor(int x){
        this();
        System.out.println("-x" + x);
    }

    public static void main(String[] args) {
        MyConstructor mc1 = new MyConstructor(4);
        MyConstructor mc2 = new MyConstructor();
        System.out.println(mc1.x);
        System.out.println(mc2.x);
        System.out.println(mc1.y);
        System.out.println(mc1.z);



    }
}
