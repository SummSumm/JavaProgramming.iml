package day39_OOPPractices.Shape;

public class ShapeObjects {
    public static void main(String[] args) {

        Square s1 = new Square(5);
        System.out.println(s1);

        s1.setSide(6);
        System.out.println(s1);
        System.out.println();

        Rectangle r1 = new Rectangle(4,8);
        System.out.println(r1);

        r1.setWidth(7);
        System.out.println(r1);
        System.out.println();

        Circle c1 = new Circle(8);
        System.out.println(c1);

        c1.setRadius(-2);
        System.out.println(c1);


    }
}
