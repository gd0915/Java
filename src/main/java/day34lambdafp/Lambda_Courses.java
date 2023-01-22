package day34lambdafp;

import lambda_functional_programming.Courses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda_Courses {

     /*
    POJO ==> Plain Old Java Project
    POJO Classes ==> They are like Storage classes. We put our constantly needed variables in POJO Class)
    variables
    getters and setters
    constructors
    toString
     */

    public static void main(String[] args) {
        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
        Courses courseEnglishNight = new Courses("Winter", "English Night", 93, 144);

        List<Courses> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        System.out.println(coursesList);
        System.out.println(checkAverageScoreGreaterThanGivenNumber(coursesList, 92));//true
        System.out.println(checkIfAnyCourseNameContainsGivenWord(coursesList, "German"));//false
        System.out.println(getCourseNameWhoseAvgIsTheHighest(coursesList));//Turkish Night
        System.out.println(sortCourseWithAveScoreInAscendingSkipFirstOne(coursesList, 2));
        //This method skips the ones that come before index 2
        // [season: Summer CourseName: Turkish Day AverageScore: 97 NumberOfStudents : 128,
        // season: Winter CourseName: Turkish Night AverageScore: 98 NumberOfStudents : 154]
        System.out.println(sortCourseWithAveScoreInAscendingPrintAskedOne(coursesList, 2));
        //season: Summer CourseName: Turkish Day AverageScore: 97 NumberOfStudents : 128

    }

    //1)Create a program to check if all average scores are greater than given number

    public static boolean checkAverageScoreGreaterThanGivenNumber(List<Courses> coursesList, double avgScore) {

        return coursesList.stream().allMatch(t -> t.getAverageScore() > avgScore);
    }

    // 2)Create a program to check if at least one of the course names contains given word

    public static boolean checkIfAnyCourseNameContainsGivenWord(List<Courses> list, String word){

        return list.stream().anyMatch(t-> t.getCourseName().contains(word));
    }

    // 3) Create a method to print the course whose average score is the highest

    public static String getCourseNameWhoseAvgIsTheHighest(List<Courses> list) {

        return list.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get().getCourseName();
    }

    // 4) Sort the list element according to the average score in ascending order and skip the first given one

    public static List<Courses> sortCourseWithAveScoreInAscendingSkipFirstOne(List<Courses> list, int num){

        return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(num).collect(Collectors.toList());
    }

    //5) Homework: Sort the list elements according to the average score in ascending order and print just the given one

    public static Courses sortCourseWithAveScoreInAscendingPrintAskedOne(List<Courses> list, int num){

        return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).collect(Collectors.toList()).get(num);

    }






}
