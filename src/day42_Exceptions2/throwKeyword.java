package day42_Exceptions2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class throwKeyword {
    public static void main(String[] args) {
        System.out.println("Enter age");
        int age = new Scanner(System.in).nextInt();

        if (age<0) {
           throw new InputMismatchException("Age cannot be negative");
        }

        if (age>21) {
            System.out.println("You're eligible");
        } else {
            throw new RuntimeException("You must be at least 21 to vote");
        }
    }
}
