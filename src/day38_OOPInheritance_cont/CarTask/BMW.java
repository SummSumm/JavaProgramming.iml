package day38_OOPInheritance_cont.CarTask;

public class BMW extends Car{
    public BMW(String model, String colour, int year, double price, double miles) {
        super("BMW", model, colour, year, price, miles);
    }

    public void breakDown() {
        System.out.println(brand + " " + model + " broke down");
    }

    public void race () {
        System.out.println(brand + " " + model + " is a racing car.");
    }

    public void start() {
        System.out.println("Call mechnanic to start " + brand + " " + model);
    }
}
