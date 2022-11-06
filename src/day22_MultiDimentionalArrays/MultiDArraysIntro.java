package day22_MultiDimentionalArrays;

import java.util.Arrays;

public class MultiDArraysIntro {
    public static void main(String[] args) {
        String [] group1 = {"John", "Jane", "Jamie"};
        String [] group2 = {"Matt", "Miriam", "Maya"};
        String [] group3 = {"Kelly", "Kerian", "Kenneth"};

                String[][]groups = new String[3][];    // set the size
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;
        System.out.println(Arrays.deepToString(groups));
        System.out.println(Arrays.toString(groups[0]));// Arrays.toString won't work here

        int [] a1 = {1,2,3};
        int [] a2 = {6,4,5};
        int [] a3 = {7,8,9};

        int [][] b = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(Arrays.toString(b[2])); // to get the array
        System.out.println((b[2][2])); //  now we only retrieve elements

    }
    }
