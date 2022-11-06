package day36_OOP_Inheritence;

public class Student {
    private String name;
    private int age;
    private char gender, grade;
    private  String schoolName;

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade='" + grade + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int  getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 5 || age > 90) {
            System.exit(0);
        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void  setGender(final char gender) {

        if (!(gender == 'M' || gender== 'F')) {
            System.exit(0);
        }
        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (!(grade=='A') || (grade=='B') || (grade=='C') || (grade=='D') || (grade=='F')) {
            System.exit(0);
        }

        this.grade = grade;
    }

    public void setSchoolName (String schoolName) {
        this.schoolName=schoolName;
    }

    public void study(String name) {
        System.out.println(name + " is studying");
    }
}
