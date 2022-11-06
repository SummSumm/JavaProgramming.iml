package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 10, 20};
        int oldElement = 10;
        int newElement = 100;
        System.out.println(Arrays.toString(replaceAll(array, oldElement, newElement)));
         oldElement = 20;
         newElement = 200;
        System.out.println(Arrays.toString(replaceAll(array, oldElement, newElement)));
    }


    public static int[] replaceAll(int[] array, int oldElement, int newElement) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldElement) {
                array[i] = newElement;

            }

        }
        return array;
    }
}
