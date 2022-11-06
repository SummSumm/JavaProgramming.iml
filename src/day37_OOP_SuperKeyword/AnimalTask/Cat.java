package day37_OOP_SuperKeyword.AnimalTask;

public class Cat extends Animal {

    public Cat(String name, String breed, String size, String colour, char gender, int age) {
        super(name, breed, size, colour, gender, age);
    }

    public void meow () {
        System.out.println(name + " is meowing.");
    }
}
