package day40_Final_KW;

public final class cat extends Animal {
    public cat(String name, String breed, String gender, String colour, int age, String size) {
        super(name, breed, gender, colour, age, size);
    }

    @Override
    public void eat() {
        System.out.println(getName() +  " is eating cat food");
    }
}
