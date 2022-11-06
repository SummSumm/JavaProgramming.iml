package day38_OOPInheritance_cont.CarTask;

public class Tesla extends Car {
    public Tesla(String model, String colour, int year, double price, double miles) {
        super("Tesla", model, colour, year, price, miles);
    }

    public void autoPilot () {
        System.out.println(brand + " " + model + " is on auto pilot.");
    }

    public void start() {
        System.out.println("Voice recognition activated. Please say START");
    }
}
