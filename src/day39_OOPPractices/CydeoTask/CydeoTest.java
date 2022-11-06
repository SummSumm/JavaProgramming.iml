package day39_OOPPractices.CydeoTask;

public class CydeoTest {

    public static void main(String[] args) {

        developer d1 = new developer("Ali", "Male", 29, 12345, "dev", 150000);
        tester t1 = new tester("Goliath", "Male", 32, 67890, "SDET", 170000);
        teacher te1 = new teacher("Flora", "Female", 42, 85241, "teacher", 180000);
        student s1 = new student("Takia", "Female", 22, 47896, "SDET");

        System.out.println(d1);
        System.out.println(t1);
        System.out.println(te1);
        System.out.println(s1);
        System.out.println();

        d1.setAge(39);
        d1.fixingBugs();
        System.out.println(d1);
        System.out.println();

        te1.work();
        te1.setJobTitle("Senior Teacher");
        te1.work();


    }
}
