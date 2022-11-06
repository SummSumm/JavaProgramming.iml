package day35_OOP_Encapsulation.Encapsulation;

public class Employee {
    private String name;
    private int age;
    private char gender;
    private double salary;

    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }

    public char getGender () {
        return gender;
    }

    public double getSalary () {
        return salary;
    }

    public Employee (String name, int age, char gender, double salary) {
        setName(name);
        setAge(age);
        setGender(gender);
        setDouble(salary);
    }

    public void setName (String name){
        if (name.isEmpty()) {
            System.err.println("Name cannot be empty");
            System.exit(0);
        }
        this.name=name;
    }

    public void setAge (int age){
        if (age<1 || age>150) {
            System.err.println("Invalid age");
            System.exit(0);
        }
        this.age=age;
    }

    public void setGender (char gender){
        if (!(gender == 'F' || gender == 'M')) {
            System.err.println("Invalid gender");
            System.exit(0);
        }
        this.gender=gender;
    }

    public void setDouble (double salary){
        if (salary<1) {
            System.err.println("Invalid amount");
            System.exit(0);
        }
        this.salary=salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}
