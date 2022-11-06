package day21_Array_For_Each;
import java.util.Arrays;
public class ForEachIntro {
    public static void main(String[] args) {
        int [] numbers = {3, 6, 9};
        for (int each:numbers ) {
            System.out.println(each);
        }
        System.out.println("-------------------------");
        System.out.println("MAX NUMBER");
        int [] all = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int max = numbers[0];
        for (int each:all) {
            if (each>max) {
                max=each;
            }



        }System.out.println(max);
        System.out.println("--------------------------------");
        System.out.println("MIN NUMBER");

        int [] arr = {20, 58, 69 ,0, 14, 27};
        int min =arr[0];

        for (int i : arr) {
            if (i<min) {
                min=i;
            }

        }
        System.out.println(min);
        }

        }



