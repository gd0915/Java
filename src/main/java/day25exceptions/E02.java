package day25exceptions;

public class E02 {

    public static void main(String[] args) {

        String a[] = { "A", "C", "B", "Z"};

        String r1 = getElement(a, 2);
        System.out.println(r1);//B
        String r2 = getElement(a, 5);//ArrayIndexOutOfBoundsException  ==> There is no index 5 in the array


    }

    //Create a method to get any element from an Array

    public static String getElement(String a[], int idx){

        String s = "";
        try {
             s = a[idx];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("A problem occurred in array indexes"); //This one is the message of the programmer
                                                                       //If you want you can get the message from Java ==> e.getMessage()
                                                                       //System.out.println(e.getMessage());  ==>technical message about the exception
            System.out.println(e.getMessage());//Gives technical message about the Exception
            e.printStackTrace(); //It will print all the steps in Exception ==> It will give detailed technical message about exception
                                 // We do not need to put this method into System.out.println, method itself prints the message
        }
        return s;
    }



}
