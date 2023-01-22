package selfpractices.selfpractice_constructor;

public class Teacher {

    String name;
    String lastName;
    String subject;
    String teacherID;
    static int year;
    static int order;


    Teacher() {
        System.out.println("No name declared");
    }

    Teacher(String name, String lastName, String subj, int year, int order){
        this.name=name;
        this.lastName= lastName;
        subject =subj;
        this.year=year;
        this.order=order;
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Tom", "Jones", "Math", 2022, 46);
        t1.teacherID = assignID(2018, 46);
        System.out.println(t1.name + " " +  t1.lastName + " " +  t1.subject + " " + t1.teacherID);

        Teacher t2 = new Teacher("Brad", "Pitt", "Art",2019, 19);
        t2.teacherID = assignID(2019, 19);
        System.out.println(t2.name + " " + t2.lastName + " "  + t2.subject + " " +  t2.teacherID);
    }


    public static String assignID(int y, int k){
        y = year;
        k = order;
        String assignID = year + "" + "0000" + "" + order;
        return assignID;
    }






}
