package day37_OOP_SuperKeyword.ScrumTask;

public class ProductOwner extends Employee {
    public ProductOwner(String name, int age, char gender, double salary, int ID, String companyName) {
        super(name, age, gender, "PO", salary, ID, companyName);
    }

    public void gatherRequirements () {
        System.out.println(name + " has gathered requirements.");
    }
}
