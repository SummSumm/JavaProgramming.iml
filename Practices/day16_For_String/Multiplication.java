package day16_For_String;
import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two positive numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int mult = 0;

        if (num1*num2<0) {
            System.out.println("Invalid number");
        } else {

            for (int i = 1; i <= num2; i++) {
                mult += num1;

            }
        }
        System.out.println(mult);

    }
}
/*
3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200
 */