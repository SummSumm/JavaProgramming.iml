package day29_ArrayListCont;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        //First turn all into collection type --> Arrays.asList
        //addAll
        ArrayList <Integer> list = new ArrayList<>();
        // first turn into collection  --> Arrays.asList
        list.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(list);
        //removeAll - removes given elements
        list.removeAll(Arrays.asList(2,3)); // takes these out
        System.out.println(list);

        // retainAll - retains given elements only
        list.retainAll(Arrays.asList(4,5,6));
        System.out.println(list);

        //containsAll
        ArrayList <String> jobs = new ArrayList<>();

        jobs.addAll(Arrays.asList("QA", "SDET", "SM", "PM", "PO", "QA", "QA", "SDET"));
        // keep only QA and SDET
      boolean job =  jobs.containsAll(Arrays.asList("QA", "SDET"));
        System.out.println(job);
    }
}
