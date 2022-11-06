package day44and45_OOPAbstraction_Interface.Shape;

public class Cube extends Shape {
    private double side;

    public Cube(double side) {
        super("Cube");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side*side*6;
    }

    @Override
    public double perimeter() {
        return side*12;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                super.toString() +
                '}';
    }
}
