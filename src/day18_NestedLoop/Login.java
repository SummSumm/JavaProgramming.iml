package day18_NestedLoop;
import java.util.Scanner;
public class Login {

    public static void main(String[] args) {

        /* un = Cydeo
        pw = Cydeo123
        enter credentials
         - matches --> logged in
         - doesn't match - three attempts - logged in/locked
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter username");
        String un = input.next();

        System.out.println("Enter password");
        String pw = input.next();

        if (un.equals("Cydeo") && pw.equals("Cydeo123")) {
            System.out.println("Logged in");
        } else {
            for (int i = 1; i < 3; i++) {
                System.out.println("Incorrect username or password");
                System.out.println("Enter username");
                 un = input.next();

                System.out.println("Enter password");
                 pw = input.next();


                if (un.equals("Cydeo") && pw.equals("Cydeo123")) {
                    System.out.println("Logged in");
                    break;
                }
            } if (!(un.equals("Cydeo") && pw.equals("Cydeo123"))) {
                System.out.println("Account locked. Consult customer Service.");
            }

        } input.close();
    }

}
