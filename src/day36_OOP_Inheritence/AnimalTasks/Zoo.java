package day36_OOP_Inheritence.AnimalTasks;

public class Zoo {
    public static void main(String[] args) {


        Dog dog1 = new Dog();
        dog1.setInfo("Karabas", "Kangal", "large", "Brown", 'F', 3);

        dog1.eat();
        dog1. drink();
        dog1.bark();
        dog1.sleep();
        dog1.move();
        System.out.println(dog1);

        Cat cat1 = new Cat();
        cat1.setInfo("Shakespeare", "Siyamese", "medium", "white", 'M', 2);

        cat1.eat();
        cat1.sleep();
        cat1.drink();
        cat1.move();
        cat1.meows();
        System.out.println(cat1);

        Tiger tiger1 = new Tiger();

        tiger1.setInfo("Sher Khan", "Bengal", "large", "brown", 'M', 4);
        tiger1.eat();
        tiger1.drink();
        tiger1.sleep();
        tiger1.move();
        tiger1.roars();
        System.out.println(tiger1);
    }
}
