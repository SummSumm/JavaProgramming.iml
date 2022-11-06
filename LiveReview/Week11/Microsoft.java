package Week11;
import java.util.Arrays;
public class Microsoft {
    public static void main(String[] args) {

        Employee[] testers = {
                new Employee("Reyhan", "QA", 12345, 250000),
                new Employee("Mehmet", "SDET", 8520, 270000),
                new Employee("Rumeysa", "QA", 96341, 250000)
        }; //  putting employees in an array

        Employee employee1 = new Employee();
        employee1.name="Ahmet"; /// şeklinde diğerlerini de ekleriz

        double max = Double.MIN_VALUE;
        for (Employee each : testers) {
         //   System.out.println(each.asString()); - bende bu as String çalışmadı
            if (each.salary > max) {
                max = each.salary;
            }
        }
        System.out.println(max);
        System.out.println(testers[0].name);
    }
}
