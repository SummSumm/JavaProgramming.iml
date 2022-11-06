package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> multiply = new ArrayList<>();
        multiply.add(10);
        multiply.add(20);
        multiply.add(30);
        multiply.add(40);
        multiply.add(50);

        for (int i = 0; i < multiply.size(); i++) {
            multiply.set(i, multiply.get(i)*2);
        }
        System.out.println(multiply);
        System.out.println("--------------------------------");
    }

}
