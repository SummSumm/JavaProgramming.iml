package day12_Scanner;
import java.util.Scanner;
public class CentsDollars {
    public static void main(String[] args) {



    Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents");
        int amount = scan.nextInt();
        int dollars = amount/100;
        int cents = amount%100;

        System.out.println("You have " + dollars + " dollars and " + cents + " cents.");

}
}
