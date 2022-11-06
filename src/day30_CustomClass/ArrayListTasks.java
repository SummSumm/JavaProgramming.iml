package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTasks {
    public static void main(String[] args) {

        //swap first and last
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        Collections.swap(numbers, 0, numbers.size() - 1);
        System.out.println(numbers);
        System.out.println("-----------------------------");

        //numbers first, 0s at the end

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        int size = list.size();
        list.removeAll(Arrays.asList(0));
        int newsize = list.size();

        int zeros = size - newsize;

        for (int i = 0; i <= zeros; i++) {
            list.add(0);

        }
        System.out.println(list);
        System.out.println("-----------------------------");
// for-each ile once bi result açıp 0 olmayanları ekle; sonra yeni bir for-each ile 0 olanları ekle dersen de yapılabilir

        String str = "ABCDE12345!'^+%";

        ArrayList<Character> characters = new ArrayList<>();
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            characters.addAll(Arrays.asList(ch));
        }

        ArrayList<Character> letters = new ArrayList<>(characters);
        letters.removeIf(p -> !Character.isLetter(p));
        System.out.println("letters = " + letters);

        ArrayList<Character> digits = new ArrayList<>(characters);
        digits.removeIf(p -> !Character.isDigit(p));
        System.out.println("digits = " + digits);

        ArrayList<Character> specialCharacters = new ArrayList<>(characters);
        specialCharacters.removeIf(p -> Character.isDigit(p) || Character.isLetter(p)); // or specialCharacters.removeAll(letters) ve digits
        System.out.println("specialCharacters = " + specialCharacters);
    }
}
