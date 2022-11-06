package day38_OOPInheritance_cont.CarTask;

public class Toyota extends Car{

    public Toyota(String model, String colour, int year, double price, double miles) {
        super("Toyota", model, colour, year, price, miles);
    }

    public void reliable () {
        System.out.println(brand + " "+ model +" is reliable" );
    }

    // instance methods that aren't private or final can be overridden

    public void start () {
        System.out.println("Twist the key to start " + brand + " " + model);

    }

}
