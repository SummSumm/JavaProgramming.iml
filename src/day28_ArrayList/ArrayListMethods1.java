package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>();

        //add and insert
numbers.add(5);
numbers.add(500);
numbers.add(5000);

numbers.add(1,50); //

        System.out.println(numbers);

        //get

        System.out.println(numbers.get(3)); // --> will get hte number at index 3
Integer num = numbers.get(3); // --> int e de verebilirdik
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("--------------------------------");
        ArrayList <String> list = new ArrayList<>();
        list.add("hi");
        list.add("hello");
        list.add("hola");
        list.add("bonjour");

        list.set(1, "merhaba");
        System.out.println(list);

        list.add(2, "hallo");
        System.out.println(list);

        System.out.println("-------------------------------------");
        ArrayList <String> employees = new ArrayList<>();
        employees. add("Ayse");
        employees.add("Ece");
        employees.add("Hasibe");
        employees.add("Sonay");
        employees.add("Sumeyye");

        employees.remove(4);
        System.out.println(employees);
        // mesela loop yapıp 0ı sil dersen baştaki gider her seferinde
        employees.remove("Sonay");
        System.out.println(employees);
    }

}
