package day52_Maps_Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Unique_Characters {
    public static void main(String[] args) {
        String str = "aabbbbbbcddde";
        String [] strA = str.split("");


        Map<String, Integer> result = new LinkedHashMap<>();
        for (String each : strA) {
            int frequency = Collections.frequency(Arrays.asList(strA), each);

            if (frequency==1) {
                result.put(each, frequency);
            }
        }
        System.out.println(result);




    }
}
