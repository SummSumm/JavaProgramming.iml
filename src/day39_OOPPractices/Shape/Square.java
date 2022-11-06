package day39_OOPPractices.Shape;

public class Square extends Shape{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0) {
            System.err.println("Invalid");
            System.exit(1);
        }
        this.side = side;
    }

// FIRST variables, getter, setter THEN extends + super --> add instance variables to parameters and in argument
    public Square(double side) {
        super("square");
        setSide(side);
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
