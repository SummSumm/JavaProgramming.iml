package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int arr [] = {1,2,3};
       arr =  addElement(arr, 4);
        System.out.println(Arrays.toString(arr));

        char [] array = {'a', 'b', 'c'};
        array = addElement(array, 'd');
        System.out.println(array);
    }

    public static int [] addElement(int [] arr, int num) {

        int [] result = new int [arr.length + 1];

        int i=0;

        for (int each:arr) {
            result [i++] = each;
        }
        result [i] = num;
        return result;
    }

    public static double [] addElement(double [] arr, double num) {

        double [] result = new double [arr.length + 1];

        int i=0;

        for (double each:arr) {
            result [i++] = each;
        }
        result [i] = num;
        return result;
    }


    public static String [] addElement(String [] arr, String num) {

        String [] result = new String [arr.length + 1];

        int i=0;

        for (String each:arr) {
            result [i++] = each;
        }
        result [i] = num;
        return result;
    }

    public static char [] addElement(char [] arr, char num) {

        char [] result = new char [arr.length + 1];

        int i=0;

        for (char each:arr) {
            result [i++] = each;
        }
        result [i] = num;
        return result;
    }
}
