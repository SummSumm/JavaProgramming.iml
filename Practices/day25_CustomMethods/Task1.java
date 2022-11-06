package day25_CustomMethods;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr1;


        int[] array = {1, 2, 3};
        int[] another = {4, 5, 6};
        System.out.println(Arrays.toString((mergeArray(array, another))));

    }

    public static int[] mergeArray(int[] array1, int[] array2) {

        int[] arrayMerged = new int[array1.length + array2.length];

        int i = 0;
        for (int each : array1) {
            arrayMerged[i] = each;
            i++;
        }
        for (int each : array2) {
            arrayMerged[i] = each;
            i++;
        }
        return arrayMerged;
    }

    public static double[] mergeArray(double[] array1, double[] array2) {

        double[] arrayMerged = new double[array1.length + array2.length];

        int i = 0;
        for (double each : array1) {
            arrayMerged[i] = each;
            i++;
        }
        for (double each : array2) {
            arrayMerged[i] = each;
            i++;
        }
        return arrayMerged;
    }

    public static char[] mergeArray(char[] array1, char[] array2) {

        char[] arrayMerged = new char[array1.length + array2.length];

        int i = 0;
        for (char each : array1) {
            arrayMerged[i] = each;
            i++;
        }
        for (char each : array2) {
            arrayMerged[i] = each;
            i++;
        }
        return arrayMerged;
    }

    public static String[] mergeArray(String[] array1, String[] array2) {

        String[] arrayMerged = new String[array1.length + array2.length];

        int i = 0;
        for (String each : array1) {
            arrayMerged[i] = each;
            i++;
        }
        for (String each : array2) {
            arrayMerged[i] = each;
            i++;
        }
        return arrayMerged;
    }
}

    /*
    Task1:
	1. create a method that can merge two integer arrays.

	2. create a method that can merge two double arrays.

	3. create a method that can merge two char arrays.

	4. create a method that can merge two String arrays.
*/
