package day11_Scanner;
import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Age");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter full name");
        String name = input.nextLine();

        System.out.println("Enter GPA");
        double GPA = input.nextDouble();

        input.nextLine();

        System.out.println("Enter School name");
        String school = input.nextLine();

        System.out.println(name + " is " + age + " years old.");
        System.out.println(name + " is a student at " + school + " and has a GPA of " + GPA + ".");

        input.close();
    }
}

