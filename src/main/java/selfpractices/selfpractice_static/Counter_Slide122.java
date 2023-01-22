package selfpractices.selfpractice_static;

public class Counter_Slide122 {

    int count=0;

    Counter_Slide122(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {

        Counter_Slide122 c1 =new Counter_Slide122();//1
        Counter_Slide122 c2=new Counter_Slide122();//1
        Counter_Slide122 c3=new Counter_Slide122();//1

    }
}
