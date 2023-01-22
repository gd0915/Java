package selfpractices.selfpractice_static;

public class Student_Slide123 {

    int number;
    String name;
    static String college = "ITS";

    Student_Slide123(int r, String n, String college){
        this.number=r;
        this.name=n;
        this.college=college;
    }

    public static void main(String[] args) {

        Student_Slide123 s1 = new Student_Slide123(111,"Karan","MIT");
        Student_Slide123 s2 = new Student_Slide123(222,"Aryan","Harvard");

        System.out.println(s1.number);//111
        System.out.println(s2.number);//222
        System.out.println(s1.name);//Karan
        System.out.println(s2.name);//Aryan
        System.out.println(s1.college);//Harvard
        System.out.println(s2.college);//Harvard


    }
}
