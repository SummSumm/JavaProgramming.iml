package day25_CustomMethods;

public class Task3 {
    public static void main(String[] args) {
        int array[] = {12, 52, 96, 45, 139, 748, 023};

        minimums(array);

    }

    public static void minimums(int[] arr) {
        int min = 99999999;
        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        System.out.println("min = " + min);
        ;

    }

    public static void minimums(byte[] arr) {
        byte min = 99;
        for (byte each : arr) {
            if (each < min) {
                min = each;
            }
        }
        System.out.println("min = " + min);

    }

    public static void minimums(double[] arr) {
        double min = 99;
        for (double each : arr) {
            if (each < min) {
                min = each;
            }
        }
        System.out.println("min = " + min);

    }
}
