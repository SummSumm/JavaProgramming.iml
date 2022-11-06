package day29_ArrayListCont;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> unique = new ArrayList<>();

        list1.addAll(Arrays.asList(1, 2, 3, 3, 4, 5, 2, 3, 6, 5, 6, 7, 8, 1));

        for (int each : list1) {
            int freq = Collections.frequency(list1, each);
            if (freq==1) {
                unique.add(each);
            }
        }
        System.out.println(unique);
        System.out.println("----------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 3, 4, 5, 2, 3, 6, 5, 6, 7, 8, 1));


        list2.removeIf(p -> Collections.frequency(list2,p)>1);
        System.out.println(list2);

    }
}
