package day44and45_OOPAbstraction_Interface.Shape;

public class Circle extends Shape {

    private double radius;
    public final static double pi=3.14;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<0) {
            throw new RuntimeException("Invalid " + radius);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return radius*2*pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString()+
                "radius=" + radius +
                '}';
    }

    }
