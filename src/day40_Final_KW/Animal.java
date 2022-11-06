package day40_Final_KW;

public class Animal {
    private String name;
    private final String breed;
    private final String gender;
    private final String colour;
    private int age;
    private String  size;

    public Animal(String name, String breed, String gender, String colour, int age, String size) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.colour = colour;
        this.age = age;
        this.size = size;
    }

    //you gan GET final info but not SET it


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
    }

    public String getColour() {
        return colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


//    ----------------METHODS---------------------
    //cant make this one final, they eat different things
public void eat() {
    System.out.println(name + " is eating");
}

public final void drinkWater () {
    System.out.println(name + " is drinking water.");
}

}
