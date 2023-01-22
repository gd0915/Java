package questions_02;

public class Q05 {


    public static void main(String[] args) {

        //find the number of elements in a multidimensional array.  //Example:{ {2,3}, {12}, {21,34,56}, {4}}

        int arr [][] ={ {2,3}, {12}, {21,34,56}, {4}};

        int sum = 0;

        for(int w[] : arr){

          sum = sum + w.length;

        }
        System.out.println(sum );






    }
}
