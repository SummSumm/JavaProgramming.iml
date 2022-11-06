package day44and45_OOPAbstraction_Interface.Animal;

public abstract class Animal {
    private String name;
    private final String breed;  // first gives compile error because they need to be set
    private final String gender;
    private int age;
    private String size;
    private final String colour;

    public final static boolean canBreathe = true;

    public Animal(String name, String breed, String gender, int age, String size, String colour) {
        setName(name);
        this.breed = breed;
        if (!(gender.equals("male") || gender.equals("female"))) {
            throw new RuntimeException("Invalid gender");
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new RuntimeException("Invalid name");
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
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

    public String getColour() {
        return colour;
    }

    public void drink() {
        System.out.println(getName() + " is drinking water.");
    }

    public abstract void eat();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}

