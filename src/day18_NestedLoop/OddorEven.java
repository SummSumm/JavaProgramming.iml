package day18_NestedLoop;
import java.util.Locale;
import java.util.Scanner;
public class OddorEven {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = in.nextInt();

           if (num % 2 == 0) {
                System.out.println("The number is even");
            } else {
                System.out.println("The number is odd");
            }
            System.out.println("Would you like to enter another number?");
            String answer = in.next().toLowerCase();


                while (answer.equals("yes")) {
                    System.out.println("Please enter a number");
                    num = in.nextInt();

                    if (num % 2 == 0) {
                        System.out.println("The number is even");
                    } else {
                        System.out.println("The number is odd");
                    }
                    System.out.println("Would you like to enter another number?");
                    answer = in.next();

                }
                while (!((answer.equals("yes")) || answer.equals("no"))) {
                    System.out.println("Invalid answer. Please re-enter answer");
                    answer = in.next();

                if (answer.equals("no")) {
                    break;

                }in.close();
                }
            }
        }