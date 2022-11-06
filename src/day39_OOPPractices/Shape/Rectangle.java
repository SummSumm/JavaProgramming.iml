package day39_OOPPractices.Shape;

public class Rectangle extends Shape {

    private double length, width;



    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<=0) {
            System.err.println("Invalid");
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<=0) {
            System.err.println("Invalid");
            System.exit(1);
        }
        this.width = width;
    }

    public Rectangle(double length, double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return (length*2) + (width*2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
