package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {

        int [] array1 = {1,2,3};
        int [] array2 = {4,5,6};
        System.out.println(Arrays.toString(ArraysUtility.mergeArrays(array1, array2)));

        System.out.println("---------------------------");

        int [] merged = new int [array1.length + array2.length];

        int i= 0;
        for (int each : array1) {
            merged[i++] = each;
        }
        for (int each : array2) {
            merged [i++] =  each;

        }
        System.out.println(Arrays.toString(merged));
    }
}
