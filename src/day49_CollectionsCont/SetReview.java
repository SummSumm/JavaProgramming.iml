package day49_CollectionsCont;

import java.util.*;

public class SetReview {
    public static void main(String[] args) {
        Set <Integer> hashSet = new HashSet<>(); // --> fastest
        hashSet.addAll(Arrays.asList(10,200,300,40,90)); // no duplicates, no order
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("hashSet = " + hashSet);


        Set <Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.addAll(Arrays.asList(10,200,300,40,90)); // no duplicates, order of insertion
        linkedSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedSet.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("linkedSet = " + linkedSet);


        Set <Integer> treeSet = new TreeSet<>();// also sorts
        treeSet.addAll(Arrays.asList(10,200,300,40,90)); // no duplicates, sorted
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("treeSet = " + treeSet);

    }
}
