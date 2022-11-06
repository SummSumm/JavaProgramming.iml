package day37_OOP_SuperKeyword.ScrumTask;

public class BusinessAnalyst extends Employee {
    public BusinessAnalyst(String name, int age, char gender, double salary, int ID, String companyName) {
        super(name, age, gender, "BA", salary, ID, companyName);
    }

    public void analyse (String doc) {
        System.out.println(name + " is checking the " + doc + " document.");
    }
}
