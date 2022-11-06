package day21_Array_For_Each;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        String [] words = {"Java Programming", "Cydeo School", "WoodenSpoon", "Early Birds", "Angry Birds"};
        for (String groups : words) {
            System.out.println(""+ groups.charAt(0)+ groups.charAt(groups.length()-1)); // başına "" koy. Stringe çevirmeyi unutma

        }


    }
}
