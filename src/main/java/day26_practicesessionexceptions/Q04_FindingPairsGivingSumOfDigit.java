package day26_practicesessionexceptions;

public class Q04_FindingPairsGivingSumOfDigit {

    /*
        Create a method from a given array and find all pairs of the given whose sum is a given number

     */

    public static void main(String[] args) {

        int arr[] = {4, 6, 5, -10, 8, 5, 20};
        findPairs(arr, 11);

      }

      public static void findPairs(int [] arr, double number) {

              //number = 10;
              for (int i = 0; i < arr.length; i++) {

                  for (int k = i + 1; k < arr.length; k++) {

                      if (arr[i] + arr[k] == number) {
                          System.out.println(arr[i] + "+" + arr[k] + " = " + number);
                      }
                  }
              }

          System.out.println("If there is something wrong show me then");


      }
}
