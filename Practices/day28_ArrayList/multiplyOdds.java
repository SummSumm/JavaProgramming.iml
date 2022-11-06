package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class multiplyOdds {
    public static void main(String[] args) {
        Integer [] arr = {1,2,3,4,5,6,7,8,9};
        ArrayList <Integer> array = new ArrayList<>(Arrays.asList(arr));

        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) %2 != 0){
                array.set(i, array.get(i)*2 );
            }
        }

        System.out.println("list = " + array);


    }
}
/*
3. write a program that can multiply each odd number by 2
	            ex: list = [1,2,3,4,5];
	                output: [2,2,6,4,10]
 */