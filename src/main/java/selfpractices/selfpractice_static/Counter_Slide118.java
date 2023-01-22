package selfpractices.selfpractice_static;

public class Counter_Slide118 {

    int count;
    static int stCount;

    public Counter_Slide118(){
        count ++;
        stCount ++;
    }
    public int getCount(){
        return count;
    }
    public static int getStCount(){
        return stCount;
    }

    public static void main(String[] args) {

        Counter_Slide118 cs1 = new Counter_Slide118() ;
        Counter_Slide118 cs2 = new Counter_Slide118() ;
        Counter_Slide118 cs3 = new Counter_Slide118() ;
        Counter_Slide118 cs4 = new Counter_Slide118() ;
        Counter_Slide118 cs5 = new Counter_Slide118() ;
        Counter_Slide118 cs6 = new Counter_Slide118() ;
        System.out.println("count is: " + cs6.getCount());//1
        System.out.println("stCount is: " + cs6.getStCount());//6

        System.out.println("count is: " + cs1.getCount());//1
        System.out.println("stCount is: " + cs1.getStCount());//6
    }
}
