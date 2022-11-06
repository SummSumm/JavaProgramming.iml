package day35_OOP_Encapsulation.Encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee e1= new Employee("Daniel", 26, 'M', 150000);
        System.out.println(e1);

        e1.setAge(35);  // age will change
        System.out.println(e1);

       e1.setDouble(e1.getSalary()+15000);
        System.out.println(e1.getSalary());

    }
}
