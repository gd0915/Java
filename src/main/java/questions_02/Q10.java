package questions_02;

public class Q10 {

    public static void main(String[] args) {

        /*
         * Type code to find the common elements between two String Arrays
         * (without case sensitivity)
         * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
         * Output : [brad,sofia,emily]
         */
        String arr [] = {"John","Brad","Angel","Sofia","Emily"};
        String brr [] = {"sofia","brad","grace","emily", "hazel"};


        for(String w : arr){

            for(String u : brr){

                if(w.equalsIgnoreCase(u)){
                    System.out.println(w);
                }
            }
        }





    }
}
