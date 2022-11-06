package day33_Constructors_Static;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1 = new Student("Daphne");
        Student student2 = new Student("Daphne", 'F');
        Student student3 = new Student("Daphne", 'F', 'B');
        Student student4 = new Student("Daphne", 'F', 'B', 19);
        Student student5 = new Student("Daphne", 'F', 'B', 19, 456987123);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);

        Student  [] students = {student1, student3, student2, student4, student5};
        System.out.println(Arrays.toString(students));
        
        System.out.println();

    }
}
