package day39_OOPPractices.CydeoTask;

public class Person {
    private String name, gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.startsWith("ğ")) {
            System.err.println("Invalid");
            System.exit(1);
        }

        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0 || age>120) {
            System.err.println("Invalid");
            System.err.println(1);
        }
        this.age = age;
    }

    public Person(String name, String gender, int age) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void drink () {
        System.out.println(name + " is drinking");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
