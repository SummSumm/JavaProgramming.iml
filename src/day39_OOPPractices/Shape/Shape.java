package day39_OOPPractices.Shape;

public class Shape {
    private String name;

    public String getName() {
        return name;
    }                            // getter

    public void setName(String name) {
        if (name == null) {
            System.err.println("Invalid");
            System.exit(1);                // there was a problem
        }

        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid");
            System.exit(1);
        }

        this.name = name;
    }                              // setter

    public Shape(String name) {
        setName(name);
    }                        // constructor

    public double area() {            // we have to do it this way = not empty --> abstraction will solve this problem
        return 0;
    }

    public double perimeter() {            // we have to do it this way = not empty --> abstraction will solve this problem
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area () + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
