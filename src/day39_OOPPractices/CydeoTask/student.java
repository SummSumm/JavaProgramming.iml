package day39_OOPPractices.CydeoTask;

public class student extends Person{

    private int studentID;
    private String field;

    public student(String name, String gender, int age, int studentID, String field) {
        super(name, gender, age);
        setStudentID(studentID);
        setField(field);
    }

    public int getstudentID() {
        return studentID;
    }


    public String getField() {
        return field;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void study () {
        System.out.println(getName() + " is studying");
    }

    public String toString() {
        return "student{" +
                "name" + getName() +
                ", age" + getAge() +
                ", studentID=" + studentID +
                ", field='" + field + '\'' +

                '}';
    }
}

