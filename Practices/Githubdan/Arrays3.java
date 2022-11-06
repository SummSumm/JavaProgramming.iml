package Githubdan;
import java.util.*;
public class Arrays3 {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

            int count =0;          // buraya yazarsak 0'dan başalayıp her bir loopta artırır

        for (int each : nums) {
            if(each%2==0) {
                count++;
            }
        }
        System.out.println("even number count = " + count);

        input.close();
    }
}

/*
Given an array nums, count and print the number of even numbers in the array

Examples:

nums → [2, 1, 2, 3, 4]) → 3

nums → [2, 2, 0, 3, 5]) → 3

nums → [1, 3, 5, 7, 9]) → 0
 */
