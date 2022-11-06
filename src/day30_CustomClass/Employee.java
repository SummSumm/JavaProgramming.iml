package day30_CustomClass;

public class Employee {

    public String name;
    public int age;
    public int ID;
    public char gender;
    public String jobTitle;
    public double salary;
    public boolean isFulltime;

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", isFulltime=" + isFulltime +
                '}';
    } // generate toString

    public void setInfo(String name, int age, int ID, char gender, String jobTitle, double salary, boolean isFulltime) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFulltime = isFulltime;
    }
    //generate construct

    public void work () {
        System.out.println(jobTitle + " "+ name + " is working.");
    }
}
