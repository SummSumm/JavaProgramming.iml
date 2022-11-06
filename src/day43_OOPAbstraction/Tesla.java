package day43_OOPAbstraction;

public final class Tesla extends Car {
    @Override
    public void start() {
        System.out.println("Say 'start'");
    }

    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

}
