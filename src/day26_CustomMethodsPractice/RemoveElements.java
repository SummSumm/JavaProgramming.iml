package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {

        int [] array = {100,200,300,400,500};
        System.out.println(Arrays.toString(removeElements(array, 1)));

    }

    public static int [] removeElements (int[] array, int index) {
       if (index<0 || index>=array.length) {
           System.err.println("INVALID");
           System.exit(0);
       }

        int [] result = new int [array.length-1];

        int j=0;                       // j is the index numbers for the RESULT array
        for (int i=0; i< array.length; i++) {
            if (i==index) {
                continue;
            }else {
                result [j++] = array[i];
            }
        }
        return result;
    }


}
