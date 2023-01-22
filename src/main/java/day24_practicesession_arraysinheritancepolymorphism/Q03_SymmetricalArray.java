package day24_practicesession_arraysinheritancepolymorphism;

public class Q03_SymmetricalArray {

    //Type a method to check if an int Array is symmetrical.

    public static void main(String[] args) {

        int arr [] = {1, 2, 3, 4, 5, 4, 3, 2, 1};

        System.out.println("Is Array symmetrical? " + symmetrical(arr));//Is Array symmetrical? true



    }

    public static boolean symmetrical(int arr[]){
        boolean result = false;
        for(int i=0; i<arr.length-1; i++){
            if (arr[i] == arr[arr.length-1-i]){
                result =true;
            }else{
                result = false;
                break;
            }

        }
        return result;
    }





}
