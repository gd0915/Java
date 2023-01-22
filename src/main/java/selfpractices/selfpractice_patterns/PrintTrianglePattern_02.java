package selfpractices.selfpractice_patterns;

public class PrintTrianglePattern_02 {

    /* Type code to draw the following image by using a for loop.
     * * * * * *
     * * * * *
     * * * *
     * * *
     * *
     *
     */

    public static void main(String[] args) {

        int rows = 6;

        for(int i = 1 ; i<=rows; i++){

            for(int k = rows; k>=i; k--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = rows ; i>0; i--){

            for(int k = 1; k<=i; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        String str = "Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";
        str= str.replaceAll("\\s", "").replaceAll("\\p{Punct}", "").toLowerCase().replaceAll("[^aeiou]", "");
        System.out.println(str.length());

    }

}
