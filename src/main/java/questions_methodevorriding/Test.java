package questions_methodevorriding;

public class Test {

    public static void main(String[] args) {


        Subclass s = new Subclass();
        s.m();
        Super t = new Subclass();
        t.m();

    }
}
