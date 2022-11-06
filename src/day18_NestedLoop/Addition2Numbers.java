package day18_NestedLoop;
import java.util.Locale;
import java.util.Scanner;
public class Addition2Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

        System.out.println("Enter your first number");
        int num1 = input.nextInt();
        System.out.println("Enter your second number");
        int num2 = input.nextInt();

        System.out.println(num1 + num2);
        System.out.println("Would you like to continue?");
        String a = input.next();

        while (!(a.equals("yes") || (a.equals("no")))) {

    System.err.println("Invalid answer, please re-enter");
    a= input.next().toLowerCase();
    }

        if (a.equals("no")) {
            System.out.println("Thank you, good-bye!");
            break;
        }
    }
        input.close();
    }
}
