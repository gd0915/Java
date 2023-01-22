package recap01;

import java.util.LinkedList;

public class QuestionsCoding_LinkedList {

    public static void main(String[] args) {

        // Q01) If the number of characters is more than 4, remove them from the LinkedList

        LinkedList<String> names = new LinkedList<>();
        names.add("Tom");
        names.add("Jane");
        names.add("Mary");
        names.add("Mahmut");
        names.add("Ali");
        names.add("Emily");

        for(int i=0; i< names.size(); i++){

            if(names.get(i).length()>4){
                names.remove(names.get(i));
                i--;                                 // since removing one element we should decrease the index
                                                     // while the indexes will change after every iteration
            }
        }
        System.out.println(names);//[Tom, Jane, Mary, Ali]


        //Q02: If the number of characters is more than 4, remove them from the LinkedList
        //Interview Question

        LinkedList<String> name = new LinkedList<>();
        name.add("Tom");
        name.add("Jane");
        name.add("Mary");
        name.add("Mahmut");
        name.add("Ali");
        name.add("Emily");

        for(int i =0; i<name.size(); i++){

            if(name.get(i).length()>4){
                name.remove(name.get(i));
                i--;             // since the indexes will change after every iteration
            }
        }
        System.out.println(name);// [Tom, Jane, Mary, Ali]
    }
}
