package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        String name = "";
        int maxSalary = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String eachName = pair.getKey();
            int eachSalary = pair.getValue();

            if (eachSalary>maxSalary) {
                maxSalary = eachSalary;
                name = eachName;
            }
        }
        System.out.println("name of person with highest salary= " + name);

        //Increase the salary of each employee by 10k if current salary is below 120k
        for (Map.Entry<String, Integer> eachpair : map.entrySet()) {
            if ((eachpair.getValue())<120000) {
                eachpair.setValue(eachpair.getValue()+10000);
            }
        }
        System.out.println("Each person and salary = " + map);

    }
}
