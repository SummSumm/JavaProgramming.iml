package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {


    Student student1= new Student("Hale", 14, 125896, 'F', 'B');
    Student student2 = new Student("Ali", 15, 2598, 'M', 'C');

    Student [] students = {student1, student2};

    ArrayList <Student> studentList = new ArrayList<Student>(Arrays.asList(students));
    studentList.removeIf(p -> p.gender=='M');
        System.out.println(studentList);

}
}
