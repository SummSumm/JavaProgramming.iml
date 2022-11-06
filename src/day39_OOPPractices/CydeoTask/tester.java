package day39_OOPPractices.CydeoTask;

public class tester extends Employee{


    public tester(String name, String gender, int age, int ID, String jobTitle, double salary) {
        super(name, gender, age, ID, jobTitle, salary);
    }

    public void createTicket () {
        System.out.println(getJobTitle() + " " + getName() + " created a ticket ");
    }


    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is working");;
    }
}
