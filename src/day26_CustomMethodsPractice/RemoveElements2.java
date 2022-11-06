package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements2 {
    public static void main(String[] args) {

int [] array = {1,2,3,4,5};

        System.out.println(Arrays.toString(ArraysUtility.removeElement2(array, 4)));
    }

     public static int [] removeElement (int [] array, int index) {
        if (index<0 || index>array.length-1) {
            System.err.println("INVALID");
            System.exit(0);
        }

        int [] result = {};

        int i = 0;
        for (i=0; i<array.length; i++) {
            if (i != index) {
               result=  ArraysUtility.addElement(result, array[i]); // resulta eşlemeyi unutma!
            }
        }
        return result;
     }

}
