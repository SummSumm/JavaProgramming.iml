package day51_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {
        Map <String, Integer> studentScores = new HashMap<>();
        studentScores.put("Ali", 52);
        studentScores.put("Lale", 52);
        studentScores.put("Talin", 84);
        studentScores.put("Ozan", 60);
        studentScores.put("Giray", 60);

        System.out.println(studentScores);
        System.out.println("Giray = " + studentScores.get("Giray"));
        studentScores.replace("Giray", 64);
        System.out.println("Giray = " + studentScores.get("Giray"));
        studentScores.remove("Lale");
        System.out.println(studentScores);


    }
}
