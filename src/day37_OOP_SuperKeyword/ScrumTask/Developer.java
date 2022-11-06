package day37_OOP_SuperKeyword.ScrumTask;

public class Developer extends Employee {
    public Developer(String name, int age, char gender, String jobTitle, double salary, int ID, String companyName) {
        super(name, age, gender, jobTitle, salary, ID, companyName);
    }


    public void writeCode(String progLang) {
        System.out.println(name + " is writing codes on " + progLang);
    }
}
