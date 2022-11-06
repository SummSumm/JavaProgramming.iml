package Githubdan;

import java.util.*;

public class Arrays5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

       int count;
        for (int each : nums) {                          // duplicatelerde karşılaştırma var: iç içe iki loop lazım
             count = 0;                               // dışarıda kalırsa loopa girmez, sonuç vermez (nestedlarda)
            for (int element : nums) {
                if (each == element) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);
            }
        }

    }
}
/*
Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4] -> 2
 */