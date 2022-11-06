package day11_Scanner;
import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter True or False");

        boolean result = input.nextBoolean();

        System.out.println(result);
        input.close();

    }
}
