package day11_Scanner;
import java.util.Scanner;
public class NextLineMethod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter name and surname");
        String namsur= input.nextLine();

        System.out.println("Enter your age");
        int age = input.nextInt();

        input.nextLine(); // so that an enter can be given
        System.out.println("Enter School name");
        String school = input.nextLine(); // ama musaade etmeyecek cunku int ten sonra kullandık. so ask for a nextline

        System.out.println("Your name and surname is " + namsur + ".");
        System.out.println(namsur + " is " + age + " years old.");
        System.out.println(namsur + " is a student at " + school + " .");



        input.close();
    }
}
