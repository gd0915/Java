package selfpractices.selfpractice_constructor;

public class Students {

    String name;
    int age;
    String phone;

    Students() {}
    Students(String name, int age, String phone){
        this.phone =phone;
        this.name = name;
    }

    public static void main(String[] args) {

        Students s1 = new Students();
        Students s2 = new Students("John", 25, "029-998877");
        System.out.println(s2.name + ", " + s2.age + ", " + s2.phone); //John, 0, 029-998877
    }

}
