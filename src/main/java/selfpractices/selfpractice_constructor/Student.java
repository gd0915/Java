package selfpractices.selfpractice_constructor;

public class Student {

    String name;
    int age;
    public static int numberOfStudent = 0;

    Student(){
        System.out.println("New student");
        numberOfStudent++;

    }

    Student (String name, int age) {
        this();
        this.name = name;
        this.age = age;

    }

    public static void main(String[] args) {

        //1. tanimlama yolu
        Student s1 = new Student();
        s1.age = 35;
        s1.name = "Ali";
        System.out.println( numberOfStudent + " " +s1.name + " " + s1.age);

        Student s2 = new Student();
        s2.name = "Elif";
        s2.age =  23;
        System.out.println( numberOfStudent + " " +s2.name + " " + s2.age);

        //2. yolla tanimlama
        Student s3 = new Student("Ahmet", 41);
        System.out.println( numberOfStudent + " " +s3.name + " " + s3.age);


        System.out.println(s1.age);

        System.out.println(add(3,4));

        Selamlama();

    }




    public static int add(int a, int b) {

        return a+b;
    }

    public static void Selamlama() {
        System.out.println("merhabalar");
    }
}
