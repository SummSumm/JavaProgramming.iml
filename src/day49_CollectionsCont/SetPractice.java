package day49_CollectionsCont;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        String[] arr = {"Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "coke", "pen"};

        arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]);
        System.out.println(Arrays.toString(arr));

        // keep only 1 wooden Spoon
        //Set <String> stringSet= new HashSet<>(Arrays.asList(arr));
        //System.out.println("stringSet = " + stringSet);

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(100, 300, 1000, 20, 500, 600, 700, 1000, 50, 600, 10, 20, 40, 50, 90));

        System.out.println("list = " + list);

        System.out.println("new LinkedHashSet<>(list) = " + new LinkedHashSet<>(list));

        System.out.println("new SortedSet<>(list) = " + new TreeSet<>(list));
        System.out.println("------------------------------------------");

        String str = "aaabbccccdde";
        String result = "";

        for (String each:new LinkedHashSet<>(Arrays.asList(str.split("")))) {
       int count= Collections.frequency(Arrays.asList(str.split("")), each);
        result += each+count;
        }
        System.out.println("result = " + result);


        System.out.println("------------------------------------------");

        Integer[] nums = {1, 1, 2, 3, 4, 5, 5, 2, 6, 5, 8, 7, 1, 2, 5, 6, 4, 9};
//return 5th element after sorting

        nums = new LinkedHashSet<Integer>(Arrays.asList(nums)).toArray(new Integer[0]); // 0 yazıyoruz hep
        System.out.println(Arrays.toString(nums));
        System.out.println("nums[4] = " + nums[4]);


    }
}
