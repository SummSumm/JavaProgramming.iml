package Week05;

import java.util.Scanner;

public class OscarSumofNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an upperbound");
        int num = input.nextInt();
        int total = 0;

        for (int i = 0; i < num + 1; i++) {
            total += i;


        }
        System.out.println(total);
input.close();
    }
}
