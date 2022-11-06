package Week05;
import java.util.Scanner;
public class SumofNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int sum = 0;

        for (int i = 0; i < num+1; i++) {

            sum = i+num;

        } System.out.println(sum);
        input.close();
    }
}
/*
      Write a program to calculate the sum of the numbers from 1 till upper bound.
         If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
         If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
         If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.

         */