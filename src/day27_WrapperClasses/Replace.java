package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {

        int array [] = {1,2,3,4,5,6,7,8,9};
        int index = 3;
        int replacement = 000;

        System.out.println(Arrays.toString(replaceElement(array, index, replacement)));


        String [] array2  = {"Hi", "Hello", "Hola", "Hallo"};
        int index2 = 1;
        String replacement2 = "Merhaba";

        System.out.println(Arrays.toString(ArraysUtility.replaceElement(array2, index2, replacement2)));
    }

    public static int [] replaceElement (int [] array, int index, int replacement) {

        if (index<0 || index>array.length-1) {
            System.err.println("INVALID");
            System.exit(0);
        }


        array[index]  = replacement;
        return array;

    }


}
