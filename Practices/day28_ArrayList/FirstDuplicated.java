package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicated {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 3, 4, 4, 5, 6, 6, 7));

        for (int i = 0; i < list.size(); i++) {
            int count = 0;
           // int each = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    count++;
                }
                }
            if (count > 1) {
                System.out.println(list.get(i));
                break;
            }
        }
    }
}

/*
7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2
 */

/*


 */