package day33_Constructors_Static;

public class Student {
    public String name;
    public char gender, grade;
    public int age, ID;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Student(String name, char gender, char grade) {
        this(name, gender);
        this.grade = grade;
    }

    public Student(String name, char gender, char grade, int age) {
        this(name, gender, grade);
        this.age = age;
    }

    public Student(String name, char gender, char grade, int age, int ID) {
        this(name, gender, grade, age);
        this.ID = ID;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", age=" + age +
                ", ID=" + ID +
                '}';
    }
}
