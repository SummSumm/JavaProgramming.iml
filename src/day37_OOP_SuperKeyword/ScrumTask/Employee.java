package day37_OOP_SuperKeyword.ScrumTask;

public class Employee extends Person {
    public String jobTitle;
    public double salary;
    public int ID;
    public String companyName;



    public Employee(String name, int age, char gender, String jobTitle, double salary, int ID, String companyName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.ID = ID;
        this.companyName = companyName;
    }

    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", ID=" + ID +
                ", companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public void work (int hours) {
        System.out.println(name + " has been working for " + hours + " hours.");
    }
}


