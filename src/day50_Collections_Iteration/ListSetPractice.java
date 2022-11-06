package day50_Collections_Iteration;

import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {

        Set <Integer> set = new HashSet<>();
        set. addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println(set);

        List <Integer> set2 = new ArrayList<>(set);
        System.out.println(set2.get(4));

        System.out.println("------------------");
        List <Character> characters = new Stack<>();
        characters.addAll(Arrays.asList('A','B', 'C', 'D'));

        System.out.println("characters = " + characters);

        ((Stack)characters).pop(); // last one will go
        System.out.println("characters = " + characters);
        System.out.println("------------------");

        List <String> names = new LinkedList<>();
        names.addAll(Arrays.asList("Ali","Ayla", "Ceyda","Yeşim", "Perla"));
        ((LinkedList)names).poll();
        System.out.println("names = " + names);


    }
}
