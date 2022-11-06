package day13_String;
import java.util.Scanner;
public class ThreeLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a three letter word");
        String word = scan.nextLine();

        if (word.length()<3) {
            System.out.println("Too short!");
        } else if (word.length() >3) {
            System.out.println("Too long!");

        } else {

            if (word.charAt(1)=='a'){
                System.out.println("Cool word");
            } else {
                System.out.println("OK word");
            }
        }

        System.out.println("----------------------------------");
        System.out.println("Enter user name");
        String name = scan.next();
        System.out.println("Enter password");
        String password = scan.next();

        if (name.equals("Cydeo") && password.equals("123ab")) {
            System.out.println("Logged in");
        } else {
            System.out.println("Incorrect name or password");
        }
    }
}
