package recap01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuestionsCoding_ArrayList {

    public static void main(String[] args) {

        //  Q1: Type code to make all elements in a List unique//Interview Question
        //  [2, 3, 2, 2, 5] ==> [2, 3, 5]

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);

        List<Integer> b = new ArrayList<>();

        for(Integer w : a){
            if(!b.contains(w)){
                b.add(w);
            }
        }
        System.out.println(b);//[2, 3, 5]

        // Q02: Find the closest 2 integers in the given list. [12, 15, 10, 21]

        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(15);
        l.add(16);
        l.add(21);
        System.out.println(l);

        Collections.sort(l);
        System.out.println(l);

        int minDiff = Integer.MAX_VALUE;
        for(int i=1; i<l.size(); i++){

             minDiff = Math.min(minDiff, l.get(i) - l.get(i-1));
        }
        System.out.println(minDiff);

        for(int i=1; i< l.size(); i++) {

            if (l.get(i) - l.get(i - 1) == minDiff) {
                System.out.println("The closest 2 integers are " + l.get(i) + " - " + l.get(i - 1));
            }
        }

        // Q03) Increase the value of every element by 3 except 7

        List<Integer> k = new ArrayList<>();
        k.add(11);
        k.add(31);
        k.add(22);
        k.add(7);
        k.add(15);

        for(Integer w : k){

            if(w!=7){
                k.set(k.indexOf(w), (w+3));
            }
        }
        System.out.println(k);

        // Q04: Convert all elements to "*" except the last 4 elements

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Ally");
        myList.add("Maven");
        myList.add("John");
        myList.add("Jackson");
        System.out.println(myList);

        for(int i =0; i<myList.size(); i++){

            if(i==(myList.size()-4) || myList.size()<5){
                break;
            }else{
                myList.set(i, "*");
            }
        }
        System.out.println(myList);

        //Q05:
         /*
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */

        //1.way
        String str= "Javaisalsoeasy";
        String arr1[] = str.split("");
        Arrays.sort(arr1);
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < arr1.length; i++) {
            for(int j = i+1; j < arr1.length; j++) {

                if(arr1[i].equals(arr1[j]) && !list.contains(arr1[j])) {
                    list.add(arr1[i]);

                }
            }
        }
        System.out.println(list);


        //2.way
        char arr[]= str.toCharArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        ArrayList<Character> output = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){

                if(arr[i] == arr[j] && !output.contains(arr[j])){

                    output.add(arr[j]);
                }
            }
        }
        System.out.println(output);









    }
}
