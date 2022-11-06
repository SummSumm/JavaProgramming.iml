package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] array = {1,1,2,3,4,4,5,6};
        array = removeDuplicates(array);

        System.out.println(Arrays.toString(array));
        System.out.println("-------------------------------------------------");

        String [] arr = {"Hi", "Hi", "Hello" ,"Hello"};
       arr =  ArraysUtility.removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
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
}
