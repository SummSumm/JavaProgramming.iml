package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 2, 3, 5, 6, 8, 9, 4, 1};
        int [] unique = uniqueElements(array);
        Arrays.sort(unique);
        System.out.println(Arrays.toString(unique));

    }

    public static int [] uniqueElements (int [] array) {
        int[] result = {};
        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
}
