package day07_Operators;

public class Castings {
    public static void main(String[] args) {
        // byte < short < int < long L < float F (decimal) < double (decimal)

        float avScore = 20.5f;

        byte num1 = (byte) avScore;
        System.out.println("num1 = " + num1);

        short num2 = (short) avScore;
        System.out.println("num2 = " + num2);

        int num4 = (int) avScore;
        System.out.println("num4 = " + num4);

        long num3 = (long) avScore;
        System.out.println("num3 = " + num3);

        float num5 = avScore;
        System.out.println("num5 = " + num5);

        double num6 = avScore;
        System.out.println("num6 = " + num6);


    }
}
