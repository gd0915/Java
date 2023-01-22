package selfpractices.selfpractice_collections;

import java.util.LinkedList;

public class Q01 {
    public static void main(String[] args) {

        //Q10) delete the middle element in a given String
        // input : [2, 3, 4, 5, 6] ==> output: [2, 3, 5, 6]
        //input : [2, 3, 4, 5, 6, 7] ==> output: [2, 3, 4, 6, 7]

        LinkedList<Integer> l1 = new LinkedList<>();
//        l1.add(2);
//        l1.add(3);
//        l1.add(4);
//        l1.add(5);
//        l1.add(6);

            try {
                if (l1.size() % 2 != 0) {

                    l1.remove(l1.get(l1.size() / 2));
                } else {
                    l1.remove(l1.get(l1.size() / 2));
                    l1.remove(l1.get(l1.size() / 2));
                }
                System.out.println(l1);
            }catch(IndexOutOfBoundsException e){
                System.out.println("Do not keep empty List " + e.getMessage());
                e.printStackTrace();
            }finally{
                System.out.println("It works");
            }

        System.out.println("Helloooooo");

    }
}
