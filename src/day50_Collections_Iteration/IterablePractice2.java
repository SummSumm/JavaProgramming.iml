package day50_Collections_Iteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterablePractice2 {
    public static void main(String[] args) {
        List <String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed", "AHmed", "ahMed", "Ercan", "Daniel"));
        // remove all ahmeds

        names.removeIf(name -> name.equalsIgnoreCase("Ahmed"));
        System.out.println("names = " + names);
    }
}
