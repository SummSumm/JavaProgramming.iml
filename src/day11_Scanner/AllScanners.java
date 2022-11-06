package day11_Scanner;
import java.util.Scanner;

public class AllScanners {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter full name");
        String name = input.nextLine();


        System.out.println("Enter building number");
        int building = input.nextInt();
        input.nextLine();


        System.out.println("Enter street name");
int street = input.nextInt();
input.nextLine();

        System.out.println("Enter state code");
String state = input.nextLine();

        System.out.println("Enter zip code");
        int zip = input.nextInt();
        input.nextLine();

        System.out.println("Shipping Address for " + name + ": " + building + " " + street  + " Street " + state  + "," + zip );

        input.close();


    }
}
