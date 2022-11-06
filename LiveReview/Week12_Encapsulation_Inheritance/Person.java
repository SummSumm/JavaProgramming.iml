package Week12_Encapsulation_Inheritance;

public class Person {
    private String firstName, lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    /*public void setFirstName(String firstName) {
        this.firstName = firstName;
    }*/

    public String getLastName() {
        return lastName;
    }

/*    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
*/
    public int getAge() {
        return age;
    }

  /*  public void setAge(int age) {
        this.age = age;
    }
*/
    public Person (){
        firstName="undefined";
        lastName="undefined";
        age=-1;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
    // no setters: the class is read-only
}
