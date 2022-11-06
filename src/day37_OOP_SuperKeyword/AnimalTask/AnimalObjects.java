package day37_OOP_SuperKeyword.AnimalTask;

public class AnimalObjects {
    public static void main(String[] args) {


        Dog dog1 = new Dog("Alex", "German Shephard", "big", "brown", 'M', 4);

        System.out.println(dog1);
        dog1.eat();

        Cat cat1 = new Cat("Felix", "Abyssinian", "medium", "white", 'M', 2);

        System.out.println(cat1);
        cat1.meow();

        Parrot parrot1= new Parrot("Toucan", "medium", "colourful", 'F', 2, "colourful");
        System.out.println( parrot1);
        parrot1.talk();
        parrot1.say("Hello");
        parrot1.say(10);
    }
}
