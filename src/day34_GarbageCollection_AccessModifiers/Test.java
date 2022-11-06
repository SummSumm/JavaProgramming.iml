package day34_GarbageCollection_AccessModifiers;

import utilities.MathUtility;

import java.math.MathContext;

import static utilities.MathUtility.sum;
import static utilities.MathUtility.even;

public class Test {
    public static void main(String[] args) {

        int sum1 = sum(10,20);
        int sum2 = sum(100,200);
        double sum3 = sum(10.5,6.5);

        boolean isEven = even(8);

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
        System.out.println("sum3 = " + sum3);
        System.out.println( " isEven = " + isEven);
    }
}
