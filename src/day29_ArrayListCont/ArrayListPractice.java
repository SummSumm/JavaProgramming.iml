package day29_ArrayListCont;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {

        String [] countries = {"Japan", "Australia", "Afghanistan", "Turkey", "Democratic Republic of Congo"};

        ArrayList<String> countries2 = new ArrayList<>(Arrays.asList(countries));

        countries2.removeIf( p -> p.length()>=10);
       // System.out.println(Arrays.asList(countries2));

        //CONVERTING ARRAYLIST back to ARRAY
        countries = countries2.toArray(new String[0]); // write 0, it will arrange
        System.out.println(Arrays.toString(countries));
    }
}
