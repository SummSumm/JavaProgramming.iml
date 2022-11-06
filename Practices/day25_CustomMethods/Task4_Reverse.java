package day25_CustomMethods;

import java.util.Arrays;

public class Task4_Reverse {
    public static void main(String[] args) {
String lol [] = {"One", "Two", "Three"};
reverse(lol);
    }


    public static void reverse (String [] array) {

        String reversed = "";

        for (int i = array.length-1; i >=0 ; i--) {
            reversed+=array[i] + " ";

        }
        System.out.println(reversed);
        }

    }

