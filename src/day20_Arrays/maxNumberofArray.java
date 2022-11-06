package day20_Arrays;
import java.util.Arrays;
public class maxNumberofArray {
    public static void main(String[] args) {

        int [] numbers = {5, 25, 68, 1, 025, 47}; 
        
        int max = numbers [0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max) {
                max = numbers[i];
            }

        }
        System.out.println(max);

        System.out.println("------------------------");

        int num [] = {5, 25, 68, 1, 025, 47};

        int min =num [0];
        for (int i = 0; i < num.length; i++) {
            if (num [i]<min) {
                min = num[i];
            }
        }
        System.out.println(min);
    }
}
