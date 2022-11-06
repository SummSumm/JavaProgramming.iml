package day21_Arrays_ForEach;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        String[] arr1 = {"30", "10", "20"};
        String[] arr2 = {"15", "40", "25", "35"};
        String[] arr3 = {"8", "9", "17", "5", "4", "1"};


        int i = 0;
        String[] merged = new String[arr1.length + arr2.length + arr3.length];

        for (String each : arr1) {
            merged[i] = each;
            i++;
        }
        for (String each : arr2) {
            merged[i] = each;
            i++;
        }
        for (String each : arr3) {
            merged[i] = each;
            i++;
        }

        System.out.println(Arrays.toString(merged));

    }


}
/*

    5. Write a program that can merge 3 arrays of integers

    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1}

			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}
 */