package day50_Collections_Iteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));
        //remove all lower than 4

        Iterator<Integer> it = numbers.iterator();
        it.hasNext();
        // System.out.println("it.next() = " + it.next());
        //System.out.println("it.next() = " + it.next());
        //System.out.println("it.next() = " + it.next());

     /*   while(it.hasNext()) {
            if (it.next() <4) {
                it.remove();
            }
        }
        System.out.println(numbers);

    }

 */
        numbers.removeIf(each -> each<4);
        System.out.println(numbers);
    }
}
