package day36_OOP_Inheritence;

public class StudentObject {
    public static void main(String[] args) {
        Student st1 = new Student("Lila", 15, 'F', 'A', "Dobson High");

        st1.setAge(16); // changes age
        System.out.println(st1);

    }
}
