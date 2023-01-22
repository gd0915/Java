package selfpractices.selfpractice_static;

public class Slide_114_Static {

    int x;
    static int y;

    Slide_114_Static(int i){
        x += i;
        y += i;
    }

    public static void main(String[] args) {
        new Slide_114_Static(2);
        Slide_114_Static mc = new Slide_114_Static(3);
        System.out.println(mc.x + "," + mc.y);//3,5
    }
}
