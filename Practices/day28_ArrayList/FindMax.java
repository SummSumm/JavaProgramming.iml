package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindMax {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6));

        int max=Integer.MIN_VALUE;
        for (Integer each: list) {
            if (each>max)
                max=each;
        }
        System.out.println(max);

        int min = Integer.MAX_VALUE;

        for (Integer each : list) {
            if (each<min)
                min=each;
        }
        System.out.println(min);

    }
}
/*
5. Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5


 */