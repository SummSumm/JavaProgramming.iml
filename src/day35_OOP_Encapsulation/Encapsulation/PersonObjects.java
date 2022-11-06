package day35_OOP_Encapsulation.Encapsulation;

public class PersonObjects {
    public static void main(String[] args) {


        Person p1 = new Person();
        //p1.name="Daniel";
        //p1.age = 26; --> gives compile error bc they're private. We need to set them

        p1.setName("Daniel");
        p1.setAge(26);

        System.out.println(p1.getName() + ": " + p1.getAge());
    }
}
