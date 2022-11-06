package day38_OOPInheritance_cont.CarTask;

public class Car {
    public String brand, model, colour;
    public int year;
    public double price, miles;

    public Car(String brand, String model, String colour, int year, double price, double miles) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.year = year;
        this.price = price;
        this.miles = miles;
    }

    public void start() {
        System.out.println(brand + " " + model + " is starting");
    }

    public void drive() {
        System.out.println(brand + " " + model + " is driving");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", miles=" + miles +
                '}';
    }
}
