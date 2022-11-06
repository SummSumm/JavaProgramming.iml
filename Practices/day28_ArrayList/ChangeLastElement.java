package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ChangeLastElement {
    public static void main(String[] args) {


        Integer [] arr = {1,2,3,4,5,6};
        ArrayList <Integer> array = new ArrayList<>(Arrays.asList(arr));

        array.set(array.size()-1, 0);

        System.out.println(array);




    }
}
/*
1. write a program that can set the last element of the Integer arraylist to zero
	            ex:
	                list = [1,2,3,4,5];
	                output: [1,2,3,4,0];

 */