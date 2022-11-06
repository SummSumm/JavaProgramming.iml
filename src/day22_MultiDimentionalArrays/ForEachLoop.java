package day22_MultiDimentionalArrays;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int [][]arr2D = {{1,2,3}, {4,5,6}, {7,8,9}};
//if in normal order, BEG to END, we can use for each loop

        for (int [] eachArray: arr2D) {
            //System.out.println(Arrays.toString(eachArray));
            for ( int eachElement:eachArray   ) {
                System.out.println(eachElement);

            }
        }
    }
}
