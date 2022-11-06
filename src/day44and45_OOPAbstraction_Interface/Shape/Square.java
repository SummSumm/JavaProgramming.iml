package day44and45_OOPAbstraction_Interface.Shape;

public class Square extends Shape implements Volume {

    private double side;

    public Square(double side) {
        super("Square");
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
                "area=" + area ()+
                "perimeter=" + perimeter()+
                '}';
    }

    @Override
    public double volume() {
        return side*side*side;
    }
}
