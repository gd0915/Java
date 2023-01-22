package question_bank.arrays;

public class Arrays_Q08 {

    public static void main(String[] args) {

        /*
        Type code to find array elements whose first and last characters are same
        */

        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};


        for(int i = 0; i<arr.length ; i++){
            String  firstChar =arr[i].substring(0,1);
            String lastChar = arr[i].substring(arr[i].length()-1);
            if(firstChar.equals(lastChar)){
                System.out.print(arr[i] + " ");
            }
        }






    }
}
