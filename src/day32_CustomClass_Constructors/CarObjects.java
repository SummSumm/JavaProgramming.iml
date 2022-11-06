package day32_CustomClass_Constructors;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota");
        Car car2 = new Car("Toyota", "Corolla");
        Car car3 =  new Car("Toyota", "Corolla", 2020);
        Car car4 = new Car("Toyota", "Corolla", 2020, 250000);
        Car car5 = new Car("Toyota", "Corolla", 2020, 250000, "white");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
