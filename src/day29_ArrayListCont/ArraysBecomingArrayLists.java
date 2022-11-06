package day29_ArrayListCont;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysBecomingArrayLists {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9,10};

//        BUNU YAPMAZ çünkü Non-Primitive değil
//ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(arr));
        // O ZAMAAAAAAAAN yukarıdaki int var ya, onu Integer yapıcaz

        Integer [] array = {1,2,3,4,5,6,7,8,9,10};
ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(array));
        System.out.println(Arrays.toString(array));

        // OR make a loop and create a method

        ArrayList <Integer> list3 = new ArrayList<>(arrayToArrayList(arr));
        System.out.println(Arrays.toString(arr));

    }
    public static ArrayList<Integer> arrayToArrayList (int [] array) {
        ArrayList <Integer> list = new ArrayList<>();

        for (int each:array) {
            list.add(each);
        }
        return list;
    }
}
