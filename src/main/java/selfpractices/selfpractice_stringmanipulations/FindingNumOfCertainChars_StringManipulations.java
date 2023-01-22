package selfpractices.selfpractice_stringmanipulations;

public class FindingNumOfCertainChars_StringManipulations {

    // String metin = "Merhaba dünya bu java örnekleri";

    public static void main(String[] args) {

        //1.Way:
        String str = "Merhaba dunya bu Java ornekleri";

        int numOfCharA = str.replaceAll("[^a]","").length();
        System.out.println(numOfCharA);

        System.out.println();

        //2.Way:

        int count = 0;

        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a'){
                count++;
            }
        }
        System.out.println(count);






    }
}
