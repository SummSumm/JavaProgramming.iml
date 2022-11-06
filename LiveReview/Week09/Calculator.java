package Week09;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(add(8,9));
        System.out.println(subtract(8,9));
        System.out.println(multiply(8,9));
        System.out.println(divide(8,9));

    }

    public static double add(double num1, double num2) {
        double result = num1+num2;
        return result;
    }

    public static double subtract (double num1, double num2) {
        double result = num1-num2;
        return result;
    }

    public static double multiply (double num1, double num2) {
        return num1*num2;
    }

    public static double divide (double num1, double num2) {
        return num1/num2;
    }
}
