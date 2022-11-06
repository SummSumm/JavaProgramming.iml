package day29_ArrayListCont;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(2, 5, 7, 9, 4, 6));
        Collections.sort(nums);
        System.out.println(nums);

        System.out.println("--------------------");
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A', 'B', 'R', 'p'));
        Collections.reverse(chars);
        System.out.println(chars);

        //SWAP

        ArrayList<Integer> listt = new ArrayList<>();

        listt.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        Collections.swap(listt, 3, 5);
        System.out.println(listt);
        System.out.println("--------------------------------------");
        // MAX & MIN

        int max = Collections.max(listt);
        int min = Collections.min(listt);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("-------------------------------");
        //REPLACE ALL
        ArrayList<Integer> nums2 = new ArrayList<>();

        nums2.addAll(Arrays.asList(10, 20, 30, 40, 50, 60,10));
        Collections.replaceAll(nums2, 10, 100);
        System.out.println(nums2);

        System.out.println("-------------------------------");
       int freq =  Collections.frequency(nums2, 100);
        System.out.println(freq);

        System.out.println("---------------------------");
        ArrayList <String> str = new ArrayList<>();
        str.addAll(Arrays.asList("Java", "Java", "Python", "Python", "C++"));

        int java = Collections.frequency(str, "Java");
        int python =Collections.frequency(str, "Python");

        if (java==python) {
            System.out.println("Java and python are same");
        } else {
            System.out.println("Java and python are NOT same");
        }
    }
}
