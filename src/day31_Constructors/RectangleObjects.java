package day31_Constructors;

public class RectangleObjects {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 6);
        Rectangle rectangle2= new Rectangle(5.5, 9.5);

        System.out.println("Rectangle 1 area: " + rectangle1.calculateArea());
        System.out.println("Rectangle 1 perimeter: " + rectangle1.calculatePerimeter());
        System.out.println("Rectangle 2 area: " + rectangle2.calculateArea());
        System.out.println("Rectangle 2 perimeter: " + rectangle2.calculatePerimeter());
    }
}
