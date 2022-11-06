package day17_WhilLoops;
import java.util.Scanner;
public class Login {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String u = "Cydeo";
        String p = "Cydeo123";

        int attempt= 3;

        System.out.println("Please enter Username");
        String username = input.next();
        System.out.println("Please enter password");
        String password = input.next();

        while (!(username.equals("Cydeo")&&password.equals("Cydeo123")) && attempt>1) {
            attempt--;
            System.out.println("Wrong info. Please check");
            System.out.println("You have " + attempt + " attempts left");
            System.out.println("Please enter Username");
             username = input.next();
            System.out.println("Please enter password");
             password = input.next();
        }

        if ((username.equals("Cydeo")&&password.equals("Cydeo123"))) {
            System.out.println("Welcome");
        } else {
            System.out.println("Your account is locked. Please contact customer service");
        }




    }
}
