package day33_Constructors_Static;

import day30_CustomClass.Employee;

public class Employee_Objects {
    public static void main(String[] args) {


        Employee_Static employee1 = new Employee_Static();
        employee1.name = "Ahmet";
        employee1.salary= 150000;

        Employee_Static employee2 = new Employee_Static();
        employee2.name = "Ziya";
        employee2.salary = 200000;

        System.out.println(employee1.name + " and " + employee2.name); //  ikisi de Ziya çünkü static oldugu için Ahmet ziyaya donustu
                                                                       // statiki silince Ahme ve Ziya basacak
    }
}
