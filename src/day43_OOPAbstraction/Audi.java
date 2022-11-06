package day43_OOPAbstraction;

public final class Audi extends Car {
    @Override
    public void start() {
        System.out.println("Push the button");
    }

    public Audi(String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }
public void AutoPark () {
    System.out.println(getBrand() +" "+ getModel() + " " + "has autopark feature");
}

}
