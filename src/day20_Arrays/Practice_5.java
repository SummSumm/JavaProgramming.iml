package day20_Arrays;

import java.util.Arrays;

public class Practice_5 {
    public static void main(String[] args) {
       int [] arr1 = {30, 10, 20};
        int []arr2 = {15, 40, 25, 35};
        int [] arr3 = {8, 9, 17, 5, 4, 1};

        int [] arr = new int[arr1.length + arr2.length + arr3.length]; // define a new array to add everything in

        int i =0;
        for (int each1 : arr1) {
            arr [i] += each1;
            i++;
        }
        for (int each2 : arr2) {
            arr [i] += each2;
            i++;
        }
        for (int each3 : arr3) {
            arr [i] += each3;
            i++;
        }

        System.out.println(Arrays.toString(arr));
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