package selfpractices.selfpractice_static;

public class MyClass {

    int x;
    static int y;

    MyClass(int i)
    {
        x += i;
        y += i;
    }


    public static void main(String[] args) {
        new MyClass(2);
        MyClass mc = new MyClass(3);
        System.out.println(mc.x + "," + mc.y);









    }
}
