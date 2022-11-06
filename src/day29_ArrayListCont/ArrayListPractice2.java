package day29_ArrayListCont;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ahmet", "Ali", "Ayşe", "Ayla", "Mehmet", "Mahmut"));

        employees.retainAll(Arrays.asList("Ahmet", "Ayşe"));
        System.out.println(employees);


        String[] names = {"Ahmet", "Ali", "Ayşe", "Ayla", "Mehmet", "Mahmut"};
        ArrayList<String> names2 = new ArrayList<>(Arrays.asList(names));

        names2.removeIf(p -> p.charAt(0) == 'M');
        names = names2.toArray(new String [0]); // BURAYI EZBERLEMELİSİN

        System.out.println(Arrays.toString(names));


    }
}
