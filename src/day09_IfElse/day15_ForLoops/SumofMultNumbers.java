package day09_IfElse.day15_ForLoops;

import java.util.Scanner;

public class SumofMultNumbers {
    public static void main(String[] args) {

        double sum = 0;

        for (int i = 1; i < 101; i++) {
sum += i; // her seferinde sum'a i ekle

        }
        System.out.println(sum);

        System.out.println("---------------------------------------------");
        /*
        ask the user to give 5 numbers and add them
         */
        Scanner input = new Scanner(System.in);

        System.out.println("enter number 1");
        int num1 = input.nextInt();

        System.out.println("enter number 2");
        int num2 = input.nextInt();
        System.out.println("enter number 3");
        int num3 = input.nextInt();
        System.out.println("enter number 4");
        int num4 = input.nextInt();
        System.out.println("enter number 5");
        int num5 = input.nextInt();

        int total = num1+num2+num3+num4+num5;
        System.out.println(total);
//bu LOOPSUZ
        System.out.println("--------------------------------------------------");

        int totall = 0;

        Scanner newinput = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            totall += newinput.nextInt();
        }
        System.out.println(totall);

        newinput.close();
        input.close();


    }
}

/*

    3. Write a program that can calculate the sum of all integers between 1 to 100



Tasks:
	1. Write a program that can reverse any given string

			String str = "Java"; ==> avaJ
		 //			      0123

 */