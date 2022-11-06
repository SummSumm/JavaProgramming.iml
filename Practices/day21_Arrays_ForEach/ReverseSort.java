package day21_Arrays_ForEach;

import java.util.Arrays;

public class ReverseSort {
    public static void main(String[] args) {

        int [] numbers = {5, 8, 59, 47 ,100 , 300};
String reverse = "";

        Arrays.sort(numbers);


        for (int i = numbers.length-1; i >=0 ; i--) {
          reverse += numbers[i] + " ";
        }

        System.out.print(reverse);
    }
}
//1. Write a program that sort the array of integer in descending order
