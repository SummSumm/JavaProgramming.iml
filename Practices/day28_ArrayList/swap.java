package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class swap {
    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(arr));

      //  int first = array.get(0);
      //  int last = array.get(array.size() - 1);
        int temp = array.get(0);  // 1
        array.set(0, array.size());
        array.set(array.size() - 1, temp);

        System.out.println(array);

    }
}