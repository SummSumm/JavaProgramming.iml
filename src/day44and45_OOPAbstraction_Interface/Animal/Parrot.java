package day44and45_OOPAbstraction_Interface.Animal;

public final class Parrot extends Animal{
    public Parrot(String name, String breed, String gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating sunflower seeds.");
    }

    public void fly () {
        System.out.println(getName() + " is flying.");
    }
}
