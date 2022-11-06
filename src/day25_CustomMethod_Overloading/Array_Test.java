package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

import java.lang.reflect.Array;

public class Array_Test {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};
        ArraysUtility.printEachInt(array);

        System.out.println("-------------------------");

        double[] arr = {1.0, 1.5, 2.0, 2.5};
        ArraysUtility.printEachDouble(arr);

        System.out.println("-------------------------");

        char[] arry = {'a', 'b', 'c'};
        ArraysUtility.printEachChar(arry);

        System.out.println("-------------------------");

        String[] ar = {"Bugra", "and", "Sumeyye", "Aslan"};
        ArraysUtility.printEachString(ar);

        System.out.println("-------------------------");

        int[] array2 = {100, 2, 23, 4, 5, 6};
        System.out.println("Max in array:");
        System.out.println(ArraysUtility.maximumIntArray(array2));
        System.out.println("Min in array:");
        System.out.println(ArraysUtility.minimumIntArray(array2));

        System.out.println("-------------------------");

        double[] arr2 = {12.0, 1.345, 452.70, 2.5};
        System.out.println("Max in array:");
        System.out.println(ArraysUtility.maximumDoubleArray(arr2));
        System.out.println("Min in array:");
        System.out.println(ArraysUtility.minimumDoubleArray(arr2));

        System.out.println("-------------------------");

        int[] arrayy = {10, 20, 30, 40, 50};
        int element = 20;
        System.out.println(ArraysUtility.containsInt(arrayy, 20));

        System.out.println("-------------------------");

char [] rr = {'a', 'b', 'c', 'd', 'g'};
char r = 'c';
        System.out.println(ArraysUtility.containsChar(rr, r));
    }
}
