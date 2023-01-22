package recap02;

import java.util.LinkedList;

public class RemoveElement_LinkedList {

    public static void main(String[] args) {

        //Question : If the number of characters is more than 4, remove them from the LinkedList
                            //Interview Question

        LinkedList<String> words = new LinkedList<>();
        words.add("Emily");
        words.add("Tom");
        words.add("John");
        words.add("Susana");
        words.add("Lukas");


        for(int i =0; i<words.size(); i++ ){

            if(words.get(i).length()>4){
                words.remove(words.get(i));
                i--;
            }
        }
        System.out.println(words); //[Tom, John]

        System.out.println("======================");

        LinkedList<String> names = new LinkedList<>();
                names.add("Tom");
                names.add("Jane");
                names.add("Mary");
                names.add("Mahmut");
                names.add("Ali");
                names.add("Emily");

        for(int i =0; i<names.size(); i++){

                if(names.get(i).length()>4){
                    names.remove(names.get(i));
                    i--;                        // since removing one element we should decrease the index
                                                // while the indexes will change after every iteration
                    }
                }
                System.out.println(names); //[Tom, Jane, Mary, Ali]


    }
}
