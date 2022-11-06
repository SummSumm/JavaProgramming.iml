package day30_CustomClass;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("Mariana", 35, 45698, 'F', "CEO", 100000, true);
        employee2.setInfo("Ahmet", 45, 12345, 'M', "Manager", 75000, true);
        employee3.setInfo("Elsa", 25, 78520, 'F', "Intern", 33000, false);
        employee4.setInfo("Matt", 55, 46258, 'M', "Senior", 55000, true);
        employee5.setInfo("Niel", 65, 17935, 'M', "Retired", 45000, false);


        Employee [] employees = {employee1, employee2, employee3, employee4, employee5};

        int countFulltime = 0;
        int countParttime = 0;
        double max = employees [0].salary;
        double min = employees [0].salary;

        for (Employee each : employees) {
            if (each.isFulltime) {
                countFulltime++;
            } else {
                countParttime++;
            }

            if (each.salary>max) {
                max=each.salary;
            }
            if (each.salary<min) {
                min = each.salary;
            }
        }
        System.out.println("countParttime = " + countParttime);
        System.out.println("countFulltime = " + countFulltime);
        System.out.println("min = " + min);
        System.out.println("max = " + max);





    }


}
