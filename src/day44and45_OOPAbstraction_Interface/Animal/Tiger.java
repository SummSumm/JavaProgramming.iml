package day44and45_OOPAbstraction_Interface.Animal;

public class Tiger extends Animal implements wild{

    public Tiger(String name, String breed, String gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating a zebra.");
    }


    @Override
    public void hunt() {
        System.out.println(getName() + " is hunting a zebra.");
    }
}
