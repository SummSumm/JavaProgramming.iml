package day44and45_OOPAbstraction_Interface.Shape;

public class Cylinder extends Shape implements Volume {

    private double radius, height, length;
    public final static double pi=3.14;

    public Cylinder(double radius, double height, double length) {
        super("Cylinder");
      setRadius(radius);
      setHeight(height);
      setLength(length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {

        return ((radius*radius*pi)*2) + (height*height);
    }

    @Override
    public double perimeter() {
        return (height*length)*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                ", length=" + length +
                super.toString() +
                '}';
    }

    @Override
    public double volume() {
        return pi*radius*radius*height;
    }
}
