package selfpractices.selfpractice_stringbuilder;

public class StringBuilder01 {

    public static void main(String[] args) {

        StringBuilder sb3 = new StringBuilder("Learn");
        System.out.println("Before trim: " + sb3.capacity());//21
        sb3.trimToSize();
        System.out.println("After trim: " + sb3.capacity());//5



    }
}
