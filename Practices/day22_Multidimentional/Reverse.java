package day22_Multidimentional;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int [][] array = { {1,2,3}, {4,5,6}};
        String [] reverse ={};


        for (int i = array.length-1; i >=0 ; i--) {
            for (int j= array[i].length-1; j >=0 ; j--) {
                System.out.print(array[i][j] + " ");
            }
        }



    }
}
/*
1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};
 */