package day29_ArrayListCont;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        list.removeIf(p -> p<5); // will remove eveything under 5
        System.out.println("Remove everything under 5");
        System.out.println(list);


        ArrayList <Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        nums.removeIf(p -> p%2==0);

        System.out.println("Remove all evens");
        System.out.println(nums);

        System.out.println("-------------------------");
        ArrayList <String> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList("Java", "Python", "JavaScript", "Jason", "C++", "hello"));

        // remove all elements that start with J

        list2. removeIf( p -> p.startsWith("J"));
        System.out.println(list2);

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "level", "hannah", "danny"));
        names.removeIf( p -> StringUtility.isPalindrome(p));

        System.out.println(names);

    }
}
