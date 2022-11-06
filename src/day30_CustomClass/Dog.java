package day30_CustomClass;

public class Dog {

    // name age gender breed size colour - attributes for each dog
    //Instance variables - so that they are separate

    public String name;  // each object will have different names --> instance varliabl
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String colour;

    // To have each object to do these separately, DO NOT do it static -->instance method
    // eat () play () bark () - methods of objects
    public void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    public void bark() {
        System.out.println(name + " is barking");
    }
public void setInfo (String dogName, String dogBreed, String dogSize, String dogColour, int dogAge, char dogGender) {
        name=dogName;
        breed= dogBreed;
        size=dogSize;
        colour=dogColour;
        age=dogAge;
        gender=dogGender;
}

}
