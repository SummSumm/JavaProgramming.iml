package day09_IfElse;

public class MinNumber {
    public static void main(String[] args) {
        int num1 = 200;
        int num2 = 200;

        boolean smaller=num1<num2;

        if (smaller == true) {
            System.out.println(num1 + " is the smaller number.");
        }
        if (!smaller) {
            System.out.println(num1 + " is the larger number.");
        }
        if (num1==num2) {
            System.out.println(num1 + " and " + num2 + " are equal.");
        }
    }
}
