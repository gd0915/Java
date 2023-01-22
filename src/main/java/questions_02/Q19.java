package questions_02;

public class Q19 {

    public static void main(String[] args) {

        //What is the output?
        int i = 1;
        do{

            if(i==3) {
                continue;
            }else if(i==5){
                System.out.print(i + " ");
                break;
            }else{
                System.out.println(i + " ");
            }


        }while(true);




    }
}
