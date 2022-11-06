package day39_OOPPractices.CydeoTask;

public class developer  extends Employee{

    public developer(String name, String gender, int age, int ID, String jobTitle, double salary) {
        super(name, gender, age, ID, jobTitle, salary);
    }

    public void fixingBugs () {
        System.out.println(getJobTitle() + " " + getName() + " is fixing bugs");
    }

    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is working");
    }
}
