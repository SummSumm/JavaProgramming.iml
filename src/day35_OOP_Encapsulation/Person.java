package day35_OOP_Encapsulation;

public class Person {
    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman;
    public static boolean hasNose;
    public static int numberOFWings;
    public static int numberOfHead;

    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOFWings = 0;
        numberOfHead = 1;
    }

    public static void printPlanetName () {
        System.out.println("planet name is= " + planet);
    }
    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }
    public void drink (String beverage) {
        System.out.println(name + " is drinking " + beverage);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                '}';
    }
}
