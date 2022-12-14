package day50_Collections_Iteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class RemovePalindromes_NoLambda {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam"));
        Iterator<String> it = names.iterator(); // foru kullanmak için
        while (it.hasNext()) {
            String each = it.next();
            String reversed = "";

            for (int i=each.length()-1; i>=0; i--) {
                reversed +=each.charAt(i);
            }
            if (each.equalsIgnoreCase(reversed)) {
                it.remove();
            }
        }
        System.out.println("names = " + names);
        System.out.println("--------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );

        /*
        Predicate<String> palindrome = str -> {
            String reverse = "";
            for(int i = str.length()-1; i >= 0; i--){
                reverse += str.charAt(i);
            }
            return reverse.equalsIgnoreCase(str);
        };
        names2.removeIf(palindrome);
         */

        /*
        names2.removeIf(str -> { String reverse = "";
            for(int i = str.length()-1; i >= 0; i--){
                reverse += str.charAt(i);
            }
            return reverse.equalsIgnoreCase(str);}
        );
        System.out.println(names2);
        */

    }
}
