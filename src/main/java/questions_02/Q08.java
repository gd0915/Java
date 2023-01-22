package questions_02;

public class Q08 {

    public static void main(String[] args) {

        //Type code to find array elements whose first and last characters are same
        //       String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};


        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};


        for(int i = 0; i<arr.length; i++){

            String first = arr[i].substring(0, 1);
            String last =  arr[i].substring(arr[i].length()-1);
            if(first.equals(last)){
                System.out.println(arr[i]);
            }
        }








    }
}
