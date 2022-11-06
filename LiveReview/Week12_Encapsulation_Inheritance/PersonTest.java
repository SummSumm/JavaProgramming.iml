package Week12_Encapsulation_Inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Ayla", "Denizgil", 25);
        System.out.println(p1.getFirstName());
        System.out.println(p1.getLastName());
        System.out.println(p1.getAge());

        //can' change anything atm as there's no setter.
        //p1.firstName= "Oscar"; --> can't do this
    }
}
