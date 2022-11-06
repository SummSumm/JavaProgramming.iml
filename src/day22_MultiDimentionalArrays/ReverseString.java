package day22_MultiDimentionalArrays;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String sent = ("today is a good day to learn Java");

        String[] words = sent.split(" ");
        String reversed = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversed +=words [i] + " ";

        }
        System.out.println(reversed);
    }
}
