package day51_Map;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {


        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Arthur");
        hashMap.put(2, "Brian");
        hashMap.put(3, "Callum");   // this one becomes null
        hashMap.put(3, "Danielle");
        hashMap.put(4, "Danielle");
        System.out.println("hashMap = " + hashMap);

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "Arthur");
        linkedHashMap.put(2, "Brian");
        linkedHashMap.put(3, "Callum");   // this one becomes null
        linkedHashMap.put(3, "Danielle");
        linkedHashMap.put(4, "Danielle");
        System.out.println("linkedHashMap = " + linkedHashMap);

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Arthur");
        treeMap.put(2, "Brian");
        treeMap.put(3, "Callum");   // this one becomes null
        treeMap.put(3, "Danielle");
        treeMap.put(4, "Danielle");
        System.out.println("treeMap = " + treeMap);

        Map<Integer, String> hashTable = new Hashtable<>();
        hashTable.put(1, "Arthur");
        hashTable.put(2, "Brian");
        hashTable.put(3, "Callum");   // this one becomes null
        hashTable.put(3, "Danielle");
        hashTable.put(4, "Danielle");
        System.out.println("hashTable = " + hashTable);
    }
}
