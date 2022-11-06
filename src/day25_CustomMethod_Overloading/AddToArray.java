package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddToArray {
    public static void main(String[] args) {

        int arr [] = {1,2,3,4};
        arr = addInteger(arr, 5);
        System.out.println(Arrays.toString(arr));

        System.out.println("------------------------------------------------------------------------------");

        double [] arr2 = {0.5,1.5,2.5,3.5};
        arr2 = addDouble(arr2, 4.5);
        System.out.println(Arrays.toString(arr2));

        System.out.println("------------------------------------------------------------------------------");

        String [] arr3 = {"one", "two", "three", "four"};
        arr3 = addString(arr3, "five");
        System.out.println(Arrays.toString(arr3));

        System.out.println("------------------------------------------------------------------------------");

        char arr4 [] = {'a', 'b', 'c', 'd'};
        arr4 = addchar(arr4, 'e');
        System.out.println(Arrays.toString(arr4));

    }
    public static int [] addInteger(int [] arr, int num) {

         int [] result = new int [arr.length + 1];

         int i=0;

         for (int each:arr) {
             result [i++] = each;
         }
 result [i] = num;
         return result;
    }

    public static double [] addDouble(double [] arr, double num) {

        double [] result = new double [arr.length + 1];

        int i=0;

        for (double each:arr) {
            result [i++] = each;
        }
        result [i] = num;
        return result;
    }

    public static String [] addString(String [] arr, String num) {

        String [] result = new String [arr.length + 1];

        int i=0;

        for (String each:arr) {
            result [i++] = each;
        }
        result [i] = num;
        return result;
    }

    public static char [] addchar(char [] arr, char num) {

        char [] result = new char [arr.length + 1];

        int i=0;

        for (char each:arr) {
            result [i++] = each;
        }
        result [i] = num;
        return result;
    }
}
