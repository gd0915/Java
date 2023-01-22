package recap02;

public class FrequencyOfUsageInString {

    public static void main(String[] args) {

        /*
        Count the frequency of the letters in a given String as the format below:
        Input: String str = "Java is so Good";
        Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
     */

        String str = "Java is so Good";
        String output = "";

        ///By using Arrays
        str = str.replaceAll("\\s", "");
        String [] arr = str.split("");

        String result = "";
        for(int i =0; i<arr.length; i++) {

            int counter = 0;
            for (int j = 0; j < arr.length; j++) {

                if (arr[i].equals(arr[j])) {
                    counter++;
                }
            }

            if (!result.contains(arr[i])) {
                result += arr[i] + counter + " ";
            }
        }
            System.out.println(result); //J1 a2 v1 i1 s2 o3 G1 d1


        //Without using Arrays
        String result1 = "";
        for(int i =0; i<arr.length; i++) {

            int counter = 0;
            for (int j = 0; j < arr.length; j++) {

                if(str.charAt(i) == str.charAt(j)){
                    counter++;
                }
            }
            if(!result1.contains(String.valueOf(str.charAt(i)))){
                result1 += String.valueOf(str.charAt(i)) + counter + " ";
            }

            }
        System.out.println(result1);//J1 a2 v1 i1 s2 o3 G1 d1




            }
        }



