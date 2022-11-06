package day29_ArrayListCont;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaaabbbcdeefff";
        String [] arr = str.split("");
        //ArrayList <String> list = new ArrayList<>(Arrays.asList(str.split("")));
        ArrayList <String> list = new ArrayList<>(Arrays.asList(arr));

        String uniques = "";

        for (String each: list) {
            int freq = Collections.frequency(list, each);

            if (freq==1) {
               uniques +=each;
            }
        }

        System.out.println("uniques + \" \" = " + uniques + " ");
    }
}
