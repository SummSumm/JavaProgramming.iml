package day31_Constructors;

public class Student {

    public String name;
    public int age;
    public int ID;
    public char gender;
    public char score;

    public Student (String name, int age, int ID, char gender, char score) {
        this.age=age;
        this.gender=gender;
        this.score=score;
        this.name=name;
        this.ID=ID;

    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                ", gender=" + gender +
                ", score=" + score +
                '}';
    }
}
