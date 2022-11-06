package day29_ArrayListCont;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class nthlargestnumber {
    public static void main(String[] args) {
// finding the Nth maximum number. Maxlardan kurtulacağız.
// let's find thr 5th max. number
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int n = 5;

        //list.removeIf(p -> p==max);  // removes first max
        //list.removeIf(p -> p==max);  // removes second max
        //list.removeIf(p -> p==max);  // removes third max
        //list.removeIf(p -> p==max);  // removes fourth max
        // OR we can create a loop

        for (int i = 1; i < n; i++){
            list.removeIf(p -> Collections.max(list) == p);
        }
        int max = Collections.max(list);
        System.out.println(max);


    }

}
