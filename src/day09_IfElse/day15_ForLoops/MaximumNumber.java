package day09_IfElse.day15_ForLoops;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = -1756354386; // this is the temporaary assignment; any given number will PROBABLY be greater than this


        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num > max) {
                max = num;
            }

        }
        System.out.println("max = " + max);
        System.out.println("-------------------------------------------------------");

        Scanner scan = new Scanner(System.in);


        int min = 0;
        for (int i = 10; i < 15; i++) {
            System.out.println("Enter a number");

            min = 12547325;
            int num1 = scan.nextInt();

            if (num1 < min) {
                min = num1;
            }

        }
        System.out.println("min = " + min);
        input.close();
        scan.close();

    }
}

/*
user provides 5 numbers and the system shows the max number.
do the same for minimum
 */
