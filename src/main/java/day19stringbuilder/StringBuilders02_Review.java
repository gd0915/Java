package day19stringbuilder;

public class StringBuilders02_Review {

    public static void main(String[] args) {

        //reverse();
        String str = "Christmas";

        StringBuilder s = new StringBuilder("Christmas");
        StringBuilder revS = s.reverse();
        System.out.println(revS);//samtsirhC

        //replace();

        s.replace(0,3,"XXX");
        System.out.println(s);//XXXtsirhC


        //Example01:
        StringBuilder strBld = new StringBuilder("John ");
        strBld.append("Woo ").append("Leo").deleteCharAt(6);
        System.out.println(strBld);

        //Example02:
            StringBuilder str1 = new StringBuilder(7);
            str1.append("Java");
            System.out.println(str1);//Java
            System.out.println(str1.capacity() + "," + str1.length());

        //Example03:
            StringBuilder b = new StringBuilder("LearnJava");
            int index = b.indexOf("earn");
            System.out.println(index);//1

        //Example04:
        StringBuilder c = new StringBuilder("LearnJava");
        int index1 = c.indexOf("a", 4);
        System.out.println(index1);

        //Example05:
        StringBuilder d = new StringBuilder("LearnJava");
        int index2 = d.indexOf("e", 4);
        System.out.println(index2);//-1




    }
}
