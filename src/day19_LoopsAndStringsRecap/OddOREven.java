package day19_LoopsAndStringsRecap;
import java.util.Scanner;
public class OddOREven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number");
            int num1 = scan.nextInt();

            if (num1 % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }

            System.out.println("Would you like to enter another number? (yes/no)");
            String a = scan.next();

            if (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))) {
System.exit(0);
            }
            if (a.equalsIgnoreCase("no")) {
                break;}


            }

        }

    }

