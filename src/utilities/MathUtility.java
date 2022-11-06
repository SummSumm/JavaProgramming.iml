package utilities;

public class MathUtility {

    public static int sum(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }

    public static double sum(double n1, double n2) {
        double sum = n1 + n2;
        return sum;
    }

    public static int subtract(int n1, int n2) {
        int subtr = n1 - n2;
        return subtr;
    }

    public static double subtract(double n1, double n2) {
        double subtr = n1 - n2;
        return subtr;
    }

    public static int multiplication(int n1, int n2) {
        int mult = n1 * n2;
        return mult;
    }

    public static double division(double n1, double n2) {
        double div = n1 / n2;
        return div;
    }

    public static boolean odd(int n1) {
        boolean isOdd = false;
        if (n1 % 2 == 1) {
            isOdd = true;
        }
        return isOdd;
    }

    public static boolean even(int n1) {
        boolean isEven = false;
        if (n1 % 2 == 0) {
            isEven = true;
        }
        return isEven;
    }


}
