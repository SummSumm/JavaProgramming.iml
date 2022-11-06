package day25_CustomMethods;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int array1 [] = {10,20,3,4,5,};

        findMax(array1);
    }



    public static void findMax (int[] array1) {

        int max = 0;
        for (int each : array1) {
            if (each>max) {
                max=each;
            }
        }

        System.out.println(max);
    }

    public static void findMax (double[] array1) {

        double max = 0;
        for (double each : array1) {
            if (each>max) {
                max=each;
            }
        }

        System.out.println(max);
    }

    public static void findMax (long[] array1) {

        long max = 0;
        for (long each : array1) {
            if (each>max) {
                max=each;
            }
        }

        System.out.println(max);
    }

    public static void findMax (short[] array1) {

        short max = 0;
        for (short each : array1) {
            if (each>max) {
                max=each;
            }
        }

        System.out.println(max);
    }

    public static void findMax (float[] array1) {

        float max = 0;
        for (float each : array1) {
            if (each>max) {
                max=each;
            }
        }

        System.out.println(max);
    }

    public static void findMax (byte[] array1) {

        byte max = 0;
        for (byte each : array1) {
            if (each>max) {
                max=each;
            }
        }

        System.out.println(max);
    }
}


