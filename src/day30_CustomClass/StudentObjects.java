package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setInfo("Aygun", 'F', 39, 2210, 'A');

        Student student2 = new Student();
        student2.setInfo("Hulya", 'F', 29, 1458, 'B');

        Student student3 = new Student();
        student3.setInfo("Mehmet", 'M', 19, 8523, 'C');

        Student student4 = new Student();
        student4.setInfo("Gokhan", 'M', 49, 9631, 'A');

        Student student5 = new Student();
        student5.setInfo("Nalan", 'F', 59, 7410, 'F');

        Student[] students = {student1, student2, student3, student4, student5};
        int countearly = 0;
        int countangry= 0;
        boolean isEligible = true;
        ArrayList<Student> earlyBirds = new ArrayList<>();
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student each : students) {
            if (each.grade == 'A') {
                earlyBirds.add(each);
                countearly++;
            } else {
                angryBirds.add(each);
                countangry++;
            }


        }
        System.out.println("earlyBirds = " + countearly + " " + earlyBirds);
        System.out.println("angryBirds = " + countangry+ " "+ angryBirds);
    }
}
