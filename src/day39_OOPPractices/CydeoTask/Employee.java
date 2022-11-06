package day39_OOPPractices.CydeoTask;

public class Employee extends Person {

    private int ID;
    private String jobTitle;
    private double salary;

    public Employee(String name, String gender, int age, int ID, String jobTitle, double salary) {
        super(name, gender, age);
        setID(ID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work () {
        System.out.println(getName() + " is working.");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name=" + getName() +
                ", age=" + getAge() +
                ", salary=" + getGender() +

                '}';
    }
}
