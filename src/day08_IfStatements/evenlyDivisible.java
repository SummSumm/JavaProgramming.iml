package day08_IfStatements;

public class evenlyDivisible {
    public static void main(String[] args) {

        int number = 458;

        int remainder2 = number%2;
        int remainder3 = number%3;
        int remainder5 = number%5;

        boolean by2 = remainder2==0;
        boolean by3 = remainder3==0;
        boolean by5 = remainder5==0;

        System.out.println(number + " is divisible by 2:" + by2);
        System.out.println(number + " is divisible by 3:" + by3);
        System.out.println(number + " is divisible by 5:" + by5);
// hoca iki iş yapmadı boolean by2 = number%2 ==0; yaptı

    }
}

// find whether a number is divisible by 2,3 and 5.
