package day51_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyofCharacters {
    public static void main(String[] args) {
        String str = "bbcccaaaaa";
        //bca
        //235 --> collections utility --> requires conversion

        String [] arr = str.split("");

        Map <String, Integer> result = new LinkedHashMap<>(0); // linked automatically eliminates duplicates

        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr), each);
            result.put(each, frequency);

        }
        System.out.println(result);



    }
}
/*
Write a program that can return the frequency of characters
        Not: MUST use map
        Ex: str = "bbcccaaaaa"
        output:
            {b=2, c=3, a=5}
 */