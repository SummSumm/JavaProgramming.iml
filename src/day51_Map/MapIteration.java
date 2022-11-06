package day51_Map;

import com.sun.jdi.IntegerValue;

import java.util.*;

public class MapIteration {
    public static void main(String[] args) {
        Map <String, Integer> studentScores = new HashMap<>();
        studentScores.put("Ali", 52);
        studentScores.put("Lale", 52);
        studentScores.put("Talin", 84);
        studentScores.put("Ozan", 60);
        studentScores.put("Giray", 60);
        System.out.println(studentScores);


        Set <String> studentsKeys = studentScores.keySet();
        System.out.println(studentsKeys);
        for (String eachKey : studentsKeys) {
            Integer eachValue = studentScores.get(eachKey);
            if (eachValue<60) {
                System.out.println("eachKey under 60 = " + eachKey);
            }

        }


        Map <String, Integer> earlyBirds = new HashMap<>();
        Map <String, Integer> angryBirds = new HashMap<>();

        for (String eachKey : studentScores.keySet()) {
            Integer eachValue = studentScores.get(eachKey);// + 5; ile eklenebilir

            if (eachValue>=60) {
                earlyBirds.put(eachKey, eachValue);
            } else {
                angryBirds.put(eachKey,eachValue);
            }

        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);


        // CONVERTING TO A LIST
       List<Integer> scoresList = new ArrayList<>(studentScores.values());
       System.out.println(scoresList);

        //CONVERTING TO COLLECTION: directly


        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;

        for (Integer eachScore : studentScores.values()) {
            if (eachScore>maxScore) {
                maxScore=eachScore;
            }

            if (eachScore<minScore) {
                minScore = eachScore;
            }
        }

        System.out.println("minScore = " + minScore);
        System.out.println("maxScore = " + maxScore);

        // how many sts have above 60 score
        int count =0;

        for (Integer eachScore : studentScores.values()) {
            if (eachScore>=60) {
                count++;
            }
        }
        System.out.println("count of scores equal to and over 60 = " + count);

        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}
