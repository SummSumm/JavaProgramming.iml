package day51_Map;

import java.util.*;

public class MapPractices4 {
    public static void main(String[] args) {

        /*
        String[] group1 = {"Duygu","Magda","Farangez","Edison","Kerem","Farangis"};
        String[] group2 = {"Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"};
        String[] group9 = {"Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem"};
        String[] group24= {"Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas"};
        String[] group5 = {"Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene"};
 System.out.println(Arrays.toString(groups.get(1)));
     */

        // we use array list so that we don't have to use t string all the time
        ArrayList<String> group1 = new ArrayList<>(Arrays.asList("Duygu", "Magda", "Farangez", "Edison", "Kerem", "Farangis"));
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList("Margie", "Vesele", "Iryn", "Nilufar", "Aziza", "Nurcan", "Raika", "Igor", "Elif", "Sana", "Azamat"));
        ArrayList<String> group9 = new ArrayList<>(Arrays.asList("Alex", "Ali", "Andriy", "Cassandra", "Sevgul", "Olha", "Tito", "Ozan", "Serkan", "Furkan", "Madina", "Muharrem"));
        ArrayList<String> group24 = new ArrayList<>(Arrays.asList("Maria", "Kristina", "Amin", "George", "Layan", "Amin", "Yulia", "George", "Ayanle", "Maxim", "Nermin", "Doughlas"));
        ArrayList<String> group5 = new ArrayList<>(Arrays.asList("Nazar", "Veronika", "Mikael", "Layla", "Badmaa", "Zaeir", "Anna", "Tamara", "Eugene"));

        //pair IDs and names of Sts
        Map<Integer, ArrayList<String>> groups = new TreeMap<>();
        groups.put(1, group1);
        groups.put(2, group2);
        groups.put(9, group9);
        groups.put(24, group24);
        groups.put(5, group5);

        System.out.println(groups);

        // Tamamını çıkarır:     System.out.println(groups.get(3));

        for (String each : groups.get(24)) {     // bu tek tek satır satır yazdırır
            System.out.println(each);
        }

        System.out.println((groups.get(2)).get(1));
        //    this part gives an array list   .   get gets the index

        System.out.println("---------------------------------------------------------------");
        // all the values: (groups.values())

        for (ArrayList<String> eachgroup : (groups.values())) {
            for (String eachName : eachgroup) {
                System.out.println(eachName);
                
            }

        }

    }


}
