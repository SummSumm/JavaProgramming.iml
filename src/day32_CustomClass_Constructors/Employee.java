package day32_CustomClass_Constructors;

public class Employee {
    public String name, jobtitle;
    public char gender;
    public double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, char gender) {
        // this.name = name; bu şekilde tekrar yazmaytalım, yukarıda metodu var; onu alalım
        this(name); // we called the constructor
        this.gender = gender;
    }

    public Employee(String name, char gender, String jobtitle) {
        this(name, gender);
        this.jobtitle = jobtitle;
    }

    public Employee(String name, char gender, String jobTitle, double salary) {
        this(name, gender, jobTitle);
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}
