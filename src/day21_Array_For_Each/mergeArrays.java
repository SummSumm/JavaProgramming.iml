package day21_Array_For_Each;

import java.util.Arrays;

public class mergeArrays {
    public static void main(String[] args) {
        String [] a = {"1", "2", "3"};
        String [] b = {"4", "5"};

        int i = 0;
        String [] c = new String [a.length + b.length];

        for (String each: a ) {
            c [i++] = each;
        }
        for (String each: b) {
           c [i++] = each;
        }
        System.out.println(Arrays.toString(c));



    }
}