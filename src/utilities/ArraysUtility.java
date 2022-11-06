package utilities;

import java.util.Arrays;

public class ArraysUtility {

    public static void printEachInt(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void printEachDouble(double[] array) {
        for (double i : array) {
            System.out.println(i);
        }
    }

    public static void printEachChar(char[] array) {
        for (char i : array) {
            System.out.println(i);
        }
    }

    public static void printEachString(String[] array) {
        for (String i : array) {
            System.out.println(i);
        }
    }

    public static int maximumIntArray(int[] array) {

        Arrays.sort(array);
        return array[array.length - 1];
    }

    public static double maximumDoubleArray(double[] array) {

        Arrays.sort(array);
        return array[array.length - 1];
    }

    public static int minimumIntArray(int[] array) {

        Arrays.sort(array);
        return array[0];
    }

    public static double minimumDoubleArray(double[] array) {

        Arrays.sort(array);
        return array[0];
    }

    public static boolean containsInt(int[] array, int element) {

        boolean result = false;

        for (int each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    public static boolean containsDouble(double[] array, double element) {

        boolean result = false;

        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    public static boolean containsChar(char[] array, char element) {

        boolean result = false;

        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    public static boolean containsString(String[] array, String element) {

        boolean result = false;

        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }
        }
        return result;
    }

    public static int frequencyOfElement(int[] array, int num) {

        int count = 0;
        for (int i : array) {
            if (i == num) {
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(double[] array, double num) {

        int count = 0;
        for (double i : array) {
            if (i == num) {
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(char[] array, char num) {

        int count = 0;
        for (char i : array) {
            if (i == num) {
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(String[] array, String num) {

        int count = 0;
        for (String i : array) {
            if (i.equals(num)) {
                count++;
            }
        }
        return count;
    }

    public static int[] addElement(int[] arr, int num) {

        int[] result = new int[arr.length + 1];

        int i = 0;

        for (int each : arr) {
            result[i++] = each;
        }
        result[i] = num;
        return result;
    }

    public static double[] addElement(double[] arr, double num) {

        double[] result = new double[arr.length + 1];

        int i = 0;

        for (double each : arr) {
            result[i++] = each;
        }
        result[i] = num;
        return result;
    }

    public static String[] addElement(String[] arr, String num) {

        String[] result = new String[arr.length + 1];

        int i = 0;

        for (String each : arr) {
            result[i++] = each;
        }
        result[i] = num;
        return result;
    }

    public static char[] addElement(char[] arr, char num) {

        char[] result = new char[arr.length + 1];

        int i = 0;

        for (char each : arr) {
            result[i++] = each;
        }
        result[i] = num;
        return result;
    }

    public static int[] uniqueElements(int[] array) {
        int[] result = {};
        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static double[] uniqueElements(double[] array) {
        double[] result = {};
        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static char[] uniqueElements(char[] array) {
        char[] result = {};
        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static String[] uniqueElements(String[] array) {
        String[] result = {};
        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static int[] removeElements(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.err.println("INVALID");
            System.exit(0);
        }

        int[] result = new int[array.length - 1];

        int j = 0;                       // j is the index numbers for the RESULT array
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            } else {
                result[j++] = array[i];
            }
        }
        return result;
    }

    public static int[] removeElement2(int[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("INVALID");
            System.exit(0);
        }

        int[] result = {};

        int i = 0;
        for (i = 0; i < array.length; i++) {
            if (i != index) {
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }

    public static double[] removeElement2(double[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("INVALID");
            System.exit(0);
        }

        double[] result = {};

        int i = 0;
        for (i = 0; i < array.length; i++) {
            if (i != index) {
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }

    public static char[] removeElement2(char[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("INVALID");
            System.exit(0);
        }

        char[] result = {};

        int i = 0;
        for (i = 0; i < array.length; i++) {
            if (i != index) {
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }

    public static String[] removeElement2(String[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("INVALID");
            System.exit(0);
        }

        String[] result = {};

        int i = 0;
        for (i = 0; i < array.length; i++) {
            if (i != index) {
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        // int [] result = new int[array1.length + array2.length];
        int[] result = {};

        for (int each : array1) {
            result = addElement(result, each);
        }
        for (int each : array2) {
            result = addElement(result, each);
        }
        return result;
    }

    public static double[] mergeArrays(double[] array1, double[] array2) {

        double[] result = {};

        for (double each : array1) {
            result = addElement(result, each);
        }
        for (double each : array2) {
            result = addElement(result, each);
        }
        return result;
    }

    public static char[] mergeArrays(char[] array1,char[] array2) {

        char[] result = {};

        for (char each : array1) {
            result = addElement(result, each);
        }
        for (char each : array2) {
            result = addElement(result, each);
        }
        return result;
    }

    public static String[] mergeArrays(String[] array1,String[] array2) {

        String[] result = {};

        for (String each : array1) {
            result = addElement(result, each);
        }
        for (String each : array2) {
            result = addElement(result, each);
        }
        return result;
    }

    public static int [] reverse (int [] array) {

        int [] result =new int[array.length];
        for (int i = array.length-1, j=0; i>=0; i--,j++) {  // j resultın indexi; o arttıkça diğeri azalmalı
            result [j]= array [i];

        }
        return result;
    }

    public static double [] reverse (double [] array) {

        double [] result =new double[array.length];
        for (int i = array.length-1, j=0; i>=0; i--,j++) {  // j resultın indexi; o arttıkça diğeri azalmalı
            result [j]= array [i];

        }
        return result;
    }

    public static char [] reverse (char [] array) {

        char [] result =new char[array.length];
        for (int i = array.length-1, j=0; i>=0; i--,j++) {  // j resultın indexi; o arttıkça diğeri azalmalı
            result [j]= array [i];

        }
        return result;
    }

    public static String [] reverse (String [] array) {

        String [] result =new String[array.length];
        for (int i = array.length-1, j=0; i>=0; i--,j++) {  // j resultın indexi; o arttıkça diğeri azalmalı
            result [j]= array [i];

        }
        return result;
    }

    public static int [] replaceElement (int [] array, int index, int replacement) {

        if (index<0 || index>array.length-1) {
            System.err.println("INVALID");
            System.exit(0);
        }


        array[index]  = replacement;
        return array;

    }

    public static String [] replaceElement (String [] array,int index, String replacement) {

        if (index<0 || index>array.length-1) {
            System.err.println("INVALID");
            System.exit(0);
        }


        array[index]  = replacement;
        return array;

    }

    public static double [] replaceElement (double [] array,int index, double replacement) {

        if (index<0 || index>array.length-1) {
            System.err.println("INVALID");
            System.exit(0);
        }


        array[index]  = replacement;
        return array;

    }

    public static char [] replaceElement (char [] array,int index, char replacement) {

        if (index<0 || index>array.length-1) {
            System.err.println("INVALID");
            System.exit(0);
        }


        array[index]  = replacement;
        return array;

    }

    public static int[] replaceAll(int[] array, int oldElement, int newElement) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldElement) {
                array[i] = newElement;

            }

        }
        return array;
    }
    
    public static double[] replaceAll(double[] array, double oldElement, double newElement) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldElement) {
                array[i] = newElement;

            }

        }
        return array;
    }

    public static char[] replaceAll(char[] array, char oldElement, char newElement) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldElement) {
                array[i] = newElement;

            }

        }
        return array;
    }

    public static String[] replaceAll(String[] array, String oldElement, String newElement) {

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(oldElement)) {
                array[i] = newElement;

            }

        }
        return array;
    }

    public static int [] removeDuplicates (int [] array) {

        int[] result = {};

        for (int each : array) {
            if (!(ArraysUtility.containsInt(result, each))) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static double [] removeDuplicates (double [] array) {

        double[] result = {};

        for (double each : array) {
            if (!(ArraysUtility.containsDouble(result, each))) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static char [] removeDuplicates (char [] array) {

        char[] result = {};

        for (char each : array) {
            if (!(ArraysUtility.containsChar(result, each))) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static String [] removeDuplicates (String [] array) {

        String[] result = {};

        for (String each : array) {
            if (!(ArraysUtility.containsString(result, each))) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static boolean strongPassword(String password) {
        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false; // has upper case
        boolean r3 = false; // has lower case
        boolean r4 = false; // has special character
        boolean r5 = false; // has digit

        char[] chars = password.toCharArray();

        for (char each : chars) {
            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r4 = true;
            } else {
                r5 = true;
            }
        }

        boolean isStrong = r1 && r2 && r3 && r4 && r5;

        if (isStrong) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Not a strong password; try again");
        }
        return isStrong;
    }

}



