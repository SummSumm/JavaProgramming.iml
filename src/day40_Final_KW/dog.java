package day40_Final_KW;

public final class dog extends Animal {


    public dog(String name, String breed, String gender, String colour, int age, String size) {
        super(name, breed, gender, colour, age, size);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food");
    }
    //drink final oldugu için çağıramıyoruz
    public void bark(){
        System.out.println(getName() + " is barking");
    }
}
