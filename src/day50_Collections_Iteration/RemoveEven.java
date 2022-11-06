package day50_Collections_Iteration;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveEven {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5,6,100, 90, 80, 75, 45, 35, 25, 15));
     //   set.removeIf(number -> number%2==0);
     //   System.out.println("set = " + set);

        Iterator<Integer> it =  set.iterator();
        while (it.hasNext()) {
            if (it.next()%2==0) {
                it.remove();
            }
        }
        System.out.println("set with no evens= " + set);
    }
}
