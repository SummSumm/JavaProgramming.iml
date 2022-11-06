package day06_Arithmetic;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println(10+4);
        System.out.println(10-4);
        System.out.println(10*4);
        System.out.println(10/4); // will only be int
        System.out.println(10.0/4); // will give decimals
        System.out.println((double)10/4); // it will give in decimals - cast as double
        System.out.println(10d/4); // shortcut for double casting
        System.out.println("----------------------------------------------------------------------");

        int a = 100;

        double b = a/6.0; // bunu duzleyip verecek cunku hesabı yapacak ve double da olsa 16.0 verecek
        double bb = a/6.0; // bunu dogru verecek
        double bbb = a/6d; // bunu dogru verecek
        double bbbb = (double)a/6;

        System.out.println(b);
        System.out.println(bb);
        System.out.println(bbb);
        System.out.println(bbbb);
    }
}
/*
addition, subtraction and multiplication work as normal.
Division doesn't.
If you divide integers, it will result in an integer no matter what.
Solution: write one of the numbers in decimals
OR cast one as decimal
OR put a d after one number --> see above
 */