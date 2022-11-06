package day39_OOPPractices.CydeoTask;

public class teacher extends Employee{


    public teacher(String name, String gender, int age, int ID, String jobTitle, double salary) {
        super(name, gender, age, ID, jobTitle, salary);
    }

    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is teaching");
    }
}
