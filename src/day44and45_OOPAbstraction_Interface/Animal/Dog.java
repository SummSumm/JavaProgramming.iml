package day44and45_OOPAbstraction_Interface.Animal;

public final class Dog extends Animal implements playable {
    public Dog(String name, String breed, String gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    public void bark () {
        System.out.println(getName() + " is barking");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating a bone.");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing with a toy.");
    }
}
