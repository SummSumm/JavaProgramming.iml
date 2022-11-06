package day37_OOP_SuperKeyword.ScrumTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, String jobTitle, double salary, int ID, String companyName) {
        super(name, age, gender, jobTitle, salary, ID, companyName);
    }

    public void createTicket () {
        System.out.println(name + " has created a ticket. ");
    }
}
