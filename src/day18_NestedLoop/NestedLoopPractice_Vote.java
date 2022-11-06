package day18_NestedLoop;
import java.util.Locale;
import java.util.Scanner;
public class NestedLoopPractice_Vote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
        System.out.println("Enter age");
        int age = input.nextInt();

        while(!(age>=1 && age<=120)) {
            System.err.println("Invalid age, please re-enter age below");
             age = input.nextInt();
        }
            System.out.println("Would you like to continue?");
        String answer = input.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("Invalid answer, please re-enter below whether you'd like to continue");
             answer = input.next().toLowerCase();
        }
        if (answer.equals("no")) {
        break;
        }
        }


    }
}
