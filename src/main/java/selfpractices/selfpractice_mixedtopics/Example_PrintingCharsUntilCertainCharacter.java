package selfpractices.selfpractice_mixedtopics;

public class Example_PrintingCharsUntilCertainCharacter {

    public static void main(String[] args) {


        String st = "Christmas";
        int firstM = st.indexOf("m");

        if(firstM != 0){
            System.out.println(st.substring(0, firstM));
        }
    }
}
