package day37_OOP_SuperKeyword.AnimalTask;

public class Parrot extends Animal {

    public String wingColour;

    public Parrot( String breed, String size, String colour, char gender, int age, String wingColour) {
        super("Fantastic", breed, size, colour, gender, age); //  mesela tum parrotların ism fantastic olacaksa burada verebiliriz
        this.wingColour=wingColour;
    }

    public void talk () {
        System.out.println(name + " is talking.");
    }
    public void say( String s) {
        System.out.println(name + " is saying " + s);
    }
    public void say (int count) {
        System.out.println(name  + " is counting up to " + count);
    }
}
