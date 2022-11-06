package day25_CustomMethod_Overloading;

public class SumofNumbers {
    public static void main(String[] args) {
        int sum = sumTwo(2,5);
        System.out.println(sum);
        //System.out.println(sumTwo(2, 5));

    }



    public static int sumTwo(int num1, int num2) {
        int sum = num1+num2;
        return sum;
    }

    public static int sumThree(int num1, int num2, int num3) {
        int sum = num1+num2+num3;
        return sum;
    }

    public static int sumFour(int num1, int num2, int num3, int num4) {
        int sum = num1+num2+num3+num4;
        return sum;
    }
}