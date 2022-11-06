package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int [] array= {1,2,3,4};
        int [] result = reverse(array);
        System.out.println(Arrays.toString(result));
    }


    public static int [] reverse (int [] array) {

        int [] result =new int[array.length];
        for (int i = array.length-1, j=0; i>=0; i--,j++) {  // j resultın indexi; o arttıkça diğeri azalmalı
            result [j]= array [i];

        }
return result;
    }
}
