package selfpractices.selfpractice_static;

public class StaticMember_Slide120 {

    static int x;
    int y;

    StaticMember_Slide120(){
        x += 2;
        y ++ ;
    }
    static int getSquare(){
        return x * x;
    }

    public static void main(String[] args) {
        StaticMember_Slide120 sm1 = new StaticMember_Slide120();
        StaticMember_Slide120 sm2 = new StaticMember_Slide120();
        int z = sm1.getSquare();
        System.out.println("-x" + z + "-y" + sm2.y);//-x16-y1
    }
}
