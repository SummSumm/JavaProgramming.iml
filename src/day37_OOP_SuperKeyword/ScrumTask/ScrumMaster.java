package day37_OOP_SuperKeyword.ScrumTask;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, int age, char gender, double salary, int ID, String companyName) {
        super(name, age, gender, "SM", salary, ID, companyName); //  yukarıda çıkartıp buraya SM yazdık
    }

    public void organizeMeeting () {
        System.out.println(name + " has organized a meeting.");
    }
}
