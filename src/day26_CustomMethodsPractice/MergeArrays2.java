package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

// bunu yaptık zaten; Arrays utilityde mevcut
public class MergeArrays2 {
    public static int[] merge (int[] arr1, int [] arr2) {
        int [] result = {};
        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (int each : arr2) {
            result = ArraysUtility.addElement(result, each);
        };
        return result;
    }

}
